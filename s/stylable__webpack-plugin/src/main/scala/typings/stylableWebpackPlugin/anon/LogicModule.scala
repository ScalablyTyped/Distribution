package typings.stylableWebpackPlugin.anon

import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogicModule extends StObject {
  
  var logicModule: StylableModule
  
  var stylableModule: StylableModule
}
object LogicModule {
  
  inline def apply(logicModule: StylableModule, stylableModule: StylableModule): LogicModule = {
    val __obj = js.Dynamic.literal(logicModule = logicModule.asInstanceOf[js.Any], stylableModule = stylableModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicModule]
  }
  
  extension [Self <: LogicModule](x: Self) {
    
    inline def setLogicModule(value: StylableModule): Self = StObject.set(x, "logicModule", value.asInstanceOf[js.Any])
    
    inline def setStylableModule(value: StylableModule): Self = StObject.set(x, "stylableModule", value.asInstanceOf[js.Any])
  }
}
