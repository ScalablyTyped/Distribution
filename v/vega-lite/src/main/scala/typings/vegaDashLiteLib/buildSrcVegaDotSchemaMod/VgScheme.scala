package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgScheme
  extends vegaDashLiteLib.buildSrcConfigMod._RangeConfigValue
     with _VgRange {
  var count: js.UndefOr[scala.Double] = js.undefined
  var extent: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var scheme: java.lang.String
}

object VgScheme {
  @scala.inline
  def apply(
    scheme: java.lang.String,
    count: scala.Int | scala.Double = null,
    extent: js.Array[scala.Double] = null
  ): VgScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    __obj.asInstanceOf[VgScheme]
  }
}

