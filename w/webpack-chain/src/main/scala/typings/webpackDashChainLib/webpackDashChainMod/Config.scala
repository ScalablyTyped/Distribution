package typings
package webpackDashChainLib.webpackDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config
  extends webpackDashChainLib.webpackDashChainMod.underscoreUnderscoreConfigNs.TypedChainedMap[scala.Unit, js.Any] {
  var devServer: DevServer = js.native
  var entryPoints: TypedChainedMap[Config, EntryPoint] = js.native
  var module: Module = js.native
  var node: ChainedMap[this.type] = js.native
  var optimization: Optimization = js.native
  var output: Output = js.native
  var performance: Performance = js.native
  var plugins: Plugins[this.type] = js.native
  var resolve: Resolve = js.native
  var resolveLoader: ResolveLoader = js.native
  def amd(value: org.scalablytyped.runtime.StringDictionary[scala.Boolean]): this.type = js.native
  def bail(value: scala.Boolean): this.type = js.native
  def cache(value: js.Any): this.type = js.native
  def cache(value: scala.Boolean): this.type = js.native
  def context(value: java.lang.String): this.type = js.native
  def devtool(value: DevTool): this.type = js.native
  def entry(name: java.lang.String): EntryPoint = js.native
  def externals(value: js.Array[webpackLib.webpackMod.ExternalsElement]): this.type = js.native
  def externals(value: webpackLib.webpackMod.ExternalsElement): this.type = js.native
  def loader(value: js.Any): this.type = js.native
  @JSName("mode")
  def mode_development(value: webpackDashChainLib.webpackDashChainLibStrings.development): this.type = js.native
  @JSName("mode")
  def mode_none(value: webpackDashChainLib.webpackDashChainLibStrings.none): this.type = js.native
  @JSName("mode")
  def mode_production(value: webpackDashChainLib.webpackDashChainLibStrings.production): this.type = js.native
  def name(value: java.lang.String): this.type = js.native
  def parallelism(value: scala.Double): this.type = js.native
  def plugin(name: java.lang.String): Plugin[this.type] = js.native
  def profile(value: scala.Boolean): this.type = js.native
  def recordsInputPath(value: java.lang.String): this.type = js.native
  def recordsOutputPath(value: java.lang.String): this.type = js.native
  def recordsPath(value: java.lang.String): this.type = js.native
  def stats(value: webpackLib.webpackMod.OptionsNs.Stats): this.type = js.native
  def target(value: java.lang.String): this.type = js.native
  def toConfig(): webpackLib.webpackMod.Configuration = js.native
  def watch(value: scala.Boolean): this.type = js.native
  def watchOptions(value: webpackLib.webpackMod.OptionsNs.WatchOptions): this.type = js.native
}

