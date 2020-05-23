package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an object to be used by the MediaStreamSource.SwitchStreamsRequest event to provide information to the application. */
trait MediaStreamSourceSwitchStreamsRequest extends js.Object {
  /** Gets the stream descriptor for the stream that is now selected by the MediaStreamSource . */
  var newStreamDescriptor: IMediaStreamDescriptor
  /** Gets the stream descriptor for the stream which is no longer selected by the MediaStreamSource . */
  var oldStreamDescriptor: IMediaStreamDescriptor
  /**
    * Defers completing the MediaStreamSource.SwitchStreamsRequested event.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceSwitchStreamsRequestDeferral
}

object MediaStreamSourceSwitchStreamsRequest {
  @scala.inline
  def apply(
    getDeferral: () => MediaStreamSourceSwitchStreamsRequestDeferral,
    newStreamDescriptor: IMediaStreamDescriptor,
    oldStreamDescriptor: IMediaStreamDescriptor
  ): MediaStreamSourceSwitchStreamsRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), newStreamDescriptor = newStreamDescriptor.asInstanceOf[js.Any], oldStreamDescriptor = oldStreamDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequest]
  }
}

