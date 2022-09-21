package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsModuleReason extends StObject {
  
  var active: Boolean
  
  var explanation: js.UndefOr[String] = js.undefined
  
  var loc: js.UndefOr[String] = js.undefined
  
  var module: js.UndefOr[String] = js.undefined
  
  var moduleId: js.UndefOr[String | Double] = js.undefined
  
  var moduleIdentifier: js.UndefOr[String] = js.undefined
  
  var moduleName: js.UndefOr[String] = js.undefined
  
  var resolvedModule: js.UndefOr[String] = js.undefined
  
  var resolvedModuleId: js.UndefOr[String | Double] = js.undefined
  
  var resolvedModuleIdentifier: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var userRequest: js.UndefOr[String] = js.undefined
}
object KnownStatsModuleReason {
  
  inline def apply(active: Boolean): KnownStatsModuleReason = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownStatsModuleReason]
  }
  
  extension [Self <: KnownStatsModuleReason](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setExplanation(value: String): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
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
    
    inline def setResolvedModule(value: String): Self = StObject.set(x, "resolvedModule", value.asInstanceOf[js.Any])
    
    inline def setResolvedModuleId(value: String | Double): Self = StObject.set(x, "resolvedModuleId", value.asInstanceOf[js.Any])
    
    inline def setResolvedModuleIdUndefined: Self = StObject.set(x, "resolvedModuleId", js.undefined)
    
    inline def setResolvedModuleIdentifier(value: String): Self = StObject.set(x, "resolvedModuleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResolvedModuleIdentifierUndefined: Self = StObject.set(x, "resolvedModuleIdentifier", js.undefined)
    
    inline def setResolvedModuleUndefined: Self = StObject.set(x, "resolvedModule", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserRequest(value: String): Self = StObject.set(x, "userRequest", value.asInstanceOf[js.Any])
    
    inline def setUserRequestUndefined: Self = StObject.set(x, "userRequest", js.undefined)
  }
}
