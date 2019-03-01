package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftProps[TLength] extends js.Object {
  /**
    * The left CSS property participates in specifying the horizontal position
    * of a positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/left)
    */
  var left: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.LeftProperty[TLength]]] = js.undefined
}

object LeftProps {
  @scala.inline
  def apply[TLength](left: ResponsiveValue[csstypeLib.csstypeMod.LeftProperty[TLength]] = null): LeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftProps[TLength]]
  }
}

