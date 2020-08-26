package typings.webpackBundleAnalyzer.mod

import typings.std.Plugin
import typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-bundle-analyzer", "BundleAnalyzerPlugin")
@js.native
class BundleAnalyzerPlugin_ () extends Plugin {
  def this(options: Options) = this()
  @JSName("apply")
  def apply(
    compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
  ): Unit = js.native
}

