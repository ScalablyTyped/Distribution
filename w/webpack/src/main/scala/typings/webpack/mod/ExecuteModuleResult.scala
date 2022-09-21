package typings.webpack.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteModuleResult extends StObject {
  
  var assets: Map[String, typings.webpack.anon.Source]
  
  var buildDependencies: LazySet[String]
  
  var cacheable: Boolean
  
  var contextDependencies: LazySet[String]
  
  var exports: Any
  
  var fileDependencies: LazySet[String]
  
  var missingDependencies: LazySet[String]
}
object ExecuteModuleResult {
  
  inline def apply(
    assets: Map[String, typings.webpack.anon.Source],
    buildDependencies: LazySet[String],
    cacheable: Boolean,
    contextDependencies: LazySet[String],
    exports: Any,
    fileDependencies: LazySet[String],
    missingDependencies: LazySet[String]
  ): ExecuteModuleResult = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], buildDependencies = buildDependencies.asInstanceOf[js.Any], cacheable = cacheable.asInstanceOf[js.Any], contextDependencies = contextDependencies.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], fileDependencies = fileDependencies.asInstanceOf[js.Any], missingDependencies = missingDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteModuleResult]
  }
  
  extension [Self <: ExecuteModuleResult](x: Self) {
    
    inline def setAssets(value: Map[String, typings.webpack.anon.Source]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setBuildDependencies(value: LazySet[String]): Self = StObject.set(x, "buildDependencies", value.asInstanceOf[js.Any])
    
    inline def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    inline def setContextDependencies(value: LazySet[String]): Self = StObject.set(x, "contextDependencies", value.asInstanceOf[js.Any])
    
    inline def setExports(value: Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setFileDependencies(value: LazySet[String]): Self = StObject.set(x, "fileDependencies", value.asInstanceOf[js.Any])
    
    inline def setMissingDependencies(value: LazySet[String]): Self = StObject.set(x, "missingDependencies", value.asInstanceOf[js.Any])
  }
}
