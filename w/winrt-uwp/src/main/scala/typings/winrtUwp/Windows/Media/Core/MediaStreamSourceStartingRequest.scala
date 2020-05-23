package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a request from the MediaStreamSource.Starting event for the application to start accumulating MediaStreamSample objects from a specific position in the media. */
trait MediaStreamSourceStartingRequest extends js.Object {
  /** Specifies a reference to a TimeSpan object which represents a time position in the media time-line from which the application should return MediaStreamSample objects. */
  var startPosition: Double
  /**
    * Defers completing the MediaStreamSource.Starting event.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceStartingRequestDeferral
  /**
    * Specifies the starting position in the media time-line for subsequent MediaStreamSamples that will be delivered to the MediaStreamSource .
    * @param position The actual starting point in the media time-line chosen by the application.
    */
  def setActualStartPosition(position: Double): Unit
}

object MediaStreamSourceStartingRequest {
  @scala.inline
  def apply(
    getDeferral: () => MediaStreamSourceStartingRequestDeferral,
    setActualStartPosition: Double => Unit,
    startPosition: Double
  ): MediaStreamSourceStartingRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), setActualStartPosition = js.Any.fromFunction1(setActualStartPosition), startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceStartingRequest]
  }
}

