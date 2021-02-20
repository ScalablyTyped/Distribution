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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileDependencies extends StObject {
  
  var fileDependencies: Set[String] = js.native
  
  var isImportedByNonStylable: Boolean = js.native
  
  var optimize: ClassNameOptimizations = js.native
  
  var runtimeInfo: CalcResult = js.native
  
  var stylableAssetReplacement: js.Array[WebpackAssetModule] = js.native
  
  var stylableMeta: StylableMeta = js.native
  
  var stylableTransformed: Boolean = js.native
  
  var stylableTransformedAst: Root_ = js.native
  
  var stylableTransformedExports: StylableExports = js.native
  
  var usageMapping: Record[String, Boolean] = js.native
  
  var usedStylableModules: js.Array[StylableModule] = js.native
}
object FileDependencies {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FileDependenciesMutableBuilder[Self <: FileDependencies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileDependencies(value: Set[String]): Self = StObject.set(x, "fileDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsImportedByNonStylable(value: Boolean): Self = StObject.set(x, "isImportedByNonStylable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimize(value: ClassNameOptimizations): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeInfo(value: CalcResult): Self = StObject.set(x, "runtimeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableAssetReplacement(value: js.Array[WebpackAssetModule]): Self = StObject.set(x, "stylableAssetReplacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableAssetReplacementVarargs(value: WebpackAssetModule*): Self = StObject.set(x, "stylableAssetReplacement", js.Array(value :_*))
    
    @scala.inline
    def setStylableMeta(value: StylableMeta): Self = StObject.set(x, "stylableMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableTransformed(value: Boolean): Self = StObject.set(x, "stylableTransformed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableTransformedAst(value: Root_): Self = StObject.set(x, "stylableTransformedAst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableTransformedExports(value: StylableExports): Self = StObject.set(x, "stylableTransformedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageMapping(value: Record[String, Boolean]): Self = StObject.set(x, "usageMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedStylableModules(value: js.Array[StylableModule]): Self = StObject.set(x, "usedStylableModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedStylableModulesVarargs(value: StylableModule*): Self = StObject.set(x, "usedStylableModules", js.Array(value :_*))
  }
}
