package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleFactoryCreateData extends StObject {
  
  var context: String
  
  var contextInfo: ModuleFactoryCreateDataContextInfo
  
  var dependencies: js.Array[Dependency]
  
  var resolveOptions: js.UndefOr[ResolveOptionsWebpackOptions] = js.undefined
}
object ModuleFactoryCreateData {
  
  inline def apply(
    context: String,
    contextInfo: ModuleFactoryCreateDataContextInfo,
    dependencies: js.Array[Dependency]
  ): ModuleFactoryCreateData = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], contextInfo = contextInfo.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleFactoryCreateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModuleFactoryCreateData] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextInfo(value: ModuleFactoryCreateDataContextInfo): Self = StObject.set(x, "contextInfo", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setResolveOptions(value: ResolveOptionsWebpackOptions): Self = StObject.set(x, "resolveOptions", value.asInstanceOf[js.Any])
    
    inline def setResolveOptionsUndefined: Self = StObject.set(x, "resolveOptions", js.undefined)
  }
}
