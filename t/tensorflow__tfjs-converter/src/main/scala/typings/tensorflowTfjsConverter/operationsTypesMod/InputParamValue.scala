package typings.tensorflowTfjsConverter.operationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputParamValue extends ParamValue {
  var inputIndexEnd: js.UndefOr[Double] = js.undefined
  var inputIndexStart: js.UndefOr[Double] = js.undefined
}

object InputParamValue {
  @scala.inline
  def apply(
    `type`: ParamType,
    inputIndexEnd: js.UndefOr[Double] = js.undefined,
    inputIndexStart: js.UndefOr[Double] = js.undefined,
    value: ValueType = null
  ): InputParamValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(inputIndexEnd)) __obj.updateDynamic("inputIndexEnd")(inputIndexEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inputIndexStart)) __obj.updateDynamic("inputIndexStart")(inputIndexStart.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParamValue]
  }
}

