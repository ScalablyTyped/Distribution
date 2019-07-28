package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.buildSrcConfigMod._RangeConfigValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgScheme
  extends _RangeConfigValue
     with _VgRange {
  var count: js.UndefOr[Double] = js.undefined
  var extent: js.UndefOr[js.Array[Double]] = js.undefined
  var scheme: String
}

object VgScheme {
  @scala.inline
  def apply(scheme: String, count: Int | Double = null, extent: js.Array[Double] = null): VgScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    __obj.asInstanceOf[VgScheme]
  }
}

