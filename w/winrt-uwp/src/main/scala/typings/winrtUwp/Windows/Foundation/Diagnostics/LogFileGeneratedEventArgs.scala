package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the LogFileGenerated event. */
trait LogFileGeneratedEventArgs extends js.Object {
  /** Gets the log file. */
  var file: StorageFile
}

object LogFileGeneratedEventArgs {
  @scala.inline
  def apply(file: StorageFile): LogFileGeneratedEventArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogFileGeneratedEventArgs]
  }
}

