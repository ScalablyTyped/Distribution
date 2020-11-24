package typings.webgme.GmePanel

import typings.webgme.GmeConfig.GmeConfig
import typings.webgme.GmeConfig.LogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends js.Object {
  
  def createLogger(name: String, options: LogOptions): Logger = js.native
  
  def createWithGmeConfig(name: String, gmeConfig: GmeConfig): Logger = js.native
}
object Logger {
  
  @scala.inline
  def apply(createLogger: (String, LogOptions) => Logger, createWithGmeConfig: (String, GmeConfig) => Logger): Logger = {
    val __obj = js.Dynamic.literal(createLogger = js.Any.fromFunction2(createLogger), createWithGmeConfig = js.Any.fromFunction2(createWithGmeConfig))
    __obj.asInstanceOf[Logger]
  }
  
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
    
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
    def setCreateLogger(value: (String, LogOptions) => Logger): Self = this.set("createLogger", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateWithGmeConfig(value: (String, GmeConfig) => Logger): Self = this.set("createWithGmeConfig", js.Any.fromFunction2(value))
  }
}
