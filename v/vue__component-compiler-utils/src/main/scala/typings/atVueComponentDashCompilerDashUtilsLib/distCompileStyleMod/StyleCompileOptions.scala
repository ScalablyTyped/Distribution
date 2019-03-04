package typings
package atVueComponentDashCompilerDashUtilsLib.distCompileStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleCompileOptions extends js.Object {
  var filename: java.lang.String
  var id: java.lang.String
  var map: js.UndefOr[js.Any] = js.undefined
  var postcssOptions: js.UndefOr[js.Any] = js.undefined
  var postcssPlugins: js.UndefOr[js.Array[_]] = js.undefined
  var preprocessLang: js.UndefOr[java.lang.String] = js.undefined
  var preprocessOptions: js.UndefOr[js.Any] = js.undefined
  var scoped: js.UndefOr[scala.Boolean] = js.undefined
  var source: java.lang.String
  var trim: js.UndefOr[scala.Boolean] = js.undefined
}

object StyleCompileOptions {
  @scala.inline
  def apply(
    filename: java.lang.String,
    id: java.lang.String,
    source: java.lang.String,
    map: js.Any = null,
    postcssOptions: js.Any = null,
    postcssPlugins: js.Array[_] = null,
    preprocessLang: java.lang.String = null,
    preprocessOptions: js.Any = null,
    scoped: js.UndefOr[scala.Boolean] = js.undefined,
    trim: js.UndefOr[scala.Boolean] = js.undefined
  ): StyleCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename, id = id, source = source)
    if (map != null) __obj.updateDynamic("map")(map)
    if (postcssOptions != null) __obj.updateDynamic("postcssOptions")(postcssOptions)
    if (postcssPlugins != null) __obj.updateDynamic("postcssPlugins")(postcssPlugins)
    if (preprocessLang != null) __obj.updateDynamic("preprocessLang")(preprocessLang)
    if (preprocessOptions != null) __obj.updateDynamic("preprocessOptions")(preprocessOptions)
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[StyleCompileOptions]
  }
}

