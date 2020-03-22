package typings.webpack.mod.Stats

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToJsonOptionsObject extends _ToJsonOptions {
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
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    assets: js.UndefOr[Boolean] = js.undefined,
    assetsSort: String = null,
    builtAt: js.UndefOr[Boolean] = js.undefined,
    cached: js.UndefOr[Boolean] = js.undefined,
    cachedAssets: js.UndefOr[Boolean] = js.undefined,
    children: js.UndefOr[Boolean] = js.undefined,
    chunkGroups: js.UndefOr[Boolean] = js.undefined,
    chunkModules: js.UndefOr[Boolean] = js.undefined,
    chunkOrigins: js.UndefOr[Boolean] = js.undefined,
    chunks: js.UndefOr[Boolean] = js.undefined,
    chunksSort: String = null,
    context: String = null,
    depth: js.UndefOr[Boolean] = js.undefined,
    entrypoints: js.UndefOr[Boolean] = js.undefined,
    env: js.UndefOr[Boolean] = js.undefined,
    errorDetails: js.UndefOr[Boolean] = js.undefined,
    errors: js.UndefOr[Boolean] = js.undefined,
    exclude: StatsExcludeFilter = null,
    excludeAssets: StatsExcludeFilter = null,
    excludeModules: StatsExcludeFilter = null,
    hash: js.UndefOr[Boolean] = js.undefined,
    maxModules: Int | Double = null,
    moduleTrace: js.UndefOr[Boolean] = js.undefined,
    modules: js.UndefOr[Boolean] = js.undefined,
    modulesSort: String = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    providedExports: js.UndefOr[Boolean] = js.undefined,
    publicPath: js.UndefOr[Boolean] = js.undefined,
    reasons: js.UndefOr[Boolean] = js.undefined,
    source: js.UndefOr[Boolean] = js.undefined,
    timings: js.UndefOr[Boolean] = js.undefined,
    usedExports: js.UndefOr[Boolean] = js.undefined,
    version: js.UndefOr[Boolean] = js.undefined,
    warnings: js.UndefOr[Boolean] = js.undefined,
    warningsFilter: String | RegExp | (js.Array[String | RegExp]) | (js.Function1[/* warning */ String, Boolean]) = null
  ): ToJsonOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (!js.isUndefined(assets)) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    if (assetsSort != null) __obj.updateDynamic("assetsSort")(assetsSort.asInstanceOf[js.Any])
    if (!js.isUndefined(builtAt)) __obj.updateDynamic("builtAt")(builtAt.asInstanceOf[js.Any])
    if (!js.isUndefined(cached)) __obj.updateDynamic("cached")(cached.asInstanceOf[js.Any])
    if (!js.isUndefined(cachedAssets)) __obj.updateDynamic("cachedAssets")(cachedAssets.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkGroups)) __obj.updateDynamic("chunkGroups")(chunkGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkModules)) __obj.updateDynamic("chunkModules")(chunkModules.asInstanceOf[js.Any])
    if (!js.isUndefined(chunkOrigins)) __obj.updateDynamic("chunkOrigins")(chunkOrigins.asInstanceOf[js.Any])
    if (!js.isUndefined(chunks)) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (chunksSort != null) __obj.updateDynamic("chunksSort")(chunksSort.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(entrypoints)) __obj.updateDynamic("entrypoints")(entrypoints.asInstanceOf[js.Any])
    if (!js.isUndefined(env)) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(errorDetails)) __obj.updateDynamic("errorDetails")(errorDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(errors)) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (excludeAssets != null) __obj.updateDynamic("excludeAssets")(excludeAssets.asInstanceOf[js.Any])
    if (excludeModules != null) __obj.updateDynamic("excludeModules")(excludeModules.asInstanceOf[js.Any])
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (maxModules != null) __obj.updateDynamic("maxModules")(maxModules.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleTrace)) __obj.updateDynamic("moduleTrace")(moduleTrace.asInstanceOf[js.Any])
    if (!js.isUndefined(modules)) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (modulesSort != null) __obj.updateDynamic("modulesSort")(modulesSort.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (!js.isUndefined(providedExports)) __obj.updateDynamic("providedExports")(providedExports.asInstanceOf[js.Any])
    if (!js.isUndefined(publicPath)) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (!js.isUndefined(reasons)) __obj.updateDynamic("reasons")(reasons.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(timings)) __obj.updateDynamic("timings")(timings.asInstanceOf[js.Any])
    if (!js.isUndefined(usedExports)) __obj.updateDynamic("usedExports")(usedExports.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    if (warningsFilter != null) __obj.updateDynamic("warningsFilter")(warningsFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToJsonOptionsObject]
  }
}

