package typings.wonderJs.cloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneAttributeAsCloneableConfigData extends js.Object {
  var order: js.UndefOr[Double] = js.undefined
}

object CloneAttributeAsCloneableConfigData {
  @scala.inline
  def apply(order: js.UndefOr[Double] = js.undefined): CloneAttributeAsCloneableConfigData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneAttributeAsCloneableConfigData]
  }
}

