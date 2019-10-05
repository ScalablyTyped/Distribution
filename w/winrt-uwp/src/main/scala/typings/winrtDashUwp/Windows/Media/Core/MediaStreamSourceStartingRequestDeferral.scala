package typings.winrtDashUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the application to asynchronously report that it has completed processing the MediaStreamSource.Starting event. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceStartingRequestDeferral")
@js.native
abstract class MediaStreamSourceStartingRequestDeferral () extends js.Object {
  /** Reports that the application has completed processing the Starting event. */
  def complete(): Unit = js.native
}

