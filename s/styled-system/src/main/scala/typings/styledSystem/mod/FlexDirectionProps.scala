package typings.styledSystem.mod

import typings.csstype.mod.FlexDirectionProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexDirectionProps extends js.Object {
  /**
    * The flex-direction CSS property specifies how flex items are placed in the flex container defining the main
    * axis and the direction (normal or reversed).
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction)
    */
  var flexDirection: js.UndefOr[ResponsiveValue[FlexDirectionProperty]] = js.undefined
}

object FlexDirectionProps {
  @scala.inline
  def apply(flexDirection: ResponsiveValue[FlexDirectionProperty] = null): FlexDirectionProps = {
    val __obj = js.Dynamic.literal()
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionProps]
  }
}

