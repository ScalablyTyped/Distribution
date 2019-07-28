package typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod

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
    inputIndexEnd: Int | Double = null,
    inputIndexStart: Int | Double = null,
    value: ValueType = null
  ): InputParamValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (inputIndexEnd != null) __obj.updateDynamic("inputIndexEnd")(inputIndexEnd.asInstanceOf[js.Any])
    if (inputIndexStart != null) __obj.updateDynamic("inputIndexStart")(inputIndexStart.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParamValue]
  }
}

