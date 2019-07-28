package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.JustifyItemsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JustifyItemsProps extends js.Object {
  /**
    * The CSS justify-items property defines the default justify-self for all items of the box, giving them all
    * a default way of justifying each box along the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items)
    */
  var justifyItems: js.UndefOr[ResponsiveValue[JustifyItemsProperty]] = js.undefined
}

object JustifyItemsProps {
  @scala.inline
  def apply(justifyItems: ResponsiveValue[JustifyItemsProperty] = null): JustifyItemsProps = {
    val __obj = js.Dynamic.literal()
    if (justifyItems != null) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifyItemsProps]
  }
}

