package typings.atVueComponentDashCompilerDashUtils.distCompileStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncStyleCompileOptions extends StyleCompileOptions {
  var isAsync: js.UndefOr[Boolean] = js.undefined
}

object AsyncStyleCompileOptions {
  @scala.inline
  def apply(
    filename: String,
    id: String,
    source: String,
    isAsync: js.UndefOr[Boolean] = js.undefined,
    map: js.Any = null,
    postcssOptions: js.Any = null,
    postcssPlugins: js.Array[_] = null,
    preprocessLang: String = null,
    preprocessOptions: js.Any = null,
    scoped: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined
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

