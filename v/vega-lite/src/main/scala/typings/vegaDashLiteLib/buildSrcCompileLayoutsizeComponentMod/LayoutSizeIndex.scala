package typings
package vegaDashLiteLib.buildSrcCompileLayoutsizeComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutSizeIndex extends js.Object {
  var height: js.UndefOr[LayoutSize] = js.undefined
  var width: js.UndefOr[LayoutSize] = js.undefined
}

object LayoutSizeIndex {
  @scala.inline
  def apply(height: LayoutSize = null, width: LayoutSize = null): LayoutSizeIndex = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutSizeIndex]
  }
}

