package typings.wonderDotJs.distEs2015DefinitionTypescriptDecoratorCloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneAttributeAsCustomTypeConfigData extends js.Object {
  var order: js.UndefOr[Double] = js.undefined
}

object CloneAttributeAsCustomTypeConfigData {
  @scala.inline
  def apply(order: Int | Double = null): CloneAttributeAsCustomTypeConfigData = {
    val __obj = js.Dynamic.literal()
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneAttributeAsCustomTypeConfigData]
  }
}

