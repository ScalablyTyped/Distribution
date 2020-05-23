package typings.webpackBlocksUglify.mod

import typings.std.RegExp
import typings.uglifyJs.mod.MinifyOptions
import typings.webpackBlocksUglify.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cache: js.UndefOr[String | Boolean] = js.undefined
  var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ js.Any, /* file */ js.Any, js.Object]] = js.undefined
  var chunkFilter: js.UndefOr[js.Function1[/* chunk */ js.Any, Boolean]] = js.undefined
  var exclude: js.UndefOr[TestType | js.Array[TestType]] = js.undefined
  var extractComments: js.UndefOr[Boolean | String | RegExp | ExtractCommentsFunction] = js.undefined
  var include: js.UndefOr[TestType | js.Array[TestType]] = js.undefined
  var minify: js.UndefOr[js.Function2[/* file */ js.Any, /* sourceMap */ js.Any, Code]] = js.undefined
  var parallel: js.UndefOr[Boolean | Double] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  var test: js.UndefOr[TestType | js.Array[TestType]] = js.undefined
  var uglifyOptions: js.UndefOr[MinifyOptions] = js.undefined
  var warningsFilter: js.UndefOr[js.Function2[/* warning */ js.Any, /* source */ js.Any, Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cache: String | Boolean = null,
    cacheKeys: (/* defaultCacheKeys */ js.Any, /* file */ js.Any) => js.Object = null,
    chunkFilter: /* chunk */ js.Any => Boolean = null,
    exclude: TestType | js.Array[TestType] = null,
    extractComments: Boolean | String | RegExp | ExtractCommentsFunction = null,
    include: TestType | js.Array[TestType] = null,
    minify: (/* file */ js.Any, /* sourceMap */ js.Any) => Code = null,
    parallel: Boolean | Double = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    test: TestType | js.Array[TestType] = null,
    uglifyOptions: MinifyOptions = null,
    warningsFilter: (/* warning */ js.Any, /* source */ js.Any) => Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cacheKeys != null) __obj.updateDynamic("cacheKeys")(js.Any.fromFunction2(cacheKeys))
    if (chunkFilter != null) __obj.updateDynamic("chunkFilter")(js.Any.fromFunction1(chunkFilter))
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extractComments != null) __obj.updateDynamic("extractComments")(extractComments.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (minify != null) __obj.updateDynamic("minify")(js.Any.fromFunction2(minify))
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.get.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (uglifyOptions != null) __obj.updateDynamic("uglifyOptions")(uglifyOptions.asInstanceOf[js.Any])
    if (warningsFilter != null) __obj.updateDynamic("warningsFilter")(js.Any.fromFunction2(warningsFilter))
    __obj.asInstanceOf[Options]
  }
}

