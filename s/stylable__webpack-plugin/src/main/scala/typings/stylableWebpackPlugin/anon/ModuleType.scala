package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleType extends StObject {
  
  var module: Type
}
object ModuleType {
  
  inline def apply(module: Type): ModuleType = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleType]
  }
  
  extension [Self <: ModuleType](x: Self) {
    
    inline def setModule(value: Type): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}
