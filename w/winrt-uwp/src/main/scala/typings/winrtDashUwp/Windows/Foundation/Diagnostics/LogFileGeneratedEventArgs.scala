package typings.winrtDashUwp.Windows.Foundation.Diagnostics

import typings.winrtDashUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the LogFileGenerated event. */
@JSGlobal("Windows.Foundation.Diagnostics.LogFileGeneratedEventArgs")
@js.native
abstract class LogFileGeneratedEventArgs () extends js.Object {
  /** Gets the log file. */
  var file: StorageFile = js.native
}

