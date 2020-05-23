package typings.wonderJs.cloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneAttributeAsBasicTypeConfigData extends js.Object {
  var order: js.UndefOr[Double] = js.undefined
}

object CloneAttributeAsBasicTypeConfigData {
  @scala.inline
  def apply(order: js.UndefOr[Double] = js.undefined): CloneAttributeAsBasicTypeConfigData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneAttributeAsBasicTypeConfigData]
  }
}

