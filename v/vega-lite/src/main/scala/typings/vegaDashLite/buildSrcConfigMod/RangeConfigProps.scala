package typings.vegaDashLite.buildSrcConfigMod

import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeConfigProps extends js.Object {
  /**
    * Default range for _nominal_ (categorical) fields.
    */
  var category: js.UndefOr[js.Array[String] | VgScheme] = js.undefined
  /**
    * Default range for diverging _quantitative_ fields.
    */
  var diverging: js.UndefOr[js.Array[String] | VgScheme] = js.undefined
  /**
    * Default range for _quantitative_ heatmaps.
    */
  var heatmap: js.UndefOr[js.Array[String] | VgScheme] = js.undefined
  /**
    * Default range for _ordinal_ fields.
    */
  var ordinal: js.UndefOr[js.Array[String] | VgScheme] = js.undefined
  /**
    * Default range for _quantitative_ and _temporal_ fields.
    */
  var ramp: js.UndefOr[js.Array[String] | VgScheme] = js.undefined
  /**
    * Default range palette for the `shape` channel.
    */
  var symbol: js.UndefOr[js.Array[String]] = js.undefined
}

object RangeConfigProps {
  @scala.inline
  def apply(
    category: js.Array[String] | VgScheme = null,
    diverging: js.Array[String] | VgScheme = null,
    heatmap: js.Array[String] | VgScheme = null,
    ordinal: js.Array[String] | VgScheme = null,
    ramp: js.Array[String] | VgScheme = null,
    symbol: js.Array[String] = null
  ): RangeConfigProps = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (diverging != null) __obj.updateDynamic("diverging")(diverging.asInstanceOf[js.Any])
    if (heatmap != null) __obj.updateDynamic("heatmap")(heatmap.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (ramp != null) __obj.updateDynamic("ramp")(ramp.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    __obj.asInstanceOf[RangeConfigProps]
  }
}

