package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.TextAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAlignProps extends js.Object {
  /**
    * The text-align CSS property specifies the horizontal alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-align)
    */
  var textAlign: js.UndefOr[ResponsiveValue[TextAlignProperty]] = js.undefined
}

object TextAlignProps {
  @scala.inline
  def apply(textAlign: ResponsiveValue[TextAlignProperty] = null): TextAlignProps = {
    val __obj = js.Dynamic.literal()
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlignProps]
  }
}

