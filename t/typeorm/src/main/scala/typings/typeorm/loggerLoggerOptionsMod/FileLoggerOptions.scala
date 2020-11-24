package typings.typeorm.loggerLoggerOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileLoggerOptions extends js.Object {
  
  /**
    * Specify custom path for log file, relative to application root
    */
  var logPath: String = js.native
}
object FileLoggerOptions {
  
  @scala.inline
  def apply(logPath: String): FileLoggerOptions = {
    val __obj = js.Dynamic.literal(logPath = logPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLoggerOptions]
  }
  
  @scala.inline
  implicit class FileLoggerOptionsOps[Self <: FileLoggerOptions] (val x: Self) extends AnyVal {
    
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
    def setLogPath(value: String): Self = this.set("logPath", value.asInstanceOf[js.Any])
  }
}
