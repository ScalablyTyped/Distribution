package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinHeightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
    * property from becoming smaller than the value specified for min-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var minHeight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object MinHeightProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](minHeight: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): MinHeightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinHeightProps[ThemeType, TVal]]
  }
}

