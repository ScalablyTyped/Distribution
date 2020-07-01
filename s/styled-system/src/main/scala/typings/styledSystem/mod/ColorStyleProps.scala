package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var colors: js.UndefOr[ResponsiveValue[String, ThemeType]] = js.undefined
}

object ColorStyleProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](colors: js.UndefOr[Null | (ResponsiveValue[String, ThemeType])] = js.undefined): ColorStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorStyleProps[ThemeType]]
  }
}

