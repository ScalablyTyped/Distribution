package typings.webpack.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleFactoryResult extends StObject {
  
  /**
  	 * allow to use the unsafe cache
  	 */
  var cacheable: js.UndefOr[Boolean] = js.undefined
  
  var contextDependencies: js.UndefOr[Set[String]] = js.undefined
  
  var fileDependencies: js.UndefOr[Set[String]] = js.undefined
  
  var missingDependencies: js.UndefOr[Set[String]] = js.undefined
  
  /**
  	 * the created module or unset if no module was created
  	 */
  var module: js.UndefOr[Module] = js.undefined
}
object ModuleFactoryResult {
  
  inline def apply(): ModuleFactoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModuleFactoryResult]
  }
  
  extension [Self <: ModuleFactoryResult](x: Self) {
    
    inline def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    inline def setCacheableUndefined: Self = StObject.set(x, "cacheable", js.undefined)
    
    inline def setContextDependencies(value: Set[String]): Self = StObject.set(x, "contextDependencies", value.asInstanceOf[js.Any])
    
    inline def setContextDependenciesUndefined: Self = StObject.set(x, "contextDependencies", js.undefined)
    
    inline def setFileDependencies(value: Set[String]): Self = StObject.set(x, "fileDependencies", value.asInstanceOf[js.Any])
    
    inline def setFileDependenciesUndefined: Self = StObject.set(x, "fileDependencies", js.undefined)
    
    inline def setMissingDependencies(value: Set[String]): Self = StObject.set(x, "missingDependencies", value.asInstanceOf[js.Any])
    
    inline def setMissingDependenciesUndefined: Self = StObject.set(x, "missingDependencies", js.undefined)
    
    inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
  }
}
