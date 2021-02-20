package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogicModule extends StObject {
  
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
  implicit class LogicModuleMutableBuilder[Self <: LogicModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogicModule(value: StylableModule): Self = StObject.set(x, "logicModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableModule(value: StylableModule): Self = StObject.set(x, "stylableModule", value.asInstanceOf[js.Any])
  }
}
