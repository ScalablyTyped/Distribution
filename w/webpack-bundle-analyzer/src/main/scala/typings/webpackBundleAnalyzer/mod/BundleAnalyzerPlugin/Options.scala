package typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin

import typings.webpack.mod.Stats.ToJsonOptionsObject
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.auto
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.disabled
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.error
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.gzip
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.info
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.json
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.parsed
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.server
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.silent
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.stat
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.static
import typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Host that will be used in `server` mode to start HTTP server.
    * @default '127.0.0.1'
    */
  var analyzerHost: js.UndefOr[String] = js.undefined
  /**
    * Can be "server", "static" or "disabled".
    * Defaults to "server".
    * In "server" mode analyzer will start HTTP server to show bundle report.
    * In "static" mode single HTML file with bundle report will be generated.
    * In "json" mode single JSON file with bundle report will be generated
    * In "disabled" mode you can use this plugin to just generate Webpack Stats JSON file by setting "generateStatsFile" to true.
    */
  var analyzerMode: js.UndefOr[server | static | json | disabled] = js.undefined
  /**
    * Port that will be used in `server` mode to start HTTP server.
    * @default 8888
    */
  var analyzerPort: js.UndefOr[Double | auto] = js.undefined
  /**
    * Module sizes to show in report by default.
    * Should be one of "stat", "parsed" or "gzip".
    * @default 'parsed'
    */
  var defaultSizes: js.UndefOr[parsed | stat | gzip] = js.undefined
  /**
    * Patterns that will be used to match against asset names to exclude them from the report.
    * If pattern is a string it will be converted to RegExp via `new RegExp(str)`.
    * If pattern is a function it should have the following signature `(assetName: string) => boolean`
    * and should return true to exclude matching asset.
    * If multiple patterns are provided asset should match at least one of them to be excluded.
    * @default null
    */
  var excludeAssets: js.UndefOr[Null | ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern]] = js.undefined
  /**
    * If true, Webpack Stats JSON file will be generated in bundles output directory.
    * @default false
    */
  var generateStatsFile: js.UndefOr[Boolean] = js.undefined
  /**
    * Log level. Can be "info", "warn", "error" or "silent".
    * @default 'info'
    */
  var logLevel: js.UndefOr[info | warn | error | silent] = js.undefined
  /**
    * Automatically open report in default browser.
    * @default true
    */
  var openAnalyzer: js.UndefOr[Boolean] = js.undefined
  /**
    * Path to bundle report file that will be generated in "static" mode.
    * Relative to bundles output directory.
    * @default 'report.html'
    */
  var reportFilename: js.UndefOr[String] = js.undefined
  /**
    * Name of Webpack Stats JSON file that will be generated if generateStatsFile is true.
    * Relative to bundles output directory.
    * @default 'stats.json'
    */
  var statsFilename: js.UndefOr[String] = js.undefined
  /**
    * Options for stats.toJson() method.
    * For example you can exclude sources of your modules from stats file with "source: false" option.
    * @default null
    */
  var statsOptions: js.UndefOr[Null | ToJsonOptionsObject] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    analyzerHost: String = null,
    analyzerMode: server | static | json | disabled = null,
    analyzerPort: Double | auto = null,
    defaultSizes: parsed | stat | gzip = null,
    excludeAssets: js.UndefOr[Null | ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern]] = js.undefined,
    generateStatsFile: js.UndefOr[Boolean] = js.undefined,
    logLevel: info | warn | error | silent = null,
    openAnalyzer: js.UndefOr[Boolean] = js.undefined,
    reportFilename: String = null,
    statsFilename: String = null,
    statsOptions: js.UndefOr[Null | ToJsonOptionsObject] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (analyzerHost != null) __obj.updateDynamic("analyzerHost")(analyzerHost.asInstanceOf[js.Any])
    if (analyzerMode != null) __obj.updateDynamic("analyzerMode")(analyzerMode.asInstanceOf[js.Any])
    if (analyzerPort != null) __obj.updateDynamic("analyzerPort")(analyzerPort.asInstanceOf[js.Any])
    if (defaultSizes != null) __obj.updateDynamic("defaultSizes")(defaultSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeAssets)) __obj.updateDynamic("excludeAssets")(excludeAssets.asInstanceOf[js.Any])
    if (!js.isUndefined(generateStatsFile)) __obj.updateDynamic("generateStatsFile")(generateStatsFile.get.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(openAnalyzer)) __obj.updateDynamic("openAnalyzer")(openAnalyzer.get.asInstanceOf[js.Any])
    if (reportFilename != null) __obj.updateDynamic("reportFilename")(reportFilename.asInstanceOf[js.Any])
    if (statsFilename != null) __obj.updateDynamic("statsFilename")(statsFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(statsOptions)) __obj.updateDynamic("statsOptions")(statsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

