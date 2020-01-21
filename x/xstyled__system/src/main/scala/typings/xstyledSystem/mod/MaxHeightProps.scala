package typings.xstyledSystem.mod

import typings.csstype.mod.MaxHeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxHeightProps[TLength] extends js.Object {
  val maxHeight: js.UndefOr[ResponsiveValue[MaxHeightProperty[TLength]]] = js.undefined
}

object MaxHeightProps {
  @scala.inline
  def apply[TLength](maxHeight: ResponsiveValue[MaxHeightProperty[TLength]] = null): MaxHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxHeightProps[TLength]]
  }
}

