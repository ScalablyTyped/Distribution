package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the application to asynchronously report that it has completed processing the MediaStreamSource.Starting event. */
trait MediaStreamSourceStartingRequestDeferral extends js.Object {
  /** Reports that the application has completed processing the Starting event. */
  def complete(): Unit
}

object MediaStreamSourceStartingRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): MediaStreamSourceStartingRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[MediaStreamSourceStartingRequestDeferral]
  }
}

