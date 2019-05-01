package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTemplateColumnsProps[TLength] extends js.Object {
  /**
    * The grid-template-columns CSS property defines the line names and track sizing functions of the grid columns.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-columns)
    */
  var gridTemplateColumns: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.GridTemplateColumnsProperty[TLength]]] = js.undefined
}

object GridTemplateColumnsProps {
  @scala.inline
  def apply[TLength](
    gridTemplateColumns: ResponsiveValue[csstypeLib.csstypeMod.GridTemplateColumnsProperty[TLength]] = null
  ): GridTemplateColumnsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridTemplateColumns != null) __obj.updateDynamic("gridTemplateColumns")(gridTemplateColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTemplateColumnsProps[TLength]]
  }
}

