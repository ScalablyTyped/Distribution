package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.MinHeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinHeightProps[TLength] extends js.Object {
  val minHeight: js.UndefOr[ResponsiveValue[MinHeightProperty[TLength]]] = js.undefined
}

object MinHeightProps {
  @scala.inline
  def apply[TLength](minHeight: ResponsiveValue[MinHeightProperty[TLength]] = null): MinHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinHeightProps[TLength]]
  }
}

