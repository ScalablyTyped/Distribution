package typings.uglifyjsWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UglifyJsPluginOptions extends js.Object {
  var cache: js.UndefOr[Boolean | String] = js.undefined
  var exclude: js.UndefOr[RegExp | js.Array[RegExp]] = js.undefined
  var extractComments: js.UndefOr[
    Boolean | RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean]) | ExtractCommentsOptions
  ] = js.undefined
  var include: js.UndefOr[RegExp | js.Array[RegExp]] = js.undefined
  var parallel: js.UndefOr[Boolean | Double] = js.undefined
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  var test: js.UndefOr[RegExp | js.Array[RegExp]] = js.undefined
  var uglifyOptions: js.UndefOr[UglifyJsOptions] = js.undefined
  var warningsFilter: js.UndefOr[js.Function1[/* source */ String, Boolean]] = js.undefined
}

object UglifyJsPluginOptions {
  @scala.inline
  def apply(
    cache: Boolean | String = null,
    exclude: RegExp | js.Array[RegExp] = null,
    extractComments: Boolean | RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean]) | ExtractCommentsOptions = null,
    include: RegExp | js.Array[RegExp] = null,
    parallel: Boolean | Double = null,
    sourceMap: js.UndefOr[Boolean] = js.undefined,
    test: RegExp | js.Array[RegExp] = null,
    uglifyOptions: UglifyJsOptions = null,
    warningsFilter: /* source */ String => Boolean = null
  ): UglifyJsPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extractComments != null) __obj.updateDynamic("extractComments")(extractComments.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (uglifyOptions != null) __obj.updateDynamic("uglifyOptions")(uglifyOptions.asInstanceOf[js.Any])
    if (warningsFilter != null) __obj.updateDynamic("warningsFilter")(js.Any.fromFunction1(warningsFilter))
    __obj.asInstanceOf[UglifyJsPluginOptions]
  }
}

