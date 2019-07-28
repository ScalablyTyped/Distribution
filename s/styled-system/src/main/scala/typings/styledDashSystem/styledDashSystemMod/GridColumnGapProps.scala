package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.GridColumnGapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnGapProps[TLength] extends js.Object {
  /**
    * The column-gap CSS property sets the size of the gap (gutter) between an element's columns.
    *
    * @deprecated use column-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/column-gap)
    */
  var gridColumnGap: js.UndefOr[ResponsiveValue[GridColumnGapProperty[TLength]]] = js.undefined
}

object GridColumnGapProps {
  @scala.inline
  def apply[TLength](gridColumnGap: ResponsiveValue[GridColumnGapProperty[TLength]] = null): GridColumnGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridColumnGap != null) __obj.updateDynamic("gridColumnGap")(gridColumnGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnGapProps[TLength]]
  }
}

