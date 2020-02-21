package typings.styledSystem.mod

import typings.csstype.mod.OverflowProperty
import typings.csstype.mod.OverflowXProperty
import typings.csstype.mod.OverflowYProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The overflow CSS property sets what to do when an element's content is too big to fit in its block
    * formatting context. It is a shorthand for overflow-x and overflow-y.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
    */
  var overflow: js.UndefOr[ResponsiveValue[OverflowProperty, ThemeType]] = js.undefined
  /**
    * The overflow-x CSS property sets what shows when content overflows a block-level element's left
    * and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
    */
  var overflowX: js.UndefOr[ResponsiveValue[OverflowXProperty, ThemeType]] = js.undefined
  /**
    * The overflow-y CSS property sets what shows when content overflows a block-level element's top
    * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
    */
  var overflowY: js.UndefOr[ResponsiveValue[OverflowYProperty, ThemeType]] = js.undefined
}

object OverflowProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](
    overflow: ResponsiveValue[OverflowProperty, ThemeType] = null,
    overflowX: ResponsiveValue[OverflowXProperty, ThemeType] = null,
    overflowY: ResponsiveValue[OverflowYProperty, ThemeType] = null
  ): OverflowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowProps[ThemeType]]
  }
}

