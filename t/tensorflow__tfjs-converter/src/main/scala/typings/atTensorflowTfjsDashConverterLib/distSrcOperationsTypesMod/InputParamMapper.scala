package typings
package atTensorflowTfjsDashConverterLib.distSrcOperationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputParamMapper extends ParamMapper {
  var end: js.UndefOr[scala.Double] = js.undefined
  var start: scala.Double
}

object InputParamMapper {
  @scala.inline
  def apply(
    name: java.lang.String,
    start: scala.Double,
    `type`: ParamType,
    defaultValue: ValueType = null,
    end: scala.Int | scala.Double = null,
    notSupported: js.UndefOr[scala.Boolean] = js.undefined
  ): InputParamMapper = {
    val __obj = js.Dynamic.literal(name = name, start = start)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(notSupported)) __obj.updateDynamic("notSupported")(notSupported)
    __obj.asInstanceOf[InputParamMapper]
  }
}

