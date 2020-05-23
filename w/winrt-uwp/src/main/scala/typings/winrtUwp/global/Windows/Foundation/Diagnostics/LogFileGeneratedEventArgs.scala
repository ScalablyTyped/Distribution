package typings.winrtUwp.global.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the LogFileGenerated event. */
@JSGlobal("Windows.Foundation.Diagnostics.LogFileGeneratedEventArgs")
@js.native
abstract class LogFileGeneratedEventArgs ()
  extends typings.winrtUwp.Windows.Foundation.Diagnostics.LogFileGeneratedEventArgs {
  /** Gets the log file. */
  /* CompleteClass */
  override var file: StorageFile = js.native
}

