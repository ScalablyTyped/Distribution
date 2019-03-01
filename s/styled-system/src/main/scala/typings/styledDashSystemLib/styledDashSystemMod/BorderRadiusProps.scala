package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderRadiusProps[TLength] extends js.Object {
  /**
    * The border-radius CSS property rounds the corners of an element's outer border edge. You can set a single
    * radius to make circular corners, or two radii to make elliptical corners.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-radius)
    */
  var borderRadius: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BorderRadiusProperty[TLength]]] = js.undefined
}

object BorderRadiusProps {
  @scala.inline
  def apply[TLength](borderRadius: ResponsiveValue[csstypeLib.csstypeMod.BorderRadiusProperty[TLength]] = null): BorderRadiusProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusProps[TLength]]
  }
}

