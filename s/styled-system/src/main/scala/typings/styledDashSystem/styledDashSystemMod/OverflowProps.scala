package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.OverflowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverflowProps extends js.Object {
  /**
    * The overflow CSS property sets what to do when an element's content is too big to fit in its block
    * formatting context. It is a shorthand for overflow-x and overflow-y.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
    */
  var overflow: js.UndefOr[ResponsiveValue[OverflowProperty]] = js.undefined
}

object OverflowProps {
  @scala.inline
  def apply(overflow: ResponsiveValue[OverflowProperty] = null): OverflowProps = {
    val __obj = js.Dynamic.literal()
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowProps]
  }
}

