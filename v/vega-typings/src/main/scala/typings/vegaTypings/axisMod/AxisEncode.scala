package typings.vegaTypings.axisMod

import typings.vegaTypings.encodeMod.GroupEncodeEntry
import typings.vegaTypings.encodeMod.RuleEncodeEntry
import typings.vegaTypings.encodeMod.TextEncodeEntry
import typings.vegaTypings.legendMod.GuideEncodeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisEncode extends js.Object {
  /**
    * Custom encoding for the axis container.
    */
  var axis: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.undefined
  /**
    * Custom encoding for the axis domain rule mark.
    */
  var domain: js.UndefOr[GuideEncodeEntry[RuleEncodeEntry]] = js.undefined
  /**
    * Custom encoding for axis gridline rule marks.
    */
  var grid: js.UndefOr[GuideEncodeEntry[RuleEncodeEntry]] = js.undefined
  /**
    * Custom encoding for axis label text marks.
    */
  var labels: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
  /**
    * Custom encoding for axis tick rule marks.
    */
  var ticks: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.undefined
  /**
    * Custom encoding for the axis title text mark.
    */
  var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.undefined
}

object AxisEncode {
  @scala.inline
  def apply(
    axis: GuideEncodeEntry[GroupEncodeEntry] = null,
    domain: GuideEncodeEntry[RuleEncodeEntry] = null,
    grid: GuideEncodeEntry[RuleEncodeEntry] = null,
    labels: GuideEncodeEntry[TextEncodeEntry] = null,
    ticks: GuideEncodeEntry[GroupEncodeEntry] = null,
    title: GuideEncodeEntry[TextEncodeEntry] = null
  ): AxisEncode = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisEncode]
  }
}

