package typings.webpack.mod

import typings.webpack.anon.PartialModuleFactoryCreat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleModuleCreationOptions extends StObject {
  
  /**
  	 * connect the resolved module with the origin module
  	 */
  var connectOrigin: js.UndefOr[Boolean] = js.undefined
  
  var context: js.UndefOr[String] = js.undefined
  
  var contextInfo: js.UndefOr[PartialModuleFactoryCreat] = js.undefined
  
  var dependencies: js.Array[Dependency]
  
  var factory: ModuleFactory
  
  var originModule: Null | Module
  
  /**
  	 * recurse into dependencies of the created module
  	 */
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object HandleModuleCreationOptions {
  
  inline def apply(dependencies: js.Array[Dependency], factory: ModuleFactory): HandleModuleCreationOptions = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], originModule = null)
    __obj.asInstanceOf[HandleModuleCreationOptions]
  }
  
  extension [Self <: HandleModuleCreationOptions](x: Self) {
    
    inline def setConnectOrigin(value: Boolean): Self = StObject.set(x, "connectOrigin", value.asInstanceOf[js.Any])
    
    inline def setConnectOriginUndefined: Self = StObject.set(x, "connectOrigin", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextInfo(value: PartialModuleFactoryCreat): Self = StObject.set(x, "contextInfo", value.asInstanceOf[js.Any])
    
    inline def setContextInfoUndefined: Self = StObject.set(x, "contextInfo", js.undefined)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setFactory(value: ModuleFactory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setOriginModule(value: Module): Self = StObject.set(x, "originModule", value.asInstanceOf[js.Any])
    
    inline def setOriginModuleNull: Self = StObject.set(x, "originModule", null)
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
