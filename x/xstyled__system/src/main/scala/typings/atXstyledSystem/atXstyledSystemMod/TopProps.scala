package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.TopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopProps[TLength] extends js.Object {
  val top: js.UndefOr[ResponsiveValue[TopProperty[TLength]]] = js.undefined
}

object TopProps {
  @scala.inline
  def apply[TLength](top: ResponsiveValue[TopProperty[TLength]] = null): TopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopProps[TLength]]
  }
}

