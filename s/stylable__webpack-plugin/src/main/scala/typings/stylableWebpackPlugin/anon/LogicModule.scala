package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.typesMod.StylableModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogicModule extends js.Object {
  
  var logicModule: StylableModule = js.native
  
  var stylableModule: StylableModule = js.native
}
object LogicModule {
  
  @scala.inline
  def apply(logicModule: StylableModule, stylableModule: StylableModule): LogicModule = {
    val __obj = js.Dynamic.literal(logicModule = logicModule.asInstanceOf[js.Any], stylableModule = stylableModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicModule]
  }
  
  @scala.inline
  implicit class LogicModuleOps[Self <: LogicModule] (val x: Self) extends AnyVal {
    
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
    def setLogicModule(value: StylableModule): Self = this.set("logicModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableModule(value: StylableModule): Self = this.set("stylableModule", value.asInstanceOf[js.Any])
  }
}
