package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  var size: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object SizeProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](size: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): SizeProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeProps[ThemeType, TVal]]
  }
}

