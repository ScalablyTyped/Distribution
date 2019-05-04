package typings
package vegaDashLiteLib.buildSrcConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeConfigProps extends js.Object {
  /**
    * Default range for _nominal_ (categorical) fields.
    */
  var category: js.UndefOr[js.Array[java.lang.String] | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgScheme] = js.undefined
  /**
    * Default range for diverging _quantitative_ fields.
    */
  var diverging: js.UndefOr[js.Array[java.lang.String] | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgScheme] = js.undefined
  /**
    * Default range for _quantitative_ heatmaps.
    */
  var heatmap: js.UndefOr[js.Array[java.lang.String] | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgScheme] = js.undefined
  /**
    * Default range for _ordinal_ fields.
    */
  var ordinal: js.UndefOr[js.Array[java.lang.String] | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgScheme] = js.undefined
  /**
    * Default range for _quantitative_ and _temporal_ fields.
    */
  var ramp: js.UndefOr[js.Array[java.lang.String] | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgScheme] = js.undefined
  /**
    * Default range palette for the `shape` channel.
    */
  var symbol: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RangeConfigProps {
  @scala.inline
  def apply(
    category: js.Array[java.lang.String] | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgScheme = null,
    diverging: js.Array[java.lang.String] | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgScheme = null,
    heatmap: js.Array[java.lang.String] | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgScheme = null,
    ordinal: js.Array[java.lang.String] | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgScheme = null,
    ramp: js.Array[java.lang.String] | vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgScheme = null,
    symbol: js.Array[java.lang.String] = null
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

