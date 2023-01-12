package typings.webpack.mod

import typings.webpack.anon.PartialModuleFactoryCreat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FactorizeModuleOptions extends StObject {
  
  var context: js.UndefOr[String] = js.undefined
  
  var contextInfo: js.UndefOr[PartialModuleFactoryCreat] = js.undefined
  
  var currentProfile: ModuleProfile
  
  var dependencies: js.Array[Dependency]
  
  var factory: ModuleFactory
  
  /**
  	 * return full ModuleFactoryResult instead of only module
  	 */
  var factoryResult: js.UndefOr[Boolean] = js.undefined
  
  var originModule: Null | Module
}
object FactorizeModuleOptions {
  
  inline def apply(currentProfile: ModuleProfile, dependencies: js.Array[Dependency], factory: ModuleFactory): FactorizeModuleOptions = {
    val __obj = js.Dynamic.literal(currentProfile = currentProfile.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], originModule = null)
    __obj.asInstanceOf[FactorizeModuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FactorizeModuleOptions] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextInfo(value: PartialModuleFactoryCreat): Self = StObject.set(x, "contextInfo", value.asInstanceOf[js.Any])
    
    inline def setContextInfoUndefined: Self = StObject.set(x, "contextInfo", js.undefined)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCurrentProfile(value: ModuleProfile): Self = StObject.set(x, "currentProfile", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setFactory(value: ModuleFactory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryResult(value: Boolean): Self = StObject.set(x, "factoryResult", value.asInstanceOf[js.Any])
    
    inline def setFactoryResultUndefined: Self = StObject.set(x, "factoryResult", js.undefined)
    
    inline def setOriginModule(value: Module): Self = StObject.set(x, "originModule", value.asInstanceOf[js.Any])
    
    inline def setOriginModuleNull: Self = StObject.set(x, "originModule", null)
  }
}
