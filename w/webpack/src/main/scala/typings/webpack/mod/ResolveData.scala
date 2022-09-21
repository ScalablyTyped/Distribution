package typings.webpack.mod

import typings.std.Record
import typings.webpack.anon.PartialNormalModuleCreate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveData extends StObject {
  
  var assertions: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
  	 * allow to use the unsafe cache
  	 */
  var cacheable: Boolean
  
  var context: String
  
  var contextDependencies: LazySet[String]
  
  var contextInfo: ModuleFactoryCreateDataContextInfo
  
  var createData: PartialNormalModuleCreate
  
  var dependencies: js.Array[ModuleDependency]
  
  var dependencyType: String
  
  var fileDependencies: LazySet[String]
  
  var missingDependencies: LazySet[String]
  
  var request: String
  
  var resolveOptions: js.UndefOr[ResolveOptionsWebpackOptions] = js.undefined
}
object ResolveData {
  
  inline def apply(
    cacheable: Boolean,
    context: String,
    contextDependencies: LazySet[String],
    contextInfo: ModuleFactoryCreateDataContextInfo,
    createData: PartialNormalModuleCreate,
    dependencies: js.Array[ModuleDependency],
    dependencyType: String,
    fileDependencies: LazySet[String],
    missingDependencies: LazySet[String],
    request: String
  ): ResolveData = {
    val __obj = js.Dynamic.literal(cacheable = cacheable.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], contextDependencies = contextDependencies.asInstanceOf[js.Any], contextInfo = contextInfo.asInstanceOf[js.Any], createData = createData.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], dependencyType = dependencyType.asInstanceOf[js.Any], fileDependencies = fileDependencies.asInstanceOf[js.Any], missingDependencies = missingDependencies.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveData]
  }
  
  extension [Self <: ResolveData](x: Self) {
    
    inline def setAssertions(value: Record[String, Any]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setAssertionsUndefined: Self = StObject.set(x, "assertions", js.undefined)
    
    inline def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextDependencies(value: LazySet[String]): Self = StObject.set(x, "contextDependencies", value.asInstanceOf[js.Any])
    
    inline def setContextInfo(value: ModuleFactoryCreateDataContextInfo): Self = StObject.set(x, "contextInfo", value.asInstanceOf[js.Any])
    
    inline def setCreateData(value: PartialNormalModuleCreate): Self = StObject.set(x, "createData", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: js.Array[ModuleDependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: ModuleDependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDependencyType(value: String): Self = StObject.set(x, "dependencyType", value.asInstanceOf[js.Any])
    
    inline def setFileDependencies(value: LazySet[String]): Self = StObject.set(x, "fileDependencies", value.asInstanceOf[js.Any])
    
    inline def setMissingDependencies(value: LazySet[String]): Self = StObject.set(x, "missingDependencies", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResolveOptions(value: ResolveOptionsWebpackOptions): Self = StObject.set(x, "resolveOptions", value.asInstanceOf[js.Any])
    
    inline def setResolveOptionsUndefined: Self = StObject.set(x, "resolveOptions", js.undefined)
  }
}
