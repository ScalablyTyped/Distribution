package typings
package webpackLib.webpackMod.webpackNs.StatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToStringOptionsObject
  extends ToJsonOptionsObject
     with ToStringOptions {
  /** `webpack --colors` equivalent */
  var colors: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

object ToStringOptionsObject {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    assets: js.UndefOr[scala.Boolean] = js.undefined,
    assetsSort: java.lang.String = null,
    builtAt: js.UndefOr[scala.Boolean] = js.undefined,
    cached: js.UndefOr[scala.Boolean] = js.undefined,
    cachedAssets: js.UndefOr[scala.Boolean] = js.undefined,
    children: js.UndefOr[scala.Boolean] = js.undefined,
    chunkModules: js.UndefOr[scala.Boolean] = js.undefined,
    chunkOrigins: js.UndefOr[scala.Boolean] = js.undefined,
    chunks: js.UndefOr[scala.Boolean] = js.undefined,
    chunksSort: java.lang.String = null,
    colors: scala.Boolean | java.lang.String = null,
    context: java.lang.String = null,
    depth: js.UndefOr[scala.Boolean] = js.undefined,
    entrypoints: js.UndefOr[scala.Boolean] = js.undefined,
    env: js.UndefOr[scala.Boolean] = js.undefined,
    errorDetails: js.UndefOr[scala.Boolean] = js.undefined,
    errors: js.UndefOr[scala.Boolean] = js.undefined,
    exclude: StatsExcludeFilter = null,
    excludeAssets: StatsExcludeFilter = null,
    excludeModules: StatsExcludeFilter = null,
    hash: js.UndefOr[scala.Boolean] = js.undefined,
    maxModules: scala.Int | scala.Double = null,
    moduleTrace: js.UndefOr[scala.Boolean] = js.undefined,
    modules: js.UndefOr[scala.Boolean] = js.undefined,
    modulesSort: java.lang.String = null,
    performance: js.UndefOr[scala.Boolean] = js.undefined,
    providedExports: js.UndefOr[scala.Boolean] = js.undefined,
    publicPath: js.UndefOr[scala.Boolean] = js.undefined,
    reasons: js.UndefOr[scala.Boolean] = js.undefined,
    source: js.UndefOr[scala.Boolean] = js.undefined,
    timings: js.UndefOr[scala.Boolean] = js.undefined,
    usedExports: js.UndefOr[scala.Boolean] = js.undefined,
    version: js.UndefOr[scala.Boolean] = js.undefined,
    warnings: js.UndefOr[scala.Boolean] = js.undefined,
    warningsFilter: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) | (js.Function1[/* warning */ java.lang.String, scala.Boolean]) = null
  ): ToStringOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (!js.isUndefined(assets)) __obj.updateDynamic("assets")(assets)
    if (assetsSort != null) __obj.updateDynamic("assetsSort")(assetsSort)
    if (!js.isUndefined(builtAt)) __obj.updateDynamic("builtAt")(builtAt)
    if (!js.isUndefined(cached)) __obj.updateDynamic("cached")(cached)
    if (!js.isUndefined(cachedAssets)) __obj.updateDynamic("cachedAssets")(cachedAssets)
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(chunkModules)) __obj.updateDynamic("chunkModules")(chunkModules)
    if (!js.isUndefined(chunkOrigins)) __obj.updateDynamic("chunkOrigins")(chunkOrigins)
    if (!js.isUndefined(chunks)) __obj.updateDynamic("chunks")(chunks)
    if (chunksSort != null) __obj.updateDynamic("chunksSort")(chunksSort)
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth)
    if (!js.isUndefined(entrypoints)) __obj.updateDynamic("entrypoints")(entrypoints)
    if (!js.isUndefined(env)) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(errorDetails)) __obj.updateDynamic("errorDetails")(errorDetails)
    if (!js.isUndefined(errors)) __obj.updateDynamic("errors")(errors)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (excludeAssets != null) __obj.updateDynamic("excludeAssets")(excludeAssets.asInstanceOf[js.Any])
    if (excludeModules != null) __obj.updateDynamic("excludeModules")(excludeModules.asInstanceOf[js.Any])
    if (!js.isUndefined(hash)) __obj.updateDynamic("hash")(hash)
    if (maxModules != null) __obj.updateDynamic("maxModules")(maxModules.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleTrace)) __obj.updateDynamic("moduleTrace")(moduleTrace)
    if (!js.isUndefined(modules)) __obj.updateDynamic("modules")(modules)
    if (modulesSort != null) __obj.updateDynamic("modulesSort")(modulesSort)
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance)
    if (!js.isUndefined(providedExports)) __obj.updateDynamic("providedExports")(providedExports)
    if (!js.isUndefined(publicPath)) __obj.updateDynamic("publicPath")(publicPath)
    if (!js.isUndefined(reasons)) __obj.updateDynamic("reasons")(reasons)
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(timings)) __obj.updateDynamic("timings")(timings)
    if (!js.isUndefined(usedExports)) __obj.updateDynamic("usedExports")(usedExports)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings)
    if (warningsFilter != null) __obj.updateDynamic("warningsFilter")(warningsFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToStringOptionsObject]
  }
}

