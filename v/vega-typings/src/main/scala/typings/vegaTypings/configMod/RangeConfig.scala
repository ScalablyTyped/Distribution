package typings.vegaTypings.configMod

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.encodeMod.SymbolShape
import typings.vegaTypings.scaleMod.RangeScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeConfig
  extends /* name */ StringDictionary[RangeScheme | (js.Array[Boolean | Double | String | SymbolShape])] {
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for categorical data.
    */
  var category: js.UndefOr[RangeScheme | js.Array[String]] = js.undefined
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for diverging quantitative ramps.
    */
  var diverging: js.UndefOr[RangeScheme | js.Array[String]] = js.undefined
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for quantitative heatmaps.
    */
  var heatmap: js.UndefOr[RangeScheme | js.Array[String]] = js.undefined
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for rank-ordered data.
    */
  var ordinal: js.UndefOr[RangeScheme | js.Array[String]] = js.undefined
  /**
    * Default [color scheme](https://vega.github.io/vega/docs/schemes/) for sequential quantitative ramps.
    */
  var ramp: js.UndefOr[RangeScheme | js.Array[String]] = js.undefined
  /**
    * Array of [symbol](https://vega.github.io/vega/docs/marks/symbol/) names or paths for the default shape palette.
    */
  var symbol: js.UndefOr[js.Array[SymbolShape]] = js.undefined
}

object RangeConfig {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[RangeScheme | (js.Array[Boolean | Double | String | SymbolShape])] = null,
    category: RangeScheme | js.Array[String] = null,
    diverging: RangeScheme | js.Array[String] = null,
    heatmap: RangeScheme | js.Array[String] = null,
    ordinal: RangeScheme | js.Array[String] = null,
    ramp: RangeScheme | js.Array[String] = null,
    symbol: js.Array[SymbolShape] = null
  ): RangeConfig = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (diverging != null) __obj.updateDynamic("diverging")(diverging.asInstanceOf[js.Any])
    if (heatmap != null) __obj.updateDynamic("heatmap")(heatmap.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (ramp != null) __obj.updateDynamic("ramp")(ramp.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeConfig]
  }
}

