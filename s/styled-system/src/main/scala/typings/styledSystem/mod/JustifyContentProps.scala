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
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](justifyContent: ResponsiveValue[JustifyContentProperty, ThemeType] = null): JustifyContentProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifyContentProps[ThemeType]]
  }
}

