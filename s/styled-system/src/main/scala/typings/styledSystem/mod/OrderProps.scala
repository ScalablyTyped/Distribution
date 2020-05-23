package typings.styledSystem.mod

import typings.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The order CSS property sets the order to lay out an item in a flex or grid container. Items in a container
    * are sorted by ascending order value and then by their source code order.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/order)
    */
  var order: js.UndefOr[ResponsiveValue[GlobalsNumber, ThemeType]] = js.undefined
}

object OrderProps {
  @scala.inline
  def apply[ThemeType](order: js.UndefOr[Null | (ResponsiveValue[GlobalsNumber, ThemeType])] = js.undefined): OrderProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderProps[ThemeType]]
  }
}

