package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var textStyle: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.undefined
}

object TextStyleProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](textStyle: ResponsiveValue[String, ThemeType] = null): TextStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyleProps[ThemeType]]
  }
}

