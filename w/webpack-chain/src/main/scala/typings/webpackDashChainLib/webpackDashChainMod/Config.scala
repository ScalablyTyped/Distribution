package typings
package webpackDashChainLib.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config
  extends webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs.TypedChainedMap[scala.Unit, js.Any] {
  @JSName("devServer")
  var devServer_Original: webpackDashChainLib.webpackDashChainMod.ConfigNs.DevServer = js.native
  var entryPoints: webpackDashChainLib.webpackDashChainMod.ConfigNs.TypedChainedMap[Config, webpackDashChainLib.webpackDashChainMod.ConfigNs.EntryPoint] = js.native
  var module: webpackDashChainLib.webpackDashChainMod.ConfigNs.Module = js.native
  var node: webpackDashChainLib.webpackDashChainMod.ConfigNs.ChainedMap[this.type] = js.native
  var optimization: webpackDashChainLib.webpackDashChainMod.ConfigNs.Optimization = js.native
  var output: webpackDashChainLib.webpackDashChainMod.ConfigNs.Output = js.native
  var performance: webpackDashChainLib.webpackDashChainMod.ConfigNs.Performance = js.native
  var plugins: webpackDashChainLib.webpackDashChainMod.ConfigNs.Plugins[this.type] = js.native
  var resolve: webpackDashChainLib.webpackDashChainMod.ConfigNs.Resolve = js.native
  var resolveLoader: webpackDashChainLib.webpackDashChainMod.ConfigNs.ResolveLoader = js.native
  def amd(value: ScalablyTyped.runtime.StringDictionary[scala.Boolean]): this.type = js.native
  def bail(value: scala.Boolean): this.type = js.native
  def cache(value: js.Any): this.type = js.native
  def cache(value: scala.Boolean): this.type = js.native
  def context(value: java.lang.String): this.type = js.native
  def devServer(value: java.lang.String): this.type = js.native
  def devtool(value: webpackDashChainLib.webpackDashChainMod.ConfigNs.DevTool): this.type = js.native
  def entry(name: java.lang.String): webpackDashChainLib.webpackDashChainMod.ConfigNs.EntryPoint = js.native
  def externals(value: js.Array[webpackLib.webpackMod.webpackNs.ExternalsElement]): this.type = js.native
  def externals(value: webpackLib.webpackMod.webpackNs.ExternalsElement): this.type = js.native
  def loader(value: js.Any): this.type = js.native
  def plugin(name: java.lang.String): webpackDashChainLib.webpackDashChainMod.ConfigNs.Plugin[this.type] = js.native
  def profile(value: scala.Boolean): this.type = js.native
  def recordsInputPath(value: java.lang.String): this.type = js.native
  def recordsOutputPath(value: java.lang.String): this.type = js.native
  def recordsPath(value: java.lang.String): this.type = js.native
  def stats(value: webpackLib.webpackMod.webpackNs.OptionsNs.Stats): this.type = js.native
  def target(value: java.lang.String): this.type = js.native
  def toConfig(): webpackLib.webpackMod.webpackNs.Configuration = js.native
  def watch(value: scala.Boolean): this.type = js.native
  def watchOptions(value: webpackLib.webpackMod.webpackNs.OptionsNs.WatchOptions): this.type = js.native
}

