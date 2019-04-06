package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderWidthProps[TLength] extends js.Object {
  /**
    * The border-width shorthand CSS property sets the width of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-width)
    */
  var borderWidth: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BorderWidthProperty[TLength]]] = js.undefined
}

object BorderWidthProps {
  @scala.inline
  def apply[TLength](borderWidth: ResponsiveValue[csstypeLib.csstypeMod.BorderWidthProperty[TLength]] = null): BorderWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidthProps[TLength]]
  }
}

