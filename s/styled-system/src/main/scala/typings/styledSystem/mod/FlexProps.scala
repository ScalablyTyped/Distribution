package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
    * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
    */
  var flex: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object FlexProps {
  @scala.inline
  def apply[ThemeType, TVal](flex: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): FlexProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flex)) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps[ThemeType, TVal]]
  }
}

