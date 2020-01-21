package typings.tensorflowTfjsConverter.operationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputParamMapper extends ParamMapper {
  var end: js.UndefOr[Double] = js.undefined
  var start: Double
}

object InputParamMapper {
  @scala.inline
  def apply(
    name: String,
    start: Double,
    `type`: ParamType,
    defaultValue: ValueType = null,
    end: Int | Double = null,
    notSupported: js.UndefOr[Boolean] = js.undefined
  ): InputParamMapper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(notSupported)) __obj.updateDynamic("notSupported")(notSupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParamMapper]
  }
}

