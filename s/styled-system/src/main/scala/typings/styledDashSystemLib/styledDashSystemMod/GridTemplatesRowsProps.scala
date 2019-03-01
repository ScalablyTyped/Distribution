package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTemplatesRowsProps[TLength] extends js.Object {
  /**
    * The grid-template-rows CSS property defines the line names and track sizing functions of the grid rows.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-template-rows)
    */
  var gridTemplateRows: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.GridTemplateRowsProperty[TLength]]] = js.undefined
}

object GridTemplatesRowsProps {
  @scala.inline
  def apply[TLength](gridTemplateRows: ResponsiveValue[csstypeLib.csstypeMod.GridTemplateRowsProperty[TLength]] = null): GridTemplatesRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridTemplateRows != null) __obj.updateDynamic("gridTemplateRows")(gridTemplateRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTemplatesRowsProps[TLength]]
  }
}

