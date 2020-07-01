package typings.styledSystem.mod

import typings.csstype.mod.FlexWrapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexWrapProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The flex-wrap CSS property sets whether flex items are forced onto one line or can wrap onto multiple lines.
    * If wrapping is allowed, it sets the direction that lines are stacked.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-wrap)
    */
  var flexWrap: js.UndefOr[ResponsiveValue[FlexWrapProperty, ThemeType]] = js.undefined
}

object FlexWrapProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](flexWrap: js.UndefOr[Null | (ResponsiveValue[FlexWrapProperty, ThemeType])] = js.undefined): FlexWrapProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flexWrap)) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexWrapProps[ThemeType]]
  }
}

