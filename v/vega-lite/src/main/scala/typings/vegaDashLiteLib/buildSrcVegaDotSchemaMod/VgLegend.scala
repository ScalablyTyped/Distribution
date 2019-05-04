package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgLegend extends js.Object {
  var encode: js.UndefOr[VgLegendEncode] = js.undefined
  var entryPadding: js.UndefOr[scala.Double] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[java.lang.String] = js.undefined
  var orient: js.UndefOr[LegendOrient] = js.undefined
  var padding: js.UndefOr[scala.Double] = js.undefined
  var shape: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var tickCount: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[LegendType] = js.undefined
  var values: js.UndefOr[js.Array[_] | VgSignalRef] = js.undefined
  var zindex: js.UndefOr[scala.Double] = js.undefined
}

object VgLegend {
  @scala.inline
  def apply(
    encode: VgLegendEncode = null,
    entryPadding: scala.Int | scala.Double = null,
    fill: java.lang.String = null,
    format: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    opacity: java.lang.String = null,
    orient: LegendOrient = null,
    padding: scala.Int | scala.Double = null,
    shape: java.lang.String = null,
    size: java.lang.String = null,
    stroke: java.lang.String = null,
    tickCount: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    `type`: LegendType = null,
    values: js.Array[_] | VgSignalRef = null,
    zindex: scala.Int | scala.Double = null
  ): VgLegend = {
    val __obj = js.Dynamic.literal()
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (entryPadding != null) __obj.updateDynamic("entryPadding")(entryPadding.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (format != null) __obj.updateDynamic("format")(format)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity)
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (size != null) __obj.updateDynamic("size")(size)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgLegend]
  }
}

