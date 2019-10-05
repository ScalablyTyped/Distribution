package typings.winrtDashUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the application to asynchronously report that it has completed retrieving the MediaStreamSample . */
@JSGlobal("Windows.Media.Core.MediaStreamSourceSampleRequestDeferral")
@js.native
abstract class MediaStreamSourceSampleRequestDeferral () extends js.Object {
  /** Reports that the application has completed retrieving the MediaStreamSample . */
  def complete(): Unit = js.native
}

