package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var colors: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.undefined
}

object ColorStyleProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](colors: ResponsiveValue[String, ThemeType] = null): ColorStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStyleProps[ThemeType]]
  }
}

