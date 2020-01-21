package typings.xstyledSystem.mod

import typings.csstype.mod.GridAutoColumnsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAutoColumnsProps[TLength] extends js.Object {
  val gridAutoColumns: js.UndefOr[ResponsiveValue[GridAutoColumnsProperty[TLength]]] = js.undefined
}

object GridAutoColumnsProps {
  @scala.inline
  def apply[TLength](gridAutoColumns: ResponsiveValue[GridAutoColumnsProperty[TLength]] = null): GridAutoColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridAutoColumns != null) __obj.updateDynamic("gridAutoColumns")(gridAutoColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAutoColumnsProps[TLength]]
  }
}

