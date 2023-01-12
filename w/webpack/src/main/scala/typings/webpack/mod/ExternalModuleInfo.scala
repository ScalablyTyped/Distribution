package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalModuleInfo
  extends StObject
     with ModuleInfo {
  
  var index: Double
  
  var module: Module
}
object ExternalModuleInfo {
  
  inline def apply(index: Double, module: Module): ExternalModuleInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalModuleInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalModuleInfo] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
  }
}
