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
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(isAsync)) __obj.updateDynamic("isAsync")(isAsync.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (postcssOptions != null) __obj.updateDynamic("postcssOptions")(postcssOptions.asInstanceOf[js.Any])
    if (postcssPlugins != null) __obj.updateDynamic("postcssPlugins")(postcssPlugins.asInstanceOf[js.Any])
    if (preprocessLang != null) __obj.updateDynamic("preprocessLang")(preprocessLang.asInstanceOf[js.Any])
    if (preprocessOptions != null) __obj.updateDynamic("preprocessOptions")(preprocessOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncStyleCompileOptions]
  }
}

