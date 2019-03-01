package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineGroupEditableOption extends js.Object {
  var add: js.UndefOr[scala.Boolean] = js.undefined
  var order: js.UndefOr[scala.Boolean] = js.undefined
  var remove: js.UndefOr[scala.Boolean] = js.undefined
}

object TimelineGroupEditableOption {
  @scala.inline
  def apply(
    add: js.UndefOr[scala.Boolean] = js.undefined,
    order: js.UndefOr[scala.Boolean] = js.undefined,
    remove: js.UndefOr[scala.Boolean] = js.undefined
  ): TimelineGroupEditableOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(add)) __obj.updateDynamic("add")(add)
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[TimelineGroupEditableOption]
  }
}

