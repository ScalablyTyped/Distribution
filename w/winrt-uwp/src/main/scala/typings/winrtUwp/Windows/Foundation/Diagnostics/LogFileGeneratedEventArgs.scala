package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the LogFileGenerated event. */
@js.native
trait LogFileGeneratedEventArgs extends js.Object {
  
  /** Gets the log file. */
  var file: StorageFile = js.native
}
object LogFileGeneratedEventArgs {
  
  @scala.inline
  def apply(file: StorageFile): LogFileGeneratedEventArgs = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogFileGeneratedEventArgs]
  }
  
  @scala.inline
  implicit class LogFileGeneratedEventArgsOps[Self <: LogFileGeneratedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFile(value: StorageFile): Self = this.set("file", value.asInstanceOf[js.Any])
  }
}
