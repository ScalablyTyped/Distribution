package typings.xstyledSystem.mod

import typings.csstype.mod.GridTemplateRowsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTemplateRowsProps[TLength] extends js.Object {
  val gridTemplateRows: js.UndefOr[ResponsiveValue[GridTemplateRowsProperty[TLength]]] = js.undefined
}

object GridTemplateRowsProps {
  @scala.inline
  def apply[TLength](gridTemplateRows: ResponsiveValue[GridTemplateRowsProperty[TLength]] = null): GridTemplateRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridTemplateRows != null) __obj.updateDynamic("gridTemplateRows")(gridTemplateRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTemplateRowsProps[TLength]]
  }
}

