package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecEncodeMod.SymbolShape
import typings.vegaDashTypings.typesSpecScaleMod.RangeScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Category extends js.Object {
  var category: js.UndefOr[RangeScheme | js.Array[String]] = js.undefined
  var diverging: js.UndefOr[RangeScheme | js.Array[String]] = js.undefined
  var heatmap: js.UndefOr[RangeScheme | js.Array[String]] = js.undefined
  var ordinal: js.UndefOr[RangeScheme | js.Array[String]] = js.undefined
  var ramp: js.UndefOr[RangeScheme | js.Array[String]] = js.undefined
  var symbol: js.UndefOr[js.Array[SymbolShape]] = js.undefined
}

object Anon_Category {
  @scala.inline
  def apply(
    category: RangeScheme | js.Array[String] = null,
    diverging: RangeScheme | js.Array[String] = null,
    heatmap: RangeScheme | js.Array[String] = null,
    ordinal: RangeScheme | js.Array[String] = null,
    ramp: RangeScheme | js.Array[String] = null,
    symbol: js.Array[SymbolShape] = null
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

