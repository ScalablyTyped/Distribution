package typings
package webpackLib.webpackMod.webpackNs.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ToJsonOptionsObject extends js.Object {
  /** fallback value for stats options when an option is not defined (has precedence over local webpack defaults) */
  var all: js.UndefOr[scala.Boolean] = js.undefined
  /** Add asset Information */
  var assets: js.UndefOr[scala.Boolean] = js.undefined
  /** Sort assets by a field */
  var assetsSort: js.UndefOr[java.lang.String] = js.undefined
  /** Add built at time information */
  var builtAt: js.UndefOr[scala.Boolean] = js.undefined
  /** Add information about cached (not built) modules */
  var cached: js.UndefOr[scala.Boolean] = js.undefined
  /** Show cached assets (setting this to `false` only shows emitted files) */
  var cachedAssets: js.UndefOr[scala.Boolean] = js.undefined
  /** Add children information */
  var children: js.UndefOr[scala.Boolean] = js.undefined
  /** Add built modules information to chunk information */
  var chunkModules: js.UndefOr[scala.Boolean] = js.undefined
  /** Add the origins of chunks and chunk merging info */
  var chunkOrigins: js.UndefOr[scala.Boolean] = js.undefined
  /** Add chunk information (setting this to `false` allows for a less verbose output) */
  var chunks: js.UndefOr[scala.Boolean] = js.undefined
  /** Sort the chunks by a field */
  var chunksSort: js.UndefOr[java.lang.String] = js.undefined
  /** Context directory for request shortening */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /** Display the distance from the entry point for each module */
  var depth: js.UndefOr[scala.Boolean] = js.undefined
  /** Display the entry points with the corresponding bundles */
  var entrypoints: js.UndefOr[scala.Boolean] = js.undefined
  /** Add --env information */
  var env: js.UndefOr[scala.Boolean] = js.undefined
  /** Add details to errors (like resolving log) */
  var errorDetails: js.UndefOr[scala.Boolean] = js.undefined
  /** Add errors */
  var errors: js.UndefOr[scala.Boolean] = js.undefined
  /** See excludeModules */
  var exclude: js.UndefOr[StatsExcludeFilter] = js.undefined
  /** Exclude assets from being displayed in stats */
  var excludeAssets: js.UndefOr[StatsExcludeFilter] = js.undefined
  /** Exclude modules from being displayed in stats */
  var excludeModules: js.UndefOr[StatsExcludeFilter] = js.undefined
  /** Add the hash of the compilation */
  var hash: js.UndefOr[scala.Boolean] = js.undefined
  /** Set the maximum number of modules to be shown */
  var maxModules: js.UndefOr[scala.Double] = js.undefined
  /** Show dependencies and origin of warnings/errors */
  var moduleTrace: js.UndefOr[scala.Boolean] = js.undefined
  /** Add built modules information */
  var modules: js.UndefOr[scala.Boolean] = js.undefined
  /** Sort the modules by a field */
  var modulesSort: js.UndefOr[java.lang.String] = js.undefined
  /** Show performance hint when file size exceeds `performance.maxAssetSize` */
  var performance: js.UndefOr[scala.Boolean] = js.undefined
  /** Show the exports of the modules */
  var providedExports: js.UndefOr[scala.Boolean] = js.undefined
  /** Add public path information */
  var publicPath: js.UndefOr[scala.Boolean] = js.undefined
  /** Add information about the reasons why modules are included */
  var reasons: js.UndefOr[scala.Boolean] = js.undefined
  /** Add the source code of modules */
  var source: js.UndefOr[scala.Boolean] = js.undefined
  /** Add timing information */
  var timings: js.UndefOr[scala.Boolean] = js.undefined
  /** Show which exports of a module are used */
  var usedExports: js.UndefOr[scala.Boolean] = js.undefined
  /** Add webpack version information */
  var version: js.UndefOr[scala.Boolean] = js.undefined
  /** Add warnings */
  var warnings: js.UndefOr[scala.Boolean] = js.undefined
  /** Filter warnings to be shown */
  var warningsFilter: js.UndefOr[
    java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) | (js.Function1[/* warning */ java.lang.String, scala.Boolean])
  ] = js.undefined
}

