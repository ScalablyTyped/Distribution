package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var variant: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.undefined
}

object ButtonStyleProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](variant: ResponsiveValue[String, ThemeType] = null): ButtonStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonStyleProps[ThemeType]]
  }
}

