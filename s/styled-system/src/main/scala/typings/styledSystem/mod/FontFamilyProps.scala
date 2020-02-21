package typings.styledSystem.mod

import typings.csstype.mod.FontFamilyProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontFamilyProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var fontFamily: js.UndefOr[ResponsiveValue[FontFamilyProperty, ThemeType]] = js.undefined
}

object FontFamilyProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](fontFamily: ResponsiveValue[FontFamilyProperty, ThemeType] = null): FontFamilyProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamilyProps[ThemeType]]
  }
}

