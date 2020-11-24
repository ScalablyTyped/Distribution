package typings.stylableWebpackPlugin.anon

import typings.postcss.mod.Root_
import typings.std.Record
import typings.std.Set
import typings.stylableCore.mod.StylableMeta
import typings.stylableCore.stylableTransformerMod.StylableExports
import typings.stylableWebpackPlugin.typesMod.CalcResult
import typings.stylableWebpackPlugin.typesMod.StylableModule
import typings.stylableWebpackPlugin.typesMod.WebpackAssetModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileDependencies extends js.Object {
  
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
  implicit class FileDependenciesOps[Self <: FileDependencies] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileDependencies(value: Set[String]): Self = this.set("fileDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsImportedByNonStylable(value: Boolean): Self = this.set("isImportedByNonStylable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimize(value: ClassNameOptimizations): Self = this.set("optimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeInfo(value: CalcResult): Self = this.set("runtimeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableAssetReplacementVarargs(value: WebpackAssetModule*): Self = this.set("stylableAssetReplacement", js.Array(value :_*))
    
    @scala.inline
    def setStylableAssetReplacement(value: js.Array[WebpackAssetModule]): Self = this.set("stylableAssetReplacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableMeta(value: StylableMeta): Self = this.set("stylableMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableTransformed(value: Boolean): Self = this.set("stylableTransformed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableTransformedAst(value: Root_): Self = this.set("stylableTransformedAst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylableTransformedExports(value: StylableExports): Self = this.set("stylableTransformedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageMapping(value: Record[String, Boolean]): Self = this.set("usageMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedStylableModulesVarargs(value: StylableModule*): Self = this.set("usedStylableModules", js.Array(value :_*))
    
    @scala.inline
    def setUsedStylableModules(value: js.Array[StylableModule]): Self = this.set("usedStylableModules", value.asInstanceOf[js.Any])
  }
}
