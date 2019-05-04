package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgRangeBinding extends VgBinding {
  var element: js.UndefOr[java.lang.String] = js.undefined
  var input: vegaDashLiteLib.vegaDashLiteLibStrings.range
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object VgRangeBinding {
  @scala.inline
  def apply(
    input: vegaDashLiteLib.vegaDashLiteLibStrings.range,
    element: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null
  ): VgRangeBinding = {
    val __obj = js.Dynamic.literal(input = input)
    if (element != null) __obj.updateDynamic("element")(element)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgRangeBinding]
  }
}

