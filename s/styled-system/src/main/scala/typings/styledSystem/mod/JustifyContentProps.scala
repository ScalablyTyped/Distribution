package typings.styledSystem.mod

import typings.csstype.mod.JustifyContentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JustifyContentProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The CSS justify-content property defines how the browser distributes space between and around content items
    * along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content)
    */
  var justifyContent: js.UndefOr[ResponsiveValue[JustifyContentProperty, ThemeType]] = js.undefined
}

object JustifyContentProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](
    justifyContent: js.UndefOr[Null | (ResponsiveValue[JustifyContentProperty, ThemeType])] = js.undefined
  ): JustifyContentProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(justifyContent)) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifyContentProps[ThemeType]]
  }
}

