package typings.webpackBundleAnalyzer.mod

import typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackPluginInstance * / any */ @JSImport("webpack-bundle-analyzer", "BundleAnalyzerPlugin")
@js.native
class BundleAnalyzerPlugin_ () extends js.Object {
  def this(options: Options) = this()
  
  @JSName("apply")
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
  ): Unit = js.native
}
