package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinHeightProps[TLength] extends js.Object {
  /**
    * The min-height CSS property sets the minimum height of an element. It prevents the used value of the height
    * property from becoming smaller than the value specified for min-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var minHeight: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.MinHeightProperty[TLength]]] = js.undefined
}

object MinHeightProps {
  @scala.inline
  def apply[TLength](minHeight: ResponsiveValue[csstypeLib.csstypeMod.MinHeightProperty[TLength]] = null): MinHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinHeightProps[TLength]]
  }
}

