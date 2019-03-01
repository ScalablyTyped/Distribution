package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAlignProps extends js.Object {
  /**
    * The text-align CSS property specifies the horizontal alignment of an inline or table-cell box.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-align)
    */
  var textAlign: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.TextAlignProperty]] = js.undefined
}

object TextAlignProps {
  @scala.inline
  def apply(textAlign: ResponsiveValue[csstypeLib.csstypeMod.TextAlignProperty] = null): TextAlignProps = {
    val __obj = js.Dynamic.literal()
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlignProps]
  }
}

