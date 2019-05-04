package typings
package vegaDashLiteLib.buildSrcAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisEncoding extends js.Object {
  /**
    * Custom encoding for the axis container.
    */
  var axis: js.UndefOr[vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for the axis domain rule mark.
    */
  var domain: js.UndefOr[vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for axis gridline rule marks.
    */
  var grid: js.UndefOr[vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for axis label text marks.
    */
  var labels: js.UndefOr[vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for axis tick rule marks.
    */
  var ticks: js.UndefOr[vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for the axis title text mark.
    */
  var title: js.UndefOr[vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry] = js.undefined
}

object AxisEncoding {
  @scala.inline
  def apply(
    axis: vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry = null,
    domain: vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry = null,
    grid: vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry = null,
    labels: vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry = null,
    ticks: vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry = null,
    title: vegaDashLiteLib.buildSrcGuideMod.GuideEncodingEntry = null
  ): AxisEncoding = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AxisEncoding]
  }
}

