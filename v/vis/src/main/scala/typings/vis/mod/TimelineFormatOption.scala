package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFormatOption extends js.Object {
  var majorLabels: js.UndefOr[TimelineFormatLabelsOption | TimelineFormatLabelsFunction] = js.undefined
  var minorLabels: js.UndefOr[TimelineFormatLabelsOption | TimelineFormatLabelsFunction] = js.undefined
}

object TimelineFormatOption {
  @scala.inline
  def apply(
    majorLabels: TimelineFormatLabelsOption | TimelineFormatLabelsFunction = null,
    minorLabels: TimelineFormatLabelsOption | TimelineFormatLabelsFunction = null
  ): TimelineFormatOption = {
    val __obj = js.Dynamic.literal()
    if (majorLabels != null) __obj.updateDynamic("majorLabels")(majorLabels.asInstanceOf[js.Any])
    if (minorLabels != null) __obj.updateDynamic("minorLabels")(minorLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFormatOption]
  }
}

