package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgRangeBinding extends VgBinding {
  var element: js.UndefOr[String] = js.undefined
  var input: range
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object VgRangeBinding {
  @scala.inline
  def apply(
    input: range,
    element: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    step: Int | Double = null
  ): VgRangeBinding = {
    val __obj = js.Dynamic.literal(input = input)
    if (element != null) __obj.updateDynamic("element")(element)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgRangeBinding]
  }
}

