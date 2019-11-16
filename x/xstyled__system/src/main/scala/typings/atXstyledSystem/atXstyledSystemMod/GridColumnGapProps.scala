package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.GridColumnGapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnGapProps[TLength] extends js.Object {
  val gridColumnGap: js.UndefOr[ResponsiveValue[GridColumnGapProperty[TLength]]] = js.undefined
}

object GridColumnGapProps {
  @scala.inline
  def apply[TLength](gridColumnGap: ResponsiveValue[GridColumnGapProperty[TLength]] = null): GridColumnGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridColumnGap != null) __obj.updateDynamic("gridColumnGap")(gridColumnGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnGapProps[TLength]]
  }
}

