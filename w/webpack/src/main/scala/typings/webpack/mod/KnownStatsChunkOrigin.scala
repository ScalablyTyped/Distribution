package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsChunkOrigin extends StObject {
  
  var loc: js.UndefOr[String] = js.undefined
  
  var module: js.UndefOr[String] = js.undefined
  
  var moduleId: js.UndefOr[String | Double] = js.undefined
  
  var moduleIdentifier: js.UndefOr[String] = js.undefined
  
  var moduleName: js.UndefOr[String] = js.undefined
  
  var request: js.UndefOr[String] = js.undefined
}
object KnownStatsChunkOrigin {
  
  inline def apply(): KnownStatsChunkOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownStatsChunkOrigin]
  }
  
  extension [Self <: KnownStatsChunkOrigin](x: Self) {
    
    inline def setLoc(value: String): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: String | Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    inline def setModuleIdentifier(value: String): Self = StObject.set(x, "moduleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setModuleIdentifierUndefined: Self = StObject.set(x, "moduleIdentifier", js.undefined)
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameUndefined: Self = StObject.set(x, "moduleName", js.undefined)
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
