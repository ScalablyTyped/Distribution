package typings.vegaDashLite.buildSrcLegendMod

import typings.vegaDashLite.buildSrcDatetimeMod.DateTime
import typings.vegaDashLite.buildSrcGuideMod.Guide
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.LegendOrient
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgLegendBase
import typings.vegaDashLite.vegaDashLiteStrings.gradient
import typings.vegaDashLite.vegaDashLiteStrings.symbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend
  extends Guide
     with VgLegendBase {
  /**
    * Mark definitions for custom legend encoding.
    *
    * @hide
    */
  var encoding: js.UndefOr[LegendEncoding] = js.undefined
  /**
    * The desired number of tick values for quantitative legends.
    */
  var tickCount: js.UndefOr[Double] = js.undefined
  /**
    * The type of the legend. Use `"symbol"` to create a discrete legend and `"gradient"` for a continuous color gradient.
    *
    * __Default value:__ `"gradient"` for non-binned quantitative fields and temporal fields; `"symbol"` otherwise.
    */
  var `type`: js.UndefOr[symbol | gradient] = js.undefined
  /**
    * Explicitly set the visible legend values.
    */
  var values: js.UndefOr[js.Array[Boolean | DateTime | Double | String]] = js.undefined
  /**
    * A non-positive integer indicating z-index of the legend.
    * If zindex is 0, legend should be drawn behind all chart elements.
    * To put them in front, use zindex = 1.
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[Double] = js.undefined
}

object Legend {
  @scala.inline
  def apply(
    encoding: LegendEncoding = null,
    entryPadding: Int | Double = null,
    format: String = null,
    offset: Int | Double = null,
    orient: LegendOrient = null,
    padding: Int | Double = null,
    tickCount: Int | Double = null,
    title: String = null,
    `type`: symbol | gradient = null,
    values: js.Array[Boolean | DateTime | Double | String] = null,
    zindex: Int | Double = null
  ): Legend = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (entryPadding != null) __obj.updateDynamic("entryPadding")(entryPadding.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
}

