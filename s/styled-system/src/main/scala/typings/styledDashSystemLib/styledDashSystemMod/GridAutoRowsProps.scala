package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAutoRowsProps[TLength] extends js.Object {
  /**
    * The grid-auto-rows CSS property specifies the size of an implicitly-created grid row track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-rows)
    */
  var gridAutoRows: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.GridAutoRowsProperty[TLength]]] = js.undefined
}

object GridAutoRowsProps {
  @scala.inline
  def apply[TLength](gridAutoRows: ResponsiveValue[csstypeLib.csstypeMod.GridAutoRowsProperty[TLength]] = null): GridAutoRowsProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridAutoRows != null) __obj.updateDynamic("gridAutoRows")(gridAutoRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAutoRowsProps[TLength]]
  }
}

