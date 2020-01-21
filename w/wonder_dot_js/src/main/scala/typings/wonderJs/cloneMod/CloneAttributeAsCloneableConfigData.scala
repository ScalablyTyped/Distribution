package typings.wonderJs.cloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneAttributeAsCloneableConfigData extends js.Object {
  var order: js.UndefOr[Double] = js.undefined
}

object CloneAttributeAsCloneableConfigData {
  @scala.inline
  def apply(order: Int | Double = null): CloneAttributeAsCloneableConfigData = {
    val __obj = js.Dynamic.literal()
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneAttributeAsCloneableConfigData]
  }
}

