package typings
package vegaDashLiteLib.buildSrcLegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend
  extends vegaDashLiteLib.buildSrcGuideMod.Guide
     with vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgLegendBase {
  /**
    * Mark definitions for custom legend encoding.
    *
    * @hide
    */
  var encoding: js.UndefOr[LegendEncoding] = js.undefined
  /**
    * The desired number of tick values for quantitative legends.
    */
  var tickCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * The type of the legend. Use `"symbol"` to create a discrete legend and `"gradient"` for a continuous color gradient.
    *
    * __Default value:__ `"gradient"` for non-binned quantitative fields and temporal fields; `"symbol"` otherwise.
    */
  var `type`: js.UndefOr[
    vegaDashLiteLib.vegaDashLiteLibStrings.symbol | vegaDashLiteLib.vegaDashLiteLibStrings.gradient
  ] = js.undefined
  /**
    * Explicitly set the visible legend values.
    */
  var values: js.UndefOr[
    js.Array[
      scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | scala.Double | java.lang.String
    ]
  ] = js.undefined
  /**
    * A non-positive integer indicating z-index of the legend.
    * If zindex is 0, legend should be drawn behind all chart elements.
    * To put them in front, use zindex = 1.
    * @TJS-type integer
    * @minimum 0
    */
  var zindex: js.UndefOr[scala.Double] = js.undefined
}

object Legend {
  @scala.inline
  def apply(
    encoding: LegendEncoding = null,
    entryPadding: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    orient: vegaDashLiteLib.buildSrcVegaDotSchemaMod.LegendOrient = null,
    padding: scala.Int | scala.Double = null,
    tickCount: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    `type`: vegaDashLiteLib.vegaDashLiteLibStrings.symbol | vegaDashLiteLib.vegaDashLiteLibStrings.gradient = null,
    values: js.Array[
      scala.Boolean | vegaDashLiteLib.buildSrcDatetimeMod.DateTime | scala.Double | java.lang.String
    ] = null,
    zindex: scala.Int | scala.Double = null
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

