package typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamMapper extends js.Object {
  var defaultValue: js.UndefOr[ValueType] = js.undefined
  var name: String
  var notSupported: js.UndefOr[Boolean] = js.undefined
  var `type`: ParamType
}

object ParamMapper {
  @scala.inline
  def apply(
    name: String,
    `type`: ParamType,
    defaultValue: ValueType = null,
    notSupported: js.UndefOr[Boolean] = js.undefined
  ): ParamMapper = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(notSupported)) __obj.updateDynamic("notSupported")(notSupported)
    __obj.asInstanceOf[ParamMapper]
  }
}

