package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.MinWidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinWidthProps[TLength] extends js.Object {
  val minWidth: js.UndefOr[ResponsiveValue[MinWidthProperty[TLength]]] = js.undefined
}

object MinWidthProps {
  @scala.inline
  def apply[TLength](minWidth: ResponsiveValue[MinWidthProperty[TLength]] = null): MinWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinWidthProps[TLength]]
  }
}

