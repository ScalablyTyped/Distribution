package typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin

import typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats.ToJsonOptionsObject
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Host that will be used in `server` mode to start HTTP server.
    * @default '127.0.0.1'
    */
  var analyzerHost: js.UndefOr[String] = js.native
  
  /**
    * Can be "server", "static" or "disabled".
    * Defaults to "server".
    * In "server" mode analyzer will start HTTP server to show bundle report.
    * In "static" mode single HTML file with bundle report will be generated.
    * In "json" mode single JSON file with bundle report will be generated
    * In "disabled" mode you can use this plugin to just generate Webpack Stats JSON file by setting "generateStatsFile" to true.
    */
  var analyzerMode: js.UndefOr[server | static | json | disabled] = js.native
  
  /**
    * Port that will be used in `server` mode to start HTTP server.
    * @default 8888
    */
  var analyzerPort: js.UndefOr[Double | auto] = js.native
  
  /**
    * Module sizes to show in report by default.
    * Should be one of "stat", "parsed" or "gzip".
    * @default 'parsed'
    */
  var defaultSizes: js.UndefOr[parsed | stat | gzip] = js.native
  
  /**
    * Patterns that will be used to match against asset names to exclude them from the report.
    * If pattern is a string it will be converted to RegExp via `new RegExp(str)`.
    * If pattern is a function it should have the following signature `(assetName: string) => boolean`
    * and should return true to exclude matching asset.
    * If multiple patterns are provided asset should match at least one of them to be excluded.
    * @default null
    */
  var excludeAssets: js.UndefOr[Null | ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern]] = js.native
  
  /**
    * If true, Webpack Stats JSON file will be generated in bundles output directory.
    * @default false
    */
  var generateStatsFile: js.UndefOr[Boolean] = js.native
  
  /**
    * Log level. Can be "info", "warn", "error" or "silent".
    * @default 'info'
    */
  var logLevel: js.UndefOr[info | warn | error | silent] = js.native
  
  /**
    * Automatically open report in default browser.
    * @default true
    */
  var openAnalyzer: js.UndefOr[Boolean] = js.native
  
  /**
    * Path to bundle report file that will be generated in "static" mode.
    * Relative to bundles output directory.
    * @default 'report.html'
    */
  var reportFilename: js.UndefOr[String] = js.native
  
  /**
    * Content of the HTML title element; or a function of the form () => string that provides the content.
    * @default function that returns pretty printed current date and time.
    */
  var reportTitle: js.UndefOr[String | js.Function0[String]] = js.native
  
  /**
    * Name of Webpack Stats JSON file that will be generated if generateStatsFile is true.
    * Relative to bundles output directory.
    * @default 'stats.json'
    */
  var statsFilename: js.UndefOr[String] = js.native
  
  /**
    * Options for stats.toJson() method.
    * For example you can exclude sources of your modules from stats file with "source: false" option.
    * @default null
    */
  var statsOptions: js.UndefOr[Null | ToJsonOptionsObject] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalyzerHost(value: String): Self = this.set("analyzerHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzerHost: Self = this.set("analyzerHost", js.undefined)
    
    @scala.inline
    def setAnalyzerMode(value: server | static | json | disabled): Self = this.set("analyzerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzerMode: Self = this.set("analyzerMode", js.undefined)
    
    @scala.inline
    def setAnalyzerPort(value: Double | auto): Self = this.set("analyzerPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzerPort: Self = this.set("analyzerPort", js.undefined)
    
    @scala.inline
    def setDefaultSizes(value: parsed | stat | gzip): Self = this.set("defaultSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSizes: Self = this.set("defaultSizes", js.undefined)
    
    @scala.inline
    def setExcludeAssetsVarargs(value: ExcludeAssetsPattern*): Self = this.set("excludeAssets", js.Array(value :_*))
    
    @scala.inline
    def setExcludeAssetsFunction1(value: /* assetName */ String => Boolean): Self = this.set("excludeAssets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcludeAssets(value: ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern]): Self = this.set("excludeAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeAssets: Self = this.set("excludeAssets", js.undefined)
    
    @scala.inline
    def setExcludeAssetsNull: Self = this.set("excludeAssets", null)
    
    @scala.inline
    def setGenerateStatsFile(value: Boolean): Self = this.set("generateStatsFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateStatsFile: Self = this.set("generateStatsFile", js.undefined)
    
    @scala.inline
    def setLogLevel(value: info | warn | error | silent): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setOpenAnalyzer(value: Boolean): Self = this.set("openAnalyzer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenAnalyzer: Self = this.set("openAnalyzer", js.undefined)
    
    @scala.inline
    def setReportFilename(value: String): Self = this.set("reportFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportFilename: Self = this.set("reportFilename", js.undefined)
    
    @scala.inline
    def setReportTitleFunction0(value: () => String): Self = this.set("reportTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReportTitle(value: String | js.Function0[String]): Self = this.set("reportTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportTitle: Self = this.set("reportTitle", js.undefined)
    
    @scala.inline
    def setStatsFilename(value: String): Self = this.set("statsFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatsFilename: Self = this.set("statsFilename", js.undefined)
    
    @scala.inline
    def setStatsOptions(value: ToJsonOptionsObject): Self = this.set("statsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatsOptions: Self = this.set("statsOptions", js.undefined)
    
    @scala.inline
    def setStatsOptionsNull: Self = this.set("statsOptions", null)
  }
}
