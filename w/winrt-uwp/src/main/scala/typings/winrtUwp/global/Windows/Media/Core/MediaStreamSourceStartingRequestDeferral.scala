package typings.winrtUwp.global.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way for the application to asynchronously report that it has completed processing the MediaStreamSource.Starting event. */
@JSGlobal("Windows.Media.Core.MediaStreamSourceStartingRequestDeferral")
@js.native
abstract class MediaStreamSourceStartingRequestDeferral ()
  extends typings.winrtUwp.Windows.Media.Core.MediaStreamSourceStartingRequestDeferral {
  /** Reports that the application has completed processing the Starting event. */
  /* CompleteClass */
  override def complete(): Unit = js.native
}

