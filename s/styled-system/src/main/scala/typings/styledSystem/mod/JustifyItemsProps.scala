package typings.styledSystem.mod

import typings.csstype.mod.JustifyItemsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JustifyItemsProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The CSS justify-items property defines the default justify-self for all items of the box, giving them all
    * a default way of justifying each box along the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items)
    */
  var justifyItems: js.UndefOr[ResponsiveValue[JustifyItemsProperty, ThemeType]] = js.undefined
}

object JustifyItemsProps {
  @scala.inline
  def apply[ThemeType](justifyItems: js.UndefOr[Null | (ResponsiveValue[JustifyItemsProperty, ThemeType])] = js.undefined): JustifyItemsProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(justifyItems)) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifyItemsProps[ThemeType]]
  }
}

