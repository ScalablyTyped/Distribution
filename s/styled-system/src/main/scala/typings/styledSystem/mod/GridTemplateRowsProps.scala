package typings.styledSystem.mod

import typings.csstype.mod.GridTemplateRowsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTemplateRowsProps[TLength] extends js.Object {
  /**
    * The grid-template-rows CSS property defines the line names and track sizing functions of the grid rows.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-template-rows)
    */
  var gridTemplateRows: js.UndefOr[ResponsiveValue[GridTemplateRowsProperty[TLength]]] = js.undefined
}

object GridTemplateRowsProps {
  @scala.inline
  def apply[TLength](gridTemplateRows: ResponsiveValue[GridTemplateRowsProperty[TLength]] = null): GridTemplateRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridTemplateRows != null) __obj.updateDynamic("gridTemplateRows")(gridTemplateRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTemplateRowsProps[TLength]]
  }
}

