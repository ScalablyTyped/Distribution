package typings.webpackBundleAnalyzer

import typings.std.RegExp
import typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Options
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebpackPluginInstance * / any */ @JSImport("webpack-bundle-analyzer", "BundleAnalyzerPlugin")
  @js.native
  class BundleAnalyzerPlugin () extends StObject {
    def this(options: Options) = this()
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
  }
  object BundleAnalyzerPlugin {
    
    type ExcludeAssetsPattern = String | RegExp | ExcludeAssetsPatternFn
    
    type ExcludeAssetsPatternFn = js.Function1[/* assetName */ String, Boolean]
    
    trait Options extends StObject {
      
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
        * Content of the HTML title element; or a function of the form () => string that provides the content.
        * @default function that returns pretty printed current date and time.
        */
      var reportTitle: js.UndefOr[String | js.Function0[String]] = js.undefined
      
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
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnalyzerHost(value: String): Self = StObject.set(x, "analyzerHost", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnalyzerHostUndefined: Self = StObject.set(x, "analyzerHost", js.undefined)
        
        @scala.inline
        def setAnalyzerMode(value: server | static | json | disabled): Self = StObject.set(x, "analyzerMode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnalyzerModeUndefined: Self = StObject.set(x, "analyzerMode", js.undefined)
        
        @scala.inline
        def setAnalyzerPort(value: Double | auto): Self = StObject.set(x, "analyzerPort", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnalyzerPortUndefined: Self = StObject.set(x, "analyzerPort", js.undefined)
        
        @scala.inline
        def setDefaultSizes(value: parsed | stat | gzip): Self = StObject.set(x, "defaultSizes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultSizesUndefined: Self = StObject.set(x, "defaultSizes", js.undefined)
        
        @scala.inline
        def setExcludeAssets(value: ExcludeAssetsPattern | js.Array[ExcludeAssetsPattern]): Self = StObject.set(x, "excludeAssets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExcludeAssetsFunction1(value: /* assetName */ String => Boolean): Self = StObject.set(x, "excludeAssets", js.Any.fromFunction1(value))
        
        @scala.inline
        def setExcludeAssetsNull: Self = StObject.set(x, "excludeAssets", null)
        
        @scala.inline
        def setExcludeAssetsUndefined: Self = StObject.set(x, "excludeAssets", js.undefined)
        
        @scala.inline
        def setExcludeAssetsVarargs(value: ExcludeAssetsPattern*): Self = StObject.set(x, "excludeAssets", js.Array(value :_*))
        
        @scala.inline
        def setGenerateStatsFile(value: Boolean): Self = StObject.set(x, "generateStatsFile", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGenerateStatsFileUndefined: Self = StObject.set(x, "generateStatsFile", js.undefined)
        
        @scala.inline
        def setLogLevel(value: info | warn | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
        
        @scala.inline
        def setOpenAnalyzer(value: Boolean): Self = StObject.set(x, "openAnalyzer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpenAnalyzerUndefined: Self = StObject.set(x, "openAnalyzer", js.undefined)
        
        @scala.inline
        def setReportFilename(value: String): Self = StObject.set(x, "reportFilename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportFilenameUndefined: Self = StObject.set(x, "reportFilename", js.undefined)
        
        @scala.inline
        def setReportTitle(value: String | js.Function0[String]): Self = StObject.set(x, "reportTitle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReportTitleFunction0(value: () => String): Self = StObject.set(x, "reportTitle", js.Any.fromFunction0(value))
        
        @scala.inline
        def setReportTitleUndefined: Self = StObject.set(x, "reportTitle", js.undefined)
        
        @scala.inline
        def setStatsFilename(value: String): Self = StObject.set(x, "statsFilename", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatsFilenameUndefined: Self = StObject.set(x, "statsFilename", js.undefined)
        
        @scala.inline
        def setStatsOptions(value: ToJsonOptionsObject): Self = StObject.set(x, "statsOptions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatsOptionsNull: Self = StObject.set(x, "statsOptions", null)
        
        @scala.inline
        def setStatsOptionsUndefined: Self = StObject.set(x, "statsOptions", js.undefined)
      }
    }
    
    // Copied from @types/webpack@4 as webpack@5 only has `any` defined at the moment.
    // See https://github.com/webpack/webpack/issues/11630
    object Stats {
      
      /* Rewritten from type alias, can be one of: 
        - scala.Boolean
        - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.`errors-only`
        - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.`errors-warnings`
        - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.minimal
        - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.none
        - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.normal
        - typings.webpackBundleAnalyzer.webpackBundleAnalyzerStrings.verbose
      */
      type Preset = _Preset | Boolean
      
      type StatsExcludeFilter = String | (js.Array[(js.Function1[/* assetName */ String, Boolean]) | RegExp | String]) | RegExp | (js.Function1[/* assetName */ String, Boolean])
      
      /* Rewritten from type alias, can be one of: 
        - typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats.Preset
        - typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats.ToJsonOptionsObject
      */
      type ToJsonOptions = _ToJsonOptions | Boolean
      
      trait ToJsonOptionsObject
        extends StObject
           with _ToJsonOptions {
        
        /** fallback value for stats options when an option is not defined (has precedence over local webpack defaults) */
        var all: js.UndefOr[Boolean] = js.undefined
        
        /** Add asset Information */
        var assets: js.UndefOr[Boolean] = js.undefined
        
        /** Sort assets by a field */
        var assetsSort: js.UndefOr[String] = js.undefined
        
        /** Add built at time information */
        var builtAt: js.UndefOr[Boolean] = js.undefined
        
        /** Add information about cached (not built) modules */
        var cached: js.UndefOr[Boolean] = js.undefined
        
        /** Show cached assets (setting this to `false` only shows emitted files) */
        var cachedAssets: js.UndefOr[Boolean] = js.undefined
        
        /** Add children information */
        var children: js.UndefOr[Boolean] = js.undefined
        
        /** Add information about the `namedChunkGroups` */
        var chunkGroups: js.UndefOr[Boolean] = js.undefined
        
        /** Add built modules information to chunk information */
        var chunkModules: js.UndefOr[Boolean] = js.undefined
        
        /** Add the origins of chunks and chunk merging info */
        var chunkOrigins: js.UndefOr[Boolean] = js.undefined
        
        /** Add chunk information (setting this to `false` allows for a less verbose output) */
        var chunks: js.UndefOr[Boolean] = js.undefined
        
        /** Sort the chunks by a field */
        var chunksSort: js.UndefOr[String] = js.undefined
        
        /** Context directory for request shortening */
        var context: js.UndefOr[String] = js.undefined
        
        /** Display the distance from the entry point for each module */
        var depth: js.UndefOr[Boolean] = js.undefined
        
        /** Display the entry points with the corresponding bundles */
        var entrypoints: js.UndefOr[Boolean] = js.undefined
        
        /** Add --env information */
        var env: js.UndefOr[Boolean] = js.undefined
        
        /** Add details to errors (like resolving log) */
        var errorDetails: js.UndefOr[Boolean] = js.undefined
        
        /** Add errors */
        var errors: js.UndefOr[Boolean] = js.undefined
        
        /** See excludeModules */
        var exclude: js.UndefOr[StatsExcludeFilter] = js.undefined
        
        /** Exclude assets from being displayed in stats */
        var excludeAssets: js.UndefOr[StatsExcludeFilter] = js.undefined
        
        /** Exclude modules from being displayed in stats */
        var excludeModules: js.UndefOr[StatsExcludeFilter] = js.undefined
        
        /** Add the hash of the compilation */
        var hash: js.UndefOr[Boolean] = js.undefined
        
        /** Set the maximum number of modules to be shown */
        var maxModules: js.UndefOr[Double] = js.undefined
        
        /** Show dependencies and origin of warnings/errors */
        var moduleTrace: js.UndefOr[Boolean] = js.undefined
        
        /** Add built modules information */
        var modules: js.UndefOr[Boolean] = js.undefined
        
        /** Sort the modules by a field */
        var modulesSort: js.UndefOr[String] = js.undefined
        
        /** Show performance hint when file size exceeds `performance.maxAssetSize` */
        var performance: js.UndefOr[Boolean] = js.undefined
        
        /** Show the exports of the modules */
        var providedExports: js.UndefOr[Boolean] = js.undefined
        
        /** Add public path information */
        var publicPath: js.UndefOr[Boolean] = js.undefined
        
        /** Add information about the reasons why modules are included */
        var reasons: js.UndefOr[Boolean] = js.undefined
        
        /** Add the source code of modules */
        var source: js.UndefOr[Boolean] = js.undefined
        
        /** Add timing information */
        var timings: js.UndefOr[Boolean] = js.undefined
        
        /** Show which exports of a module are used */
        var usedExports: js.UndefOr[Boolean] = js.undefined
        
        /** Add webpack version information */
        var version: js.UndefOr[Boolean] = js.undefined
        
        /** Add warnings */
        var warnings: js.UndefOr[Boolean] = js.undefined
        
        /** Filter warnings to be shown */
        var warningsFilter: js.UndefOr[
                String | RegExp | (js.Array[String | RegExp]) | (js.Function1[/* warning */ String, Boolean])
              ] = js.undefined
      }
      object ToJsonOptionsObject {
        
        @scala.inline
        def apply(): ToJsonOptionsObject = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ToJsonOptionsObject]
        }
        
        @scala.inline
        implicit class ToJsonOptionsObjectMutableBuilder[Self <: ToJsonOptionsObject] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
          
          @scala.inline
          def setAssets(value: Boolean): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAssetsSort(value: String): Self = StObject.set(x, "assetsSort", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAssetsSortUndefined: Self = StObject.set(x, "assetsSort", js.undefined)
          
          @scala.inline
          def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
          
          @scala.inline
          def setBuiltAt(value: Boolean): Self = StObject.set(x, "builtAt", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBuiltAtUndefined: Self = StObject.set(x, "builtAt", js.undefined)
          
          @scala.inline
          def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCachedAssets(value: Boolean): Self = StObject.set(x, "cachedAssets", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCachedAssetsUndefined: Self = StObject.set(x, "cachedAssets", js.undefined)
          
          @scala.inline
          def setCachedUndefined: Self = StObject.set(x, "cached", js.undefined)
          
          @scala.inline
          def setChildren(value: Boolean): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
          
          @scala.inline
          def setChunkGroups(value: Boolean): Self = StObject.set(x, "chunkGroups", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChunkGroupsUndefined: Self = StObject.set(x, "chunkGroups", js.undefined)
          
          @scala.inline
          def setChunkModules(value: Boolean): Self = StObject.set(x, "chunkModules", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChunkModulesUndefined: Self = StObject.set(x, "chunkModules", js.undefined)
          
          @scala.inline
          def setChunkOrigins(value: Boolean): Self = StObject.set(x, "chunkOrigins", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChunkOriginsUndefined: Self = StObject.set(x, "chunkOrigins", js.undefined)
          
          @scala.inline
          def setChunks(value: Boolean): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChunksSort(value: String): Self = StObject.set(x, "chunksSort", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChunksSortUndefined: Self = StObject.set(x, "chunksSort", js.undefined)
          
          @scala.inline
          def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
          
          @scala.inline
          def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
          
          @scala.inline
          def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
          
          @scala.inline
          def setEntrypoints(value: Boolean): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEntrypointsUndefined: Self = StObject.set(x, "entrypoints", js.undefined)
          
          @scala.inline
          def setEnv(value: Boolean): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
          
          @scala.inline
          def setErrorDetails(value: Boolean): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
          
          @scala.inline
          def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
          
          @scala.inline
          def setExclude(value: StatsExcludeFilter): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExcludeAssets(value: StatsExcludeFilter): Self = StObject.set(x, "excludeAssets", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExcludeAssetsFunction1(value: /* assetName */ String => Boolean): Self = StObject.set(x, "excludeAssets", js.Any.fromFunction1(value))
          
          @scala.inline
          def setExcludeAssetsUndefined: Self = StObject.set(x, "excludeAssets", js.undefined)
          
          @scala.inline
          def setExcludeAssetsVarargs(value: ((js.Function1[/* assetName */ String, Boolean]) | RegExp | String)*): Self = StObject.set(x, "excludeAssets", js.Array(value :_*))
          
          @scala.inline
          def setExcludeFunction1(value: /* assetName */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
          
          @scala.inline
          def setExcludeModules(value: StatsExcludeFilter): Self = StObject.set(x, "excludeModules", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExcludeModulesFunction1(value: /* assetName */ String => Boolean): Self = StObject.set(x, "excludeModules", js.Any.fromFunction1(value))
          
          @scala.inline
          def setExcludeModulesUndefined: Self = StObject.set(x, "excludeModules", js.undefined)
          
          @scala.inline
          def setExcludeModulesVarargs(value: ((js.Function1[/* assetName */ String, Boolean]) | RegExp | String)*): Self = StObject.set(x, "excludeModules", js.Array(value :_*))
          
          @scala.inline
          def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
          
          @scala.inline
          def setExcludeVarargs(value: ((js.Function1[/* assetName */ String, Boolean]) | RegExp | String)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
          
          @scala.inline
          def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
          
          @scala.inline
          def setMaxModules(value: Double): Self = StObject.set(x, "maxModules", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxModulesUndefined: Self = StObject.set(x, "maxModules", js.undefined)
          
          @scala.inline
          def setModuleTrace(value: Boolean): Self = StObject.set(x, "moduleTrace", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModuleTraceUndefined: Self = StObject.set(x, "moduleTrace", js.undefined)
          
          @scala.inline
          def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModulesSort(value: String): Self = StObject.set(x, "modulesSort", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setModulesSortUndefined: Self = StObject.set(x, "modulesSort", js.undefined)
          
          @scala.inline
          def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
          
          @scala.inline
          def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
          
          @scala.inline
          def setProvidedExports(value: Boolean): Self = StObject.set(x, "providedExports", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setProvidedExportsUndefined: Self = StObject.set(x, "providedExports", js.undefined)
          
          @scala.inline
          def setPublicPath(value: Boolean): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
          
          @scala.inline
          def setReasons(value: Boolean): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
          
          @scala.inline
          def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
          
          @scala.inline
          def setTimings(value: Boolean): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTimingsUndefined: Self = StObject.set(x, "timings", js.undefined)
          
          @scala.inline
          def setUsedExports(value: Boolean): Self = StObject.set(x, "usedExports", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUsedExportsUndefined: Self = StObject.set(x, "usedExports", js.undefined)
          
          @scala.inline
          def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
          
          @scala.inline
          def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWarningsFilter(
            value: String | RegExp | (js.Array[String | RegExp]) | (js.Function1[/* warning */ String, Boolean])
          ): Self = StObject.set(x, "warningsFilter", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWarningsFilterFunction1(value: /* warning */ String => Boolean): Self = StObject.set(x, "warningsFilter", js.Any.fromFunction1(value))
          
          @scala.inline
          def setWarningsFilterUndefined: Self = StObject.set(x, "warningsFilter", js.undefined)
          
          @scala.inline
          def setWarningsFilterVarargs(value: (String | RegExp)*): Self = StObject.set(x, "warningsFilter", js.Array(value :_*))
          
          @scala.inline
          def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
        }
      }
      
      trait _Preset
        extends StObject
           with _ToJsonOptions
      
      trait _ToJsonOptions extends StObject
    }
  }
}
