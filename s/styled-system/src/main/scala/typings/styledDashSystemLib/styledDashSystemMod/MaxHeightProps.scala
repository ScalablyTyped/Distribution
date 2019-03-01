package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxHeightProps[TLength] extends js.Object {
  /**
    * The max-height CSS property sets the maximum height of an element. It prevents the used value of the height
    * property from becoming larger than the value specified for max-height.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-height)
    */
  var maxHeight: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.MaxHeightProperty[TLength]]] = js.undefined
}

object MaxHeightProps {
  @scala.inline
  def apply[TLength](maxHeight: ResponsiveValue[csstypeLib.csstypeMod.MaxHeightProperty[TLength]] = null): MaxHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxHeightProps[TLength]]
  }
}

