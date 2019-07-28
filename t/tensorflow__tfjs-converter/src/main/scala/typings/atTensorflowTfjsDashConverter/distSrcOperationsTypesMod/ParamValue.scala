package typings.atTensorflowTfjsDashConverter.distSrcOperationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamValue extends js.Object {
  var `type`: ParamType
  var value: js.UndefOr[ValueType] = js.undefined
}

object ParamValue {
  @scala.inline
  def apply(`type`: ParamType, value: ValueType = null): ParamValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamValue]
  }
}

