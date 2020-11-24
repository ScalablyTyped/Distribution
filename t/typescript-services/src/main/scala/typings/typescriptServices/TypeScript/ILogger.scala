package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILogger extends js.Object {
  
  def debug(): Boolean = js.native
  
  def error(): Boolean = js.native
  
  def fatal(): Boolean = js.native
  
  def information(): Boolean = js.native
  
  def log(s: String): Unit = js.native
  
  def warning(): Boolean = js.native
}
object ILogger {
  
  @scala.inline
  def apply(
    debug: () => Boolean,
    error: () => Boolean,
    fatal: () => Boolean,
    information: () => Boolean,
    log: String => Unit,
    warning: () => Boolean
  ): ILogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), warning = js.Any.fromFunction0(warning))
    __obj.asInstanceOf[ILogger]
  }
  
  @scala.inline
  implicit class ILoggerOps[Self <: ILogger] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: () => Boolean): Self = this.set("debug", js.Any.fromFunction0(value))
    
    @scala.inline
    def setError(value: () => Boolean): Self = this.set("error", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFatal(value: () => Boolean): Self = this.set("fatal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInformation(value: () => Boolean): Self = this.set("information", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLog(value: String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarning(value: () => Boolean): Self = this.set("warning", js.Any.fromFunction0(value))
  }
}
