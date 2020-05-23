package typings.styledSystem.mod

import typings.csstype.mod.TextShadowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The `text-shadow` CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied
    * to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from
    * the element, blur radius, and color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-shadow)
    */
  var textShadow: js.UndefOr[ResponsiveValue[TextShadowProperty | Double, ThemeType]] = js.undefined
}

object TextShadowProps {
  @scala.inline
  def apply[ThemeType](
    textShadow: js.UndefOr[Null | (ResponsiveValue[TextShadowProperty | Double, ThemeType])] = js.undefined
  ): TextShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(textShadow)) __obj.updateDynamic("textShadow")(textShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextShadowProps[ThemeType]]
  }
}

