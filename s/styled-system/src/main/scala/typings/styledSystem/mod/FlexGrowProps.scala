package typings.styledSystem.mod

import typings.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexGrowProps extends js.Object {
  /**
    * The flex-grow CSS property sets the flex grow factor of a flex item main size. It specifies how much of the
    * remaining space in the flex container should be assigned to the item (the flex grow factor).
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-grow)
    */
  var flexGrow: js.UndefOr[ResponsiveValue[GlobalsNumber]] = js.undefined
}

object FlexGrowProps {
  @scala.inline
  def apply(flexGrow: ResponsiveValue[GlobalsNumber] = null): FlexGrowProps = {
    val __obj = js.Dynamic.literal()
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexGrowProps]
  }
}

