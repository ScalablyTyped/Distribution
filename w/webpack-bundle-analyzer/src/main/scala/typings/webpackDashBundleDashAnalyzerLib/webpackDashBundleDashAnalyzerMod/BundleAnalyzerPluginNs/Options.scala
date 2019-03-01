package typings
package webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerMod.BundleAnalyzerPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Host that will be used in `server` mode to start HTTP server.
    * Defaults to 127.0.0.1
    */
  var analyzerHost: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Can be "server", "static" or "disabled".
    * Defaults to "server".
    * In "server" mode analyzer will start HTTP server to show bundle report.
    * In "static" mode single HTML file with bundle report will be generated.
    * In "disabled" mode you can use this plugin to just generate Webpack Stats JSON file by setting "generateStatsFile" to true.
    */
  var analyzerMode: js.UndefOr[
    webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.server | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.static | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.disabled
  ] = js.undefined
  /**
    * Port that will be used in `server` mode to start HTTP server.
    * Defaults to 8888
    */
  var analyzerPort: js.UndefOr[scala.Double] = js.undefined
  /**
    * Module sizes to show in report by default.
    * Should be one of "stat", "parsed" or "gzip".
    * Defaults to "parsed"
    */
  var defaultSizes: js.UndefOr[
    webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.parsed | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.stat | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.gzip
  ] = js.undefined
  /**
    * Default: `null`.
    * Patterns that will be used to match against asset names to exclude them from the report.
    * If pattern is a string it will be converted to RegExp via `new RegExp(str)`.
    * If pattern is a function it should have the following signature `(assetName: string) => boolean`
    * and should return true to exclude matching asset.
    * If multiple patterns are provided asset should match at least one of them to be excluded.
    */
  var excludeAssets: js.UndefOr[scala.Null | ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern]] = js.undefined
  /**
    * If true, Webpack Stats JSON file will be generated in bundles output directory.
    * Defaults to false
    */
  var generateStatsFile: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Log level. Can be "info", "warn", "error" or "silent".
    * Defaults to "info"
    */
  var logLevel: js.UndefOr[
    webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.info | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.warn | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.error | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.silent
  ] = js.undefined
  /**
    * Automatically open report in default browser.
    * Defaults to true
    */
  var openAnalyzer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Path to bundle report file that will be generated in "static" mode.
    * Relative to bundles output directory.
    * Defaults to "report.html"
    */
  var reportFilename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of Webpack Stats JSON file that will be generated if generateStatsFile is true.
    * Relative to bundles output directory.
    * Defaults to "stats.json"
    */
  var statsFilename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Options for stats.toJson() method.
    * For example you can exclude sources of your modules from stats file with "source: false" option.
    */
  var statsOptions: js.UndefOr[scala.Null | webpackLib.webpackMod.webpackNs.StatsNs.ToJsonOptionsObject] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    analyzerHost: java.lang.String = null,
    analyzerMode: webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.server | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.static | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.disabled = null,
    analyzerPort: scala.Int | scala.Double = null,
    defaultSizes: webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.parsed | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.stat | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.gzip = null,
    excludeAssets: ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern] = null,
    generateStatsFile: js.UndefOr[scala.Boolean] = js.undefined,
    logLevel: webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.info | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.warn | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.error | webpackDashBundleDashAnalyzerLib.webpackDashBundleDashAnalyzerLibStrings.silent = null,
    openAnalyzer: js.UndefOr[scala.Boolean] = js.undefined,
    reportFilename: java.lang.String = null,
    statsFilename: java.lang.String = null,
    statsOptions: webpackLib.webpackMod.webpackNs.StatsNs.ToJsonOptionsObject = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (analyzerHost != null) __obj.updateDynamic("analyzerHost")(analyzerHost)
    if (analyzerMode != null) __obj.updateDynamic("analyzerMode")(analyzerMode.asInstanceOf[js.Any])
    if (analyzerPort != null) __obj.updateDynamic("analyzerPort")(analyzerPort.asInstanceOf[js.Any])
    if (defaultSizes != null) __obj.updateDynamic("defaultSizes")(defaultSizes.asInstanceOf[js.Any])
    if (excludeAssets != null) __obj.updateDynamic("excludeAssets")(excludeAssets.asInstanceOf[js.Any])
    if (!js.isUndefined(generateStatsFile)) __obj.updateDynamic("generateStatsFile")(generateStatsFile)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(openAnalyzer)) __obj.updateDynamic("openAnalyzer")(openAnalyzer)
    if (reportFilename != null) __obj.updateDynamic("reportFilename")(reportFilename)
    if (statsFilename != null) __obj.updateDynamic("statsFilename")(statsFilename)
    if (statsOptions != null) __obj.updateDynamic("statsOptions")(statsOptions)
    __obj.asInstanceOf[Options]
  }
}

