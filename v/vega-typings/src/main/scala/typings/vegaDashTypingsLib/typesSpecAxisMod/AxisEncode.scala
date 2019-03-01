package typings
package vegaDashTypingsLib.typesSpecAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisEncode extends js.Object {
  /**
    * Custom encoding for the axis container.
    */
  var axis: js.UndefOr[
    vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.GroupEncodeEntry]
  ] = js.undefined
  /**
    * Custom encoding for the axis domain rule mark.
    */
  var domain: js.UndefOr[
    vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.RuleEncodeEntry]
  ] = js.undefined
  /**
    * Custom encoding for axis gridline rule marks.
    */
  var grid: js.UndefOr[
    vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.RuleEncodeEntry]
  ] = js.undefined
  /**
    * Custom encoding for axis label text marks.
    */
  var labels: js.UndefOr[
    vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry]
  ] = js.undefined
  /**
    * Custom encoding for axis tick rule marks.
    */
  var ticks: js.UndefOr[
    vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.GroupEncodeEntry]
  ] = js.undefined
  /**
    * Custom encoding for the axis title text mark.
    */
  var title: js.UndefOr[
    vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry]
  ] = js.undefined
}

object AxisEncode {
  @scala.inline
  def apply(
    axis: vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.GroupEncodeEntry] = null,
    domain: vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.RuleEncodeEntry] = null,
    grid: vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.RuleEncodeEntry] = null,
    labels: vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry] = null,
    ticks: vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.GroupEncodeEntry] = null,
    title: vegaDashTypingsLib.typesSpecLegendMod.GuideEncodeEntry[vegaDashTypingsLib.typesSpecEncodeMod.TextEncodeEntry] = null
  ): AxisEncode = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AxisEncode]
  }
}

