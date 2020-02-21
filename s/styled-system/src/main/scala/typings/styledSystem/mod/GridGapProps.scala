package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridGapProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The gap CSS property sets the gaps (gutters) between rows and columns. It is a shorthand for row-gap
    * and column-gap.
    *
    * @deprecated use gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/gap)
    */
  var gridGap: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object GridGapProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](gridGap: ResponsiveValue[TVal, ThemeType] = null): GridGapProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (gridGap != null) __obj.updateDynamic("gridGap")(gridGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridGapProps[ThemeType, TVal]]
  }
}

