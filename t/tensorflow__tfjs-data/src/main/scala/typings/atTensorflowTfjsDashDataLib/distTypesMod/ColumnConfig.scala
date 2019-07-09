package typings
package atTensorflowTfjsDashDataLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnConfig extends js.Object {
  var default: js.UndefOr[DataElement] = js.undefined
  var dtype: js.UndefOr[atTensorflowTfjsDashCoreLib.distTypesMod.DataType] = js.undefined
  var isLabel: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
}

object ColumnConfig {
  @scala.inline
  def apply(
    default: DataElement = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    isLabel: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): ColumnConfig = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (!js.isUndefined(isLabel)) __obj.updateDynamic("isLabel")(isLabel)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[ColumnConfig]
  }
}

