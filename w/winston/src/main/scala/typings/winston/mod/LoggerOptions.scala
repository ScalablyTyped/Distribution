package typings.winston.mod

import typings.logform.mod.Format_
import typings.winston.configMod.AbstractConfigSetLevels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerOptions extends js.Object {
  
  var defaultMeta: js.UndefOr[js.Any] = js.native
  
  var exceptionHandlers: js.UndefOr[js.Any] = js.native
  
  var exitOnError: js.UndefOr[js.Function | Boolean] = js.native
  
  var format: js.UndefOr[Format_] = js.native
  
  var handleExceptions: js.UndefOr[Boolean] = js.native
  
  var level: js.UndefOr[String] = js.native
  
  var levels: js.UndefOr[AbstractConfigSetLevels] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
  
  var transports: js.UndefOr[js.Array[typings.winstonTransport.mod.^] | typings.winstonTransport.mod.^ ] = js.native
}
object LoggerOptions {
  
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  
  @scala.inline
  implicit class LoggerOptionsOps[Self <: LoggerOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultMeta(value: js.Any): Self = this.set("defaultMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMeta: Self = this.set("defaultMeta", js.undefined)
    
    @scala.inline
    def setExceptionHandlers(value: js.Any): Self = this.set("exceptionHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExceptionHandlers: Self = this.set("exceptionHandlers", js.undefined)
    
    @scala.inline
    def setExitOnError(value: js.Function | Boolean): Self = this.set("exitOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitOnError: Self = this.set("exitOnError", js.undefined)
    
    @scala.inline
    def setFormat(value: Format_): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHandleExceptions(value: Boolean): Self = this.set("handleExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleExceptions: Self = this.set("handleExceptions", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLevels(value: AbstractConfigSetLevels): Self = this.set("levels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setTransportsVarargs(value: typings.winstonTransport.mod.^ *): Self = this.set("transports", js.Array(value :_*))
    
    @scala.inline
    def setTransports(value: js.Array[typings.winstonTransport.mod.^] | typings.winstonTransport.mod.^ ): Self = this.set("transports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
  }
}
