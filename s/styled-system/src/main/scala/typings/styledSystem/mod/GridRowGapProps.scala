package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridRowGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The row-gap CSS property sets the size of the gap (gutter) between an element's rows.
    *
    * @deprecated use row-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-gap)
    */
  var gridRowGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object GridRowGapProps {
  @scala.inline
  def apply[ThemeType, TVal](gridRowGap: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined): GridRowGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gridRowGap)) __obj.updateDynamic("gridRowGap")(gridRowGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRowGapProps[ThemeType, TVal]]
  }
}

