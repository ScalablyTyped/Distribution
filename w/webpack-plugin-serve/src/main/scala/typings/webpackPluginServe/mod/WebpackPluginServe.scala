package typings.webpackPluginServe.mod

import typings.webpackPluginServe.anon.Apply
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-plugin-serve", "WebpackPluginServe")
@js.native
class WebpackPluginServe[Compiler] () extends js.Object {
  def this(opts: WebpackPluginServeOptions) = this()
  
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  def attach(): Apply[Compiler] = js.native
  
  def hook(compiler: Compiler): Unit = js.native
}
