package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Category extends js.Object {
  var category: js.UndefOr[vegaDashTypingsLib.typesSpecScaleMod.RangeScheme | js.Array[java.lang.String]] = js.undefined
  var diverging: js.UndefOr[vegaDashTypingsLib.typesSpecScaleMod.RangeScheme | js.Array[java.lang.String]] = js.undefined
  var heatmap: js.UndefOr[vegaDashTypingsLib.typesSpecScaleMod.RangeScheme | js.Array[java.lang.String]] = js.undefined
  var ordinal: js.UndefOr[vegaDashTypingsLib.typesSpecScaleMod.RangeScheme | js.Array[java.lang.String]] = js.undefined
  var ramp: js.UndefOr[vegaDashTypingsLib.typesSpecScaleMod.RangeScheme | js.Array[java.lang.String]] = js.undefined
  var symbol: js.UndefOr[js.Array[vegaDashTypingsLib.typesSpecEncodeMod.SymbolShape]] = js.undefined
}

object Anon_Category {
  @scala.inline
  def apply(
    category: vegaDashTypingsLib.typesSpecScaleMod.RangeScheme | js.Array[java.lang.String] = null,
    diverging: vegaDashTypingsLib.typesSpecScaleMod.RangeScheme | js.Array[java.lang.String] = null,
    heatmap: vegaDashTypingsLib.typesSpecScaleMod.RangeScheme | js.Array[java.lang.String] = null,
    ordinal: vegaDashTypingsLib.typesSpecScaleMod.RangeScheme | js.Array[java.lang.String] = null,
    ramp: vegaDashTypingsLib.typesSpecScaleMod.RangeScheme | js.Array[java.lang.String] = null,
    symbol: js.Array[vegaDashTypingsLib.typesSpecEncodeMod.SymbolShape] = null
  ): Anon_Category = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (diverging != null) __obj.updateDynamic("diverging")(diverging.asInstanceOf[js.Any])
    if (heatmap != null) __obj.updateDynamic("heatmap")(heatmap.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (ramp != null) __obj.updateDynamic("ramp")(ramp.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[Anon_Category]
  }
}

