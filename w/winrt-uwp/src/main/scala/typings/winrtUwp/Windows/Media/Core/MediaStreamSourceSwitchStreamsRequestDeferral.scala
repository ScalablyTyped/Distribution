package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the application to asynchronously report that it has completed the MediaStreamSource.SwitchStreamsRequested event. */
trait MediaStreamSourceSwitchStreamsRequestDeferral extends js.Object {
  /** Reports that the application has completed processing the MediaStreamSource.SwitchStreamsRequested event. */
  def complete(): Unit
}

object MediaStreamSourceSwitchStreamsRequestDeferral {
  @scala.inline
  def apply(complete: () => Unit): MediaStreamSourceSwitchStreamsRequestDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequestDeferral]
  }
}

