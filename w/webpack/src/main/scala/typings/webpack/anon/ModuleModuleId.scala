package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleModuleId extends StObject {
  
  var module: typings.webpack.NodeJS.Module
  
  var moduleId: String | Double
}
object ModuleModuleId {
  
  inline def apply(module: typings.webpack.NodeJS.Module, moduleId: String | Double): ModuleModuleId = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleModuleId]
  }
  
  extension [Self <: ModuleModuleId](x: Self) {
    
    inline def setModule(value: typings.webpack.NodeJS.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: String | Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
  }
}
