package typings
package uglifyjsDashWebpackDashPluginLib.uglifyjsDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UglifyJsPluginOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var exclude: js.UndefOr[stdLib.RegExp | js.Array[stdLib.RegExp]] = js.undefined
  var extractComments: js.UndefOr[
    scala.Boolean | stdLib.RegExp | (js.Function2[/* node */ js.Object, /* comment */ java.lang.String, scala.Boolean]) | ExtractCommentsOptions
  ] = js.undefined
  var include: js.UndefOr[stdLib.RegExp | js.Array[stdLib.RegExp]] = js.undefined
  var parallel: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  var test: js.UndefOr[stdLib.RegExp | js.Array[stdLib.RegExp]] = js.undefined
  var uglifyOptions: js.UndefOr[UglifyJsOptions] = js.undefined
  var warningsFilter: js.UndefOr[js.Function1[/* source */ java.lang.String, scala.Boolean]] = js.undefined
}

object UglifyJsPluginOptions {
  @scala.inline
  def apply(
    cache: scala.Boolean | java.lang.String = null,
    exclude: stdLib.RegExp | js.Array[stdLib.RegExp] = null,
    extractComments: scala.Boolean | stdLib.RegExp | (js.Function2[/* node */ js.Object, /* comment */ java.lang.String, scala.Boolean]) | ExtractCommentsOptions = null,
    include: stdLib.RegExp | js.Array[stdLib.RegExp] = null,
    parallel: scala.Boolean | scala.Double = null,
    sourceMap: js.UndefOr[scala.Boolean] = js.undefined,
    test: stdLib.RegExp | js.Array[stdLib.RegExp] = null,
    uglifyOptions: UglifyJsOptions = null,
    warningsFilter: /* source */ java.lang.String => scala.Boolean = null
  ): UglifyJsPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (extractComments != null) __obj.updateDynamic("extractComments")(extractComments.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (uglifyOptions != null) __obj.updateDynamic("uglifyOptions")(uglifyOptions)
    if (warningsFilter != null) __obj.updateDynamic("warningsFilter")(js.Any.fromFunction1(warningsFilter))
    __obj.asInstanceOf[UglifyJsPluginOptions]
  }
}

