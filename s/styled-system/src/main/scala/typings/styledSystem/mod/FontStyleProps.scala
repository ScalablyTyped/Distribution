package typings.styledSystem.mod

import typings.csstype.mod.FontStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The font-style CSS property specifies whether a font should be styled with a normal, italic,
    * or oblique face from its font-family.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-style)
    */
  var fontStyle: js.UndefOr[ResponsiveValue[FontStyleProperty, ThemeType]] = js.undefined
}

object FontStyleProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](fontStyle: ResponsiveValue[FontStyleProperty, ThemeType] = null): FontStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyleProps[ThemeType]]
  }
}

