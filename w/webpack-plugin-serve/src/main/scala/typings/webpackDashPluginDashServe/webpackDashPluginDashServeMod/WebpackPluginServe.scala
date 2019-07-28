package typings.webpackDashPluginDashServe.webpackDashPluginDashServeMod

import typings.webpack.webpackMod.Compiler
import typings.webpackDashPluginDashServe.Anon_Apply
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-plugin-serve", "WebpackPluginServe")
@js.native
class WebpackPluginServe () extends js.Object {
  def this(opts: WebpackPluginServeOptions) = this()
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  def attach(): Anon_Apply = js.native
  def hook(compiler: Compiler): Unit = js.native
}

