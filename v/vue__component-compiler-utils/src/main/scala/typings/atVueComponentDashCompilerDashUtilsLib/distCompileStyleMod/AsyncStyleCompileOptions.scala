package typings
package atVueComponentDashCompilerDashUtilsLib.distCompileStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncStyleCompileOptions extends StyleCompileOptions {
  var isAsync: js.UndefOr[scala.Boolean] = js.undefined
}

object AsyncStyleCompileOptions {
  @scala.inline
  def apply(
    filename: java.lang.String,
    id: java.lang.String,
    source: java.lang.String,
    isAsync: js.UndefOr[scala.Boolean] = js.undefined,
    map: js.Any = null,
    postcssOptions: js.Any = null,
    postcssPlugins: js.Array[_] = null,
    preprocessLang: java.lang.String = null,
    preprocessOptions: js.Any = null,
    scoped: js.UndefOr[scala.Boolean] = js.undefined,
    trim: js.UndefOr[scala.Boolean] = js.undefined
  ): AsyncStyleCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename, id = id, source = source)
    if (!js.isUndefined(isAsync)) __obj.updateDynamic("isAsync")(isAsync)
    if (map != null) __obj.updateDynamic("map")(map)
    if (postcssOptions != null) __obj.updateDynamic("postcssOptions")(postcssOptions)
    if (postcssPlugins != null) __obj.updateDynamic("postcssPlugins")(postcssPlugins)
    if (preprocessLang != null) __obj.updateDynamic("preprocessLang")(preprocessLang)
    if (preprocessOptions != null) __obj.updateDynamic("preprocessOptions")(preprocessOptions)
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[AsyncStyleCompileOptions]
  }
}

