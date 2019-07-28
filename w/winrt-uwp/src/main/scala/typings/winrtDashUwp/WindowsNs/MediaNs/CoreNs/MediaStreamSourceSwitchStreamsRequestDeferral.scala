package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the application to asynchronously report that it has completed the MediaStreamSource.SwitchStreamsRequested event. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceSwitchStreamsRequestDeferral")
@js.native
abstract class MediaStreamSourceSwitchStreamsRequestDeferral () extends js.Object {
  /** Reports that the application has completed processing the MediaStreamSource.SwitchStreamsRequested event. */
  def complete(): Unit = js.native
}

