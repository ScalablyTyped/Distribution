package typings
package webpackDashPluginDashServeLib.webpackDashPluginDashServeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-plugin-serve", "WebpackPluginServe")
@js.native
class WebpackPluginServe () extends js.Object {
  def this(opts: WebpackPluginServeOptions) = this()
  @JSName("apply")
  def apply(compiler: webpackLib.webpackMod.Compiler): scala.Unit = js.native
  def attach(): webpackDashPluginDashServeLib.Anon_Apply = js.native
  def hook(compiler: webpackLib.webpackMod.Compiler): scala.Unit = js.native
}

