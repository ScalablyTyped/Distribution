package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexShrinkProps extends js.Object {
  /**
    * The flex-shrink CSS property sets the flex shrink factor of a flex item. If the size of all flex items is larger
    * than the flex container, items shrink to fit according to flex-shrink.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-shrink)
    */
  var flexShrink: js.UndefOr[ResponsiveValue[GlobalsNumber]] = js.undefined
}

object FlexShrinkProps {
  @scala.inline
  def apply(flexShrink: ResponsiveValue[GlobalsNumber] = null): FlexShrinkProps = {
    val __obj = js.Dynamic.literal()
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexShrinkProps]
  }
}

