package typings.stylableWebpackPlugin.anon

import typings.postcss.mod.Root_
import typings.std.Record
import typings.std.Set
import typings.stylableCore.mod.StylableMeta
import typings.stylableCore.stylableTransformerMod.StylableExports
import typings.stylableWebpackPlugin.typesMod.CalcResult
import typings.stylableWebpackPlugin.typesMod.StylableModule
import typings.stylableWebpackPlugin.typesMod.WebpackAssetModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileDependencies extends StObject {
  
  var fileDependencies: Set[String]
  
  var isImportedByNonStylable: Boolean
  
  var optimize: ClassNameOptimizations
  
  var runtimeInfo: CalcResult
  
  var stylableAssetReplacement: js.Array[WebpackAssetModule]
  
  var stylableMeta: StylableMeta
  
  var stylableTransformed: Boolean
  
  var stylableTransformedAst: Root_
  
  var stylableTransformedExports: StylableExports
  
  var usageMapping: Record[String, Boolean]
  
  var usedStylableModules: js.Array[StylableModule]
}
object FileDependencies {
  
  inline def apply(
    fileDependencies: Set[String],
    isImportedByNonStylable: Boolean,
    optimize: ClassNameOptimizations,
    runtimeInfo: CalcResult,
    stylableAssetReplacement: js.Array[WebpackAssetModule],
    stylableMeta: StylableMeta,
    stylableTransformed: Boolean,
    stylableTransformedAst: Root_,
    stylableTransformedExports: StylableExports,
    usageMapping: Record[String, Boolean],
    usedStylableModules: js.Array[StylableModule]
  ): FileDependencies = {
    val __obj = js.Dynamic.literal(fileDependencies = fileDependencies.asInstanceOf[js.Any], isImportedByNonStylable = isImportedByNonStylable.asInstanceOf[js.Any], optimize = optimize.asInstanceOf[js.Any], runtimeInfo = runtimeInfo.asInstanceOf[js.Any], stylableAssetReplacement = stylableAssetReplacement.asInstanceOf[js.Any], stylableMeta = stylableMeta.asInstanceOf[js.Any], stylableTransformed = stylableTransformed.asInstanceOf[js.Any], stylableTransformedAst = stylableTransformedAst.asInstanceOf[js.Any], stylableTransformedExports = stylableTransformedExports.asInstanceOf[js.Any], usageMapping = usageMapping.asInstanceOf[js.Any], usedStylableModules = usedStylableModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileDependencies]
  }
  
  extension [Self <: FileDependencies](x: Self) {
    
    inline def setFileDependencies(value: Set[String]): Self = StObject.set(x, "fileDependencies", value.asInstanceOf[js.Any])
    
    inline def setIsImportedByNonStylable(value: Boolean): Self = StObject.set(x, "isImportedByNonStylable", value.asInstanceOf[js.Any])
    
    inline def setOptimize(value: ClassNameOptimizations): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
    
    inline def setRuntimeInfo(value: CalcResult): Self = StObject.set(x, "runtimeInfo", value.asInstanceOf[js.Any])
    
    inline def setStylableAssetReplacement(value: js.Array[WebpackAssetModule]): Self = StObject.set(x, "stylableAssetReplacement", value.asInstanceOf[js.Any])
    
    inline def setStylableAssetReplacementVarargs(value: WebpackAssetModule*): Self = StObject.set(x, "stylableAssetReplacement", js.Array(value :_*))
    
    inline def setStylableMeta(value: StylableMeta): Self = StObject.set(x, "stylableMeta", value.asInstanceOf[js.Any])
    
    inline def setStylableTransformed(value: Boolean): Self = StObject.set(x, "stylableTransformed", value.asInstanceOf[js.Any])
    
    inline def setStylableTransformedAst(value: Root_): Self = StObject.set(x, "stylableTransformedAst", value.asInstanceOf[js.Any])
    
    inline def setStylableTransformedExports(value: StylableExports): Self = StObject.set(x, "stylableTransformedExports", value.asInstanceOf[js.Any])
    
    inline def setUsageMapping(value: Record[String, Boolean]): Self = StObject.set(x, "usageMapping", value.asInstanceOf[js.Any])
    
    inline def setUsedStylableModules(value: js.Array[StylableModule]): Self = StObject.set(x, "usedStylableModules", value.asInstanceOf[js.Any])
    
    inline def setUsedStylableModulesVarargs(value: StylableModule*): Self = StObject.set(x, "usedStylableModules", js.Array(value :_*))
  }
}
