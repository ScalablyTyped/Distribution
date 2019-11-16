package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.GridRowGapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridRowGapProps[TLength] extends js.Object {
  val gridRowGap: js.UndefOr[ResponsiveValue[GridRowGapProperty[TLength]]] = js.undefined
}

object GridRowGapProps {
  @scala.inline
  def apply[TLength](gridRowGap: ResponsiveValue[GridRowGapProperty[TLength]] = null): GridRowGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridRowGap != null) __obj.updateDynamic("gridRowGap")(gridRowGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRowGapProps[TLength]]
  }
}

