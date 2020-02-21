package typings.styledSystem.mod

import typings.csstype.mod.FlexDirectionProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexDirectionProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The flex-direction CSS property specifies how flex items are placed in the flex container defining the main
    * axis and the direction (normal or reversed).
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-direction)
    */
  var flexDirection: js.UndefOr[ResponsiveValue[FlexDirectionProperty, ThemeType]] = js.undefined
}

object FlexDirectionProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](flexDirection: ResponsiveValue[FlexDirectionProperty, ThemeType] = null): FlexDirectionProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionProps[ThemeType]]
  }
}

