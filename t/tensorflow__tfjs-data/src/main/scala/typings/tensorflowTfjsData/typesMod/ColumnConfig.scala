package typings.tensorflowTfjsData.typesMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnConfig extends js.Object {
  var default: js.UndefOr[DataElement] = js.undefined
  var dtype: js.UndefOr[DataType] = js.undefined
  var isLabel: js.UndefOr[Boolean] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
}

object ColumnConfig {
  @scala.inline
  def apply(
    default: DataElement = null,
    dtype: DataType = null,
    isLabel: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined
  ): ColumnConfig = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(isLabel)) __obj.updateDynamic("isLabel")(isLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnConfig]
  }
}

