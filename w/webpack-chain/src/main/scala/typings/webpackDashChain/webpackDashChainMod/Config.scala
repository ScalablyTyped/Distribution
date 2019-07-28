package typings.webpackDashChain.webpackDashChainMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackMod.Configuration
import typings.webpack.webpackMod.ExternalsElement
import typings.webpack.webpackMod.OptionsNs.Stats
import typings.webpack.webpackMod.OptionsNs.WatchOptions
import typings.webpackDashChain.webpackDashChainStrings.development
import typings.webpackDashChain.webpackDashChainStrings.none
import typings.webpackDashChain.webpackDashChainStrings.production
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config
  extends typings.webpackDashChain.webpackDashChainMod.underscoreUnderscoreConfigNs.TypedChainedMap[Unit, js.Any] {
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
  def amd(value: StringDictionary[Boolean]): this.type = js.native
  def bail(value: Boolean): this.type = js.native
  def cache(value: js.Any): this.type = js.native
  def cache(value: Boolean): this.type = js.native
  def context(value: String): this.type = js.native
  def devtool(value: DevTool): this.type = js.native
  def entry(name: String): EntryPoint = js.native
  def externals(value: js.Array[ExternalsElement]): this.type = js.native
  def externals(value: ExternalsElement): this.type = js.native
  def loader(value: js.Any): this.type = js.native
  @JSName("mode")
  def mode_development(value: development): this.type = js.native
  @JSName("mode")
  def mode_none(value: none): this.type = js.native
  @JSName("mode")
  def mode_production(value: production): this.type = js.native
  def name(value: String): this.type = js.native
  def parallelism(value: Double): this.type = js.native
  def plugin(name: String): Plugin[this.type] = js.native
  def profile(value: Boolean): this.type = js.native
  def recordsInputPath(value: String): this.type = js.native
  def recordsOutputPath(value: String): this.type = js.native
  def recordsPath(value: String): this.type = js.native
  def stats(value: Stats): this.type = js.native
  def target(value: String): this.type = js.native
  def toConfig(): Configuration = js.native
  def watch(value: Boolean): this.type = js.native
  def watchOptions(value: WatchOptions): this.type = js.native
}

