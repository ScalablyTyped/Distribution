package typings.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VictoryBoxPlotStyleInterface extends VictoryStyleInterface {
  var max: js.UndefOr[VictoryStyleObject] = js.undefined
  var maxLabels: js.UndefOr[VictoryStyleObject] = js.undefined
  var median: js.UndefOr[VictoryStyleObject] = js.undefined
  var medianLabels: js.UndefOr[VictoryStyleObject] = js.undefined
  var min: js.UndefOr[VictoryStyleObject] = js.undefined
  var minLabels: js.UndefOr[VictoryStyleObject] = js.undefined
  var q1: js.UndefOr[VictoryStyleObject] = js.undefined
  var q1Labels: js.UndefOr[VictoryStyleObject] = js.undefined
  var q3: js.UndefOr[VictoryStyleObject] = js.undefined
  var q3Labels: js.UndefOr[VictoryStyleObject] = js.undefined
}

object VictoryBoxPlotStyleInterface {
  @scala.inline
  def apply(
    data: VictoryStyleObject = null,
    labels: VictoryStyleObject = null,
    max: VictoryStyleObject = null,
    maxLabels: VictoryStyleObject = null,
    median: VictoryStyleObject = null,
    medianLabels: VictoryStyleObject = null,
    min: VictoryStyleObject = null,
    minLabels: VictoryStyleObject = null,
    parent: VictoryStyleObject = null,
    q1: VictoryStyleObject = null,
    q1Labels: VictoryStyleObject = null,
    q3: VictoryStyleObject = null,
    q3Labels: VictoryStyleObject = null
  ): VictoryBoxPlotStyleInterface = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLabels != null) __obj.updateDynamic("maxLabels")(maxLabels.asInstanceOf[js.Any])
    if (median != null) __obj.updateDynamic("median")(median.asInstanceOf[js.Any])
    if (medianLabels != null) __obj.updateDynamic("medianLabels")(medianLabels.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLabels != null) __obj.updateDynamic("minLabels")(minLabels.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (q1 != null) __obj.updateDynamic("q1")(q1.asInstanceOf[js.Any])
    if (q1Labels != null) __obj.updateDynamic("q1Labels")(q1Labels.asInstanceOf[js.Any])
    if (q3 != null) __obj.updateDynamic("q3")(q3.asInstanceOf[js.Any])
    if (q3Labels != null) __obj.updateDynamic("q3Labels")(q3Labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[VictoryBoxPlotStyleInterface]
  }
}

