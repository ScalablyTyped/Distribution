package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends TextColorProps[ThemeType, TVal]
     with BackgroundColorProps[ThemeType, TVal]
     with OpacityProps[RequiredTheme]

object ColorProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): ColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorProps[ThemeType, TVal]]
  }
}

