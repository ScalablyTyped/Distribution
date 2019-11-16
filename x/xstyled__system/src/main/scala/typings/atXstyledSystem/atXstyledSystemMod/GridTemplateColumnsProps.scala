package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.GridTemplateColumnsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTemplateColumnsProps[TLength] extends js.Object {
  val gridTemplateColumns: js.UndefOr[ResponsiveValue[GridTemplateColumnsProperty[TLength]]] = js.undefined
}

object GridTemplateColumnsProps {
  @scala.inline
  def apply[TLength](gridTemplateColumns: ResponsiveValue[GridTemplateColumnsProperty[TLength]] = null): GridTemplateColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridTemplateColumns != null) __obj.updateDynamic("gridTemplateColumns")(gridTemplateColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTemplateColumnsProps[TLength]]
  }
}

