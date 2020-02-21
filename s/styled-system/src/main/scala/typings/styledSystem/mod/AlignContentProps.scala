package typings.styledSystem.mod

import typings.csstype.mod.AlignContentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignContentProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The CSS align-content property sets how the browser distributes space between and around content items
    * along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-content)
    */
  var alignContent: js.UndefOr[ResponsiveValue[AlignContentProperty, ThemeType]] = js.undefined
}

object AlignContentProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](alignContent: ResponsiveValue[AlignContentProperty, ThemeType] = null): AlignContentProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignContentProps[ThemeType]]
  }
}

