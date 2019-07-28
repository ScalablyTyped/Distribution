package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.FontStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontStyleProps extends js.Object {
  /**
    * The font-style CSS property specifies whether a font should be styled with a normal, italic,
    * or oblique face from its font-family.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-style)
    */
  var fontStyle: js.UndefOr[ResponsiveValue[FontStyleProperty]] = js.undefined
}

object FontStyleProps {
  @scala.inline
  def apply(fontStyle: ResponsiveValue[FontStyleProperty] = null): FontStyleProps = {
    val __obj = js.Dynamic.literal()
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyleProps]
  }
}

