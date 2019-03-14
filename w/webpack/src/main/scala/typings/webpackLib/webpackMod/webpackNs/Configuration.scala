package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /** Set the value of require.amd and define.amd. */
  var amd: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  /** Report the first error as a hard error instead of tolerating it. */
  var bail: js.UndefOr[scala.Boolean] = js.undefined
  /** Cache generated modules and chunks to improve performance for multiple incremental builds. */
  var cache: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  /**
    * The base directory (absolute path!) for resolving the `entry` option.
    * If `output.pathinfo` is set, the included pathinfo is shortened to this directory.
    */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /** Switch loaders to debug mode. */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /** Choose a style of source mapping to enhance the debugging process. These values can affect build and rebuild speed dramatically. */
  var devtool: js.UndefOr[webpackLib.webpackMod.webpackNs.OptionsNs.Devtool] = js.undefined
  var entry: js.UndefOr[java.lang.String | js.Array[java.lang.String] | Entry | EntryFunc] = js.undefined
  /**
    * Specify dependencies that shouldn’t be resolved by webpack, but should become dependencies of the resulting bundle.
    * The kind of the dependency depends on output.libraryTarget.
    */
  var externals: js.UndefOr[ExternalsElement | js.Array[ExternalsElement]] = js.undefined
  /** Enable production optimizations or development hints. */
  var mode: js.UndefOr[
    webpackLib.webpackLibStrings.development | webpackLib.webpackLibStrings.production | webpackLib.webpackLibStrings.none
  ] = js.undefined
  /** Options affecting the normal modules (NormalModuleFactory) */
  var module: js.UndefOr[Module] = js.undefined
  /** Name of the configuration. Used when loading multiple configurations. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Include polyfills or mocks for various node stuff */
  var node: js.UndefOr[Node | webpackLib.webpackLibNumbers.`false`] = js.undefined
  /** Optimization options */
  var optimization: js.UndefOr[webpackLib.webpackMod.webpackNs.OptionsNs.Optimization] = js.undefined
  /** Options affecting the output. */
  var output: js.UndefOr[Output] = js.undefined
  /** Limit the number of parallel processed modules. Can be used to fine tune performance or to get more reliable profiling results */
  var parallelism: js.UndefOr[scala.Double] = js.undefined
  /** Performance options */
  var performance: js.UndefOr[
    webpackLib.webpackMod.webpackNs.OptionsNs.Performance | webpackLib.webpackLibNumbers.`false`
  ] = js.undefined
  /** Add additional plugins to the compiler. */
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  /** Capture timing information for each module. */
  var profile: js.UndefOr[scala.Boolean] = js.undefined
  /** Load compiler state from a json file. */
  var recordsInputPath: js.UndefOr[java.lang.String] = js.undefined
  /** Store compiler state to a json file. */
  var recordsOutputPath: js.UndefOr[java.lang.String] = js.undefined
  /** Used for recordsInputPath and recordsOutputPath */
  var recordsPath: js.UndefOr[java.lang.String] = js.undefined
  /** Options affecting the resolving of modules. */
  var resolve: js.UndefOr[Resolve] = js.undefined
  /** Like resolve but for loaders. */
  var resolveLoader: js.UndefOr[ResolveLoader] = js.undefined
  /** Stats options for logging  */
  var stats: js.UndefOr[webpackLib.webpackMod.webpackNs.OptionsNs.Stats] = js.undefined
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
    webpackLib.webpackLibStrings.web | webpackLib.webpackLibStrings.webworker | webpackLib.webpackLibStrings.node | webpackLib.webpackLibStrings.`async-node` | webpackLib.webpackLibStrings.`node-webkit` | webpackLib.webpackLibStrings.atom | webpackLib.webpackLibStrings.electron | webpackLib.webpackLibStrings.`electron-renderer` | webpackLib.webpackLibStrings.`electron-main` | (js.Function1[/* compiler */ js.UndefOr[js.Any], scala.Unit])
  ] = js.undefined
  /** Enter watch mode, which rebuilds on file change. */
  var watch: js.UndefOr[scala.Boolean] = js.undefined
  var watchOptions: js.UndefOr[webpackLib.webpackMod.webpackNs.OptionsNs.WatchOptions] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    amd: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    bail: js.UndefOr[scala.Boolean] = js.undefined,
    cache: scala.Boolean | js.Object = null,
    context: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    devtool: webpackLib.webpackMod.webpackNs.OptionsNs.Devtool = null,
    entry: java.lang.String | js.Array[java.lang.String] | Entry | EntryFunc = null,
    externals: ExternalsElement | js.Array[ExternalsElement] = null,
    mode: webpackLib.webpackLibStrings.development | webpackLib.webpackLibStrings.production | webpackLib.webpackLibStrings.none = null,
    module: Module = null,
    name: java.lang.String = null,
    node: Node | webpackLib.webpackLibNumbers.`false` = null,
    optimization: webpackLib.webpackMod.webpackNs.OptionsNs.Optimization = null,
    output: Output = null,
    parallelism: scala.Int | scala.Double = null,
    performance: webpackLib.webpackMod.webpackNs.OptionsNs.Performance | webpackLib.webpackLibNumbers.`false` = null,
    plugins: js.Array[Plugin] = null,
    profile: js.UndefOr[scala.Boolean] = js.undefined,
    recordsInputPath: java.lang.String = null,
    recordsOutputPath: java.lang.String = null,
    recordsPath: java.lang.String = null,
    resolve: Resolve = null,
    resolveLoader: ResolveLoader = null,
    stats: webpackLib.webpackMod.webpackNs.OptionsNs.Stats = null,
    target: webpackLib.webpackLibStrings.web | webpackLib.webpackLibStrings.webworker | webpackLib.webpackLibStrings.node | webpackLib.webpackLibStrings.`async-node` | webpackLib.webpackLibStrings.`node-webkit` | webpackLib.webpackLibStrings.atom | webpackLib.webpackLibStrings.electron | webpackLib.webpackLibStrings.`electron-renderer` | webpackLib.webpackLibStrings.`electron-main` | (js.Function1[/* compiler */ js.UndefOr[js.Any], scala.Unit]) = null,
    watch: js.UndefOr[scala.Boolean] = js.undefined,
    watchOptions: webpackLib.webpackMod.webpackNs.OptionsNs.WatchOptions = null
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

