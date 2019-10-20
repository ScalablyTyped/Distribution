package typings.atWebpackDashBlocksBabel.atWebpackDashBlocksBabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait babel extends js.Object {
  var cacheDirectory: js.UndefOr[Boolean] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  var presets: js.UndefOr[js.Array[String]] = js.undefined
}

object babel {
  @scala.inline
  def apply(
    cacheDirectory: js.UndefOr[Boolean] = js.undefined,
    plugins: js.Array[String] = null,
    presets: js.Array[String] = null
  ): babel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheDirectory)) __obj.updateDynamic("cacheDirectory")(cacheDirectory)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (presets != null) __obj.updateDynamic("presets")(presets)
    __obj.asInstanceOf[babel]
  }
}

