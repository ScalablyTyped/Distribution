package typings.styledSystem.mod

import typings.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacityProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The opacity CSS property sets the transparency of an element or the degree to which content
    * behind an element is visible.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/opacity)
    */
  var opacity: js.UndefOr[ResponsiveValue[GlobalsNumber, ThemeType]] = js.undefined
}

object OpacityProps {
  @scala.inline
  def apply[ThemeType](opacity: js.UndefOr[Null | (ResponsiveValue[GlobalsNumber, ThemeType])] = js.undefined): OpacityProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityProps[ThemeType]]
  }
}

