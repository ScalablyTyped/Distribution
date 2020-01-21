package typings.terserWebpackPlugin.mod

import typings.std.RegExp
import typings.terser.mod.MinifyOptions
import typings.webpack.mod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerserPluginOptions extends js.Object {
  var cache: js.UndefOr[Boolean | String] = js.undefined
  var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ js.Any, /* file */ js.Any, js.Object]] = js.undefined
  var chunkFilter: js.UndefOr[js.Function1[/* chunk */ Chunk, Boolean]] = js.undefined
  var exclude: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  var extractComments: js.UndefOr[Boolean | String | RegExp | ExtractCommentFn | ExtractCommentOptions] = js.undefined
  var include: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  var minify: js.UndefOr[js.Function2[/* file */ js.Any, /* sourceMap */ js.Any, MinifyResult]] = js.undefined
  var parallel: js.UndefOr[Boolean | Double] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  var terserOptions: js.UndefOr[MinifyOptions] = js.undefined
  var test: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
  var warningsFilter: js.UndefOr[
    js.Function3[/* warning */ String, /* source */ js.UndefOr[String], /* file */ String, Boolean]
  ] = js.undefined
}

object TerserPluginOptions {
  @scala.inline
  def apply(
    cache: Boolean | String = null,
    cacheKeys: (/* defaultCacheKeys */ js.Any, /* file */ js.Any) => js.Object = null,
    chunkFilter: /* chunk */ Chunk => Boolean = null,
    exclude: String | RegExp | (js.Array[String | RegExp]) = null,
    extractComments: Boolean | String | RegExp | ExtractCommentFn | ExtractCommentOptions = null,
    include: String | RegExp | (js.Array[String | RegExp]) = null,
    minify: (/* file */ js.Any, /* sourceMap */ js.Any) => MinifyResult = null,
    parallel: Boolean | Double = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    terserOptions: MinifyOptions = null,
    test: String | RegExp | (js.Array[String | RegExp]) = null,
    warningsFilter: (/* warning */ String, /* source */ js.UndefOr[String], /* file */ String) => Boolean = null
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
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (terserOptions != null) __obj.updateDynamic("terserOptions")(terserOptions.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (warningsFilter != null) __obj.updateDynamic("warningsFilter")(js.Any.fromFunction3(warningsFilter))
    __obj.asInstanceOf[TerserPluginOptions]
  }
}

