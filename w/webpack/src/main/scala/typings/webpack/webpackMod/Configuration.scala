package typings.webpack.webpackMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackMod.Options.Devtool
import typings.webpack.webpackMod.Options.Optimization
import typings.webpack.webpackMod.Options.Performance
import typings.webpack.webpackNumbers.`false`
import typings.webpack.webpackStrings.`async-node`
import typings.webpack.webpackStrings.`electron-main`
import typings.webpack.webpackStrings.`electron-renderer`
import typings.webpack.webpackStrings.`node-webkit`
import typings.webpack.webpackStrings.atom
import typings.webpack.webpackStrings.development
import typings.webpack.webpackStrings.electron
import typings.webpack.webpackStrings.node
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.production
import typings.webpack.webpackStrings.web
import typings.webpack.webpackStrings.webworker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /** Set the value of require.amd and define.amd. */
  var amd: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  /** Report the first error as a hard error instead of tolerating it. */
  var bail: js.UndefOr[Boolean] = js.undefined
  /** Cache generated modules and chunks to improve performance for multiple incremental builds. */
  var cache: js.UndefOr[Boolean | js.Object] = js.undefined
  /**
    * The base directory (absolute path!) for resolving the `entry` option.
    * If `output.pathinfo` is set, the included pathinfo is shortened to this directory.
    */
  var context: js.UndefOr[String] = js.undefined
  /** Switch loaders to debug mode. */
  var debug: js.UndefOr[Boolean] = js.undefined
  /** Choose a style of source mapping to enhance the debugging process. These values can affect build and rebuild speed dramatically. */
  var devtool: js.UndefOr[Devtool] = js.undefined
  var entry: js.UndefOr[String | js.Array[String] | Entry | EntryFunc] = js.undefined
  /**
    * Specify dependencies that shouldn’t be resolved by webpack, but should become dependencies of the resulting bundle.
    * The kind of the dependency depends on output.libraryTarget.
    */
  var externals: js.UndefOr[ExternalsElement | js.Array[ExternalsElement]] = js.undefined
  /** Enable production optimizations or development hints. */
  var mode: js.UndefOr[development | production | none] = js.undefined
  /** Options affecting the normal modules (NormalModuleFactory) */
  var module: js.UndefOr[Module] = js.undefined
  /** Name of the configuration. Used when loading multiple configurations. */
  var name: js.UndefOr[String] = js.undefined
  /** Include polyfills or mocks for various node stuff */
  var node: js.UndefOr[Node | `false`] = js.undefined
  /** Optimization options */
  var optimization: js.UndefOr[Optimization] = js.undefined
  /** Options affecting the output. */
  var output: js.UndefOr[Output] = js.undefined
  /** Limit the number of parallel processed modules. Can be used to fine tune performance or to get more reliable profiling results */
  var parallelism: js.UndefOr[Double] = js.undefined
  /** Performance options */
  var performance: js.UndefOr[Performance | `false`] = js.undefined
  /** Add additional plugins to the compiler. */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  /** Capture timing information for each module. */
  var profile: js.UndefOr[Boolean] = js.undefined
  /** Load compiler state from a json file. */
  var recordsInputPath: js.UndefOr[String] = js.undefined
  /** Store compiler state to a json file. */
  var recordsOutputPath: js.UndefOr[String] = js.undefined
  /** Used for recordsInputPath and recordsOutputPath */
  var recordsPath: js.UndefOr[String] = js.undefined
  /** Options affecting the resolving of modules. */
  var resolve: js.UndefOr[Resolve] = js.undefined
  /** Like resolve but for loaders. */
  var resolveLoader: js.UndefOr[ResolveLoader] = js.undefined
  /** Stats options for logging  */
  var stats: js.UndefOr[typings.webpack.webpackMod.Options.Stats] = js.undefined
  /**
    * - "web" Compile for usage in a browser-like environment (default).
    * - "webworker" Compile as WebWorker.
    * - "node" Compile for usage in a node.js-like environment (use require to load chunks).
    * - "async-node" Compile for usage in a node.js-like environment (use fs and vm to load chunks async).
    * - "node-webkit" Compile for usage in webkit, uses jsonp chunk loading but also supports builtin node.js modules plus require(“nw.gui”) (experimental)
    * - "atom" Compile for usage in electron (formerly known as atom-shell), supports require for modules necessary to run Electron.
    * - "electron-renderer" Compile for Electron for renderer process, providing a target using JsonpTemplatePlugin, FunctionModulePlugin for browser
    *   environments and NodeTargetPlugin and ExternalsPlugin for CommonJS and Electron built-in modules.
    * - "electron-main" Compile for Electron for main process.
    * - "atom" Alias for electron-main.
    * - "electron" Alias for electron-main.
    */
  var target: js.UndefOr[
    web | webworker | node | `async-node` | `node-webkit` | atom | electron | `electron-renderer` | `electron-main` | (js.Function1[/* compiler */ js.UndefOr[js.Any], Unit])
  ] = js.undefined
  /** Enter watch mode, which rebuilds on file change. */
  var watch: js.UndefOr[Boolean] = js.undefined
  var watchOptions: js.UndefOr[typings.webpack.webpackMod.Options.WatchOptions] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    amd: StringDictionary[Boolean] = null,
    bail: js.UndefOr[Boolean] = js.undefined,
    cache: Boolean | js.Object = null,
    context: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    devtool: Devtool = null,
    entry: String | js.Array[String] | Entry | EntryFunc = null,
    externals: ExternalsElement | js.Array[ExternalsElement] = null,
    mode: development | production | none = null,
    module: Module = null,
    name: String = null,
    node: Node | `false` = null,
    optimization: Optimization = null,
    output: Output = null,
    parallelism: Int | Double = null,
    performance: Performance | `false` = null,
    plugins: js.Array[Plugin] = null,
    profile: js.UndefOr[Boolean] = js.undefined,
    recordsInputPath: String = null,
    recordsOutputPath: String = null,
    recordsPath: String = null,
    resolve: Resolve = null,
    resolveLoader: ResolveLoader = null,
    stats: typings.webpack.webpackMod.Options.Stats = null,
    target: web | webworker | node | `async-node` | `node-webkit` | atom | electron | `electron-renderer` | `electron-main` | (js.Function1[/* compiler */ js.UndefOr[js.Any], Unit]) = null,
    watch: js.UndefOr[Boolean] = js.undefined,
    watchOptions: typings.webpack.webpackMod.Options.WatchOptions = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (amd != null) __obj.updateDynamic("amd")(amd)
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail)
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (devtool != null) __obj.updateDynamic("devtool")(devtool.asInstanceOf[js.Any])
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (externals != null) __obj.updateDynamic("externals")(externals.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module)
    if (name != null) __obj.updateDynamic("name")(name)
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (optimization != null) __obj.updateDynamic("optimization")(optimization)
    if (output != null) __obj.updateDynamic("output")(output)
    if (parallelism != null) __obj.updateDynamic("parallelism")(parallelism.asInstanceOf[js.Any])
    if (performance != null) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(profile)) __obj.updateDynamic("profile")(profile)
    if (recordsInputPath != null) __obj.updateDynamic("recordsInputPath")(recordsInputPath)
    if (recordsOutputPath != null) __obj.updateDynamic("recordsOutputPath")(recordsOutputPath)
    if (recordsPath != null) __obj.updateDynamic("recordsPath")(recordsPath)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (resolveLoader != null) __obj.updateDynamic("resolveLoader")(resolveLoader)
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions)
    __obj.asInstanceOf[Configuration]
  }
}

