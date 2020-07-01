package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var variant: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.undefined
}

object ButtonStyleProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](variant: js.UndefOr[Null | (ResponsiveValue[String, ThemeType])] = js.undefined): ButtonStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(variant)) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonStyleProps[ThemeType]]
  }
}

