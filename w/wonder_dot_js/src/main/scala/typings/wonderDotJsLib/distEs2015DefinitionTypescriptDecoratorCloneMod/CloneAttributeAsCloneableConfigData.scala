package typings
package wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneAttributeAsCloneableConfigData extends js.Object {
  var order: js.UndefOr[scala.Double] = js.undefined
}

object CloneAttributeAsCloneableConfigData {
  @scala.inline
  def apply(order: scala.Int | scala.Double = null): CloneAttributeAsCloneableConfigData = {
    val __obj = js.Dynamic.literal()
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneAttributeAsCloneableConfigData]
  }
}

