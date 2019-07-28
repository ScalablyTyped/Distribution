package typings.vegaDashLite.buildSrcAxisMod

import typings.vegaDashLite.buildSrcGuideMod.GuideEncodingEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisEncoding extends js.Object {
  /**
    * Custom encoding for the axis container.
    */
  var axis: js.UndefOr[GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for the axis domain rule mark.
    */
  var domain: js.UndefOr[GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for axis gridline rule marks.
    */
  var grid: js.UndefOr[GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for axis label text marks.
    */
  var labels: js.UndefOr[GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for axis tick rule marks.
    */
  var ticks: js.UndefOr[GuideEncodingEntry] = js.undefined
  /**
    * Custom encoding for the axis title text mark.
    */
  var title: js.UndefOr[GuideEncodingEntry] = js.undefined
}

object AxisEncoding {
  @scala.inline
  def apply(
    axis: GuideEncodingEntry = null,
    domain: GuideEncodingEntry = null,
    grid: GuideEncodingEntry = null,
    labels: GuideEncodingEntry = null,
    ticks: GuideEncodingEntry = null,
    title: GuideEncodingEntry = null
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

