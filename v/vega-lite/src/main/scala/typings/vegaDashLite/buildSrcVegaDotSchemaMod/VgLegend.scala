package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgLegend extends js.Object {
  var encode: js.UndefOr[VgLegendEncode] = js.undefined
  var entryPadding: js.UndefOr[Double] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[String] = js.undefined
  var orient: js.UndefOr[LegendOrient] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[String] = js.undefined
  var tickCount: js.UndefOr[Double] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[LegendType] = js.undefined
  var values: js.UndefOr[js.Array[_] | VgSignalRef] = js.undefined
  var zindex: js.UndefOr[Double] = js.undefined
}

object VgLegend {
  @scala.inline
  def apply(
    encode: VgLegendEncode = null,
    entryPadding: Int | Double = null,
    fill: String = null,
    format: String = null,
    offset: Int | Double = null,
    opacity: String = null,
    orient: LegendOrient = null,
    padding: Int | Double = null,
    shape: String = null,
    size: String = null,
    stroke: String = null,
    tickCount: Int | Double = null,
    title: String = null,
    `type`: LegendType = null,
    values: js.Array[_] | VgSignalRef = null,
    zindex: Int | Double = null
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

