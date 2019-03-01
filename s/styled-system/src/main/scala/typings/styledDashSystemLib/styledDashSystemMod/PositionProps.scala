package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionProps extends js.Object {
  /**
    * The position CSS property specifies how an element is positioned in a document.
    * The top, right, bottom, and left properties determine the final location of positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/position)
    */
  var position: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.PositionProperty]] = js.undefined
}

object PositionProps {
  @scala.inline
  def apply(position: ResponsiveValue[csstypeLib.csstypeMod.PositionProperty] = null): PositionProps = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionProps]
  }
}

