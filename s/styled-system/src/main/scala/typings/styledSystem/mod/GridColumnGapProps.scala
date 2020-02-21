package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The column-gap CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * @deprecated use column-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/column-gap)
    */
  var gridColumnGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object GridColumnGapProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](gridColumnGap: ResponsiveValue[TVal, ThemeType] = null): GridColumnGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (gridColumnGap != null) __obj.updateDynamic("gridColumnGap")(gridColumnGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnGapProps[ThemeType, TVal]]
  }
}

