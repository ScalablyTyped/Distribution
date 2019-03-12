package typings
package terserDashWebpackDashPluginLib.terserDashWebpackDashPluginMod.TerserPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerserPluginOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ js.Any, /* file */ js.Any, js.Object]] = js.undefined
  var chunkFilter: js.UndefOr[
    js.Function1[/* chunk */ webpackLib.webpackMod.compilationNs.Chunk, scala.Boolean]
  ] = js.undefined
  var exclude: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  var extractComments: js.UndefOr[
    scala.Boolean | java.lang.String | stdLib.RegExp | ExtractCommentFn | ExtractCommentOptions
  ] = js.undefined
  var include: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  var minify: js.UndefOr[js.Function2[/* file */ js.Any, /* sourceMap */ js.Any, MinifyResult]] = js.undefined
  var parallel: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  var terserOptions: js.UndefOr[terserLib.terserMod.MinifyOptions] = js.undefined
  var test: js.UndefOr[java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp])] = js.undefined
  var warningsFilter: js.UndefOr[js.Function2[/* warning */ js.Any, /* source */ js.Any, scala.Boolean]] = js.undefined
}

object TerserPluginOptions {
  @scala.inline
  def apply(
    cache: scala.Boolean | java.lang.String = null,
    cacheKeys: (/* defaultCacheKeys */ js.Any, /* file */ js.Any) => js.Object = null,
    chunkFilter: /* chunk */ webpackLib.webpackMod.compilationNs.Chunk => scala.Boolean = null,
    exclude: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) = null,
    extractComments: scala.Boolean | java.lang.String | stdLib.RegExp | ExtractCommentFn | ExtractCommentOptions = null,
    include: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) = null,
    minify: (/* file */ js.Any, /* sourceMap */ js.Any) => MinifyResult = null,
    parallel: scala.Boolean | scala.Double = null,
    sourceMap: js.UndefOr[scala.Boolean] = js.undefined,
    terserOptions: terserLib.terserMod.MinifyOptions = null,
    test: java.lang.String | stdLib.RegExp | (js.Array[java.lang.String | stdLib.RegExp]) = null,
    warningsFilter: (/* warning */ js.Any, /* source */ js.Any) => scala.Boolean = null
  ): TerserPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheKeys != null) __obj.updateDynamic("cacheKeys")(js.Any.fromFunction2(cacheKeys))
    if (chunkFilter != null) __obj.updateDynamic("chunkFilter")(js.Any.fromFunction1(chunkFilter))
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extractComments != null) __obj.updateDynamic("extractComments")(extractComments.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (minify != null) __obj.updateDynamic("minify")(js.Any.fromFunction2(minify))
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    if (terserOptions != null) __obj.updateDynamic("terserOptions")(terserOptions)
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (warningsFilter != null) __obj.updateDynamic("warningsFilter")(js.Any.fromFunction2(warningsFilter))
    __obj.asInstanceOf[TerserPluginOptions]
  }
}

