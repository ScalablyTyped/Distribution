package typings.webpack.anon

import typings.webpack.mod.ModuleFactory
import typings.webpack.mod.ModuleProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webpack.webpack.FactorizeModuleOptions & {  factoryResult :false | undefined} */
trait FactorizeModuleOptionsfac extends StObject {
  
  var context: js.UndefOr[String] = js.undefined
  
  var contextInfo: js.UndefOr[PartialModuleFactoryCreat] = js.undefined
  
  var currentProfile: ModuleProfile
  
  var dependencies: js.Array[typings.webpack.mod.Dependency]
  
  var factory: ModuleFactory
  
  /**
  	 * return full ModuleFactoryResult instead of only module
  	 */
  var factoryResult: js.UndefOr[Boolean] = js.undefined
  
  var originModule: Null | typings.webpack.mod.Module
}
object FactorizeModuleOptionsfac {
  
  inline def apply(
    currentProfile: ModuleProfile,
    dependencies: js.Array[typings.webpack.mod.Dependency],
    factory: ModuleFactory
  ): FactorizeModuleOptionsfac = {
    val __obj = js.Dynamic.literal(currentProfile = currentProfile.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], originModule = null)
    __obj.asInstanceOf[FactorizeModuleOptionsfac]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FactorizeModuleOptionsfac] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextInfo(value: PartialModuleFactoryCreat): Self = StObject.set(x, "contextInfo", value.asInstanceOf[js.Any])
    
    inline def setContextInfoUndefined: Self = StObject.set(x, "contextInfo", js.undefined)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCurrentProfile(value: ModuleProfile): Self = StObject.set(x, "currentProfile", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: js.Array[typings.webpack.mod.Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: typings.webpack.mod.Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setFactory(value: ModuleFactory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryResult(value: Boolean): Self = StObject.set(x, "factoryResult", value.asInstanceOf[js.Any])
    
    inline def setFactoryResultUndefined: Self = StObject.set(x, "factoryResult", js.undefined)
    
    inline def setOriginModule(value: typings.webpack.mod.Module): Self = StObject.set(x, "originModule", value.asInstanceOf[js.Any])
    
    inline def setOriginModuleNull: Self = StObject.set(x, "originModule", null)
  }
}
