package typings.styledSystem.mod

import typings.csstype.mod.GridRowGapProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridRowGapProps[TLength] extends js.Object {
  /**
    * The row-gap CSS property sets the size of the gap (gutter) between an element's rows.
    *
    * @deprecated use row-gap
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/row-gap)
    */
  var gridRowGap: js.UndefOr[ResponsiveValue[GridRowGapProperty[TLength]]] = js.undefined
}

object GridRowGapProps {
  @scala.inline
  def apply[TLength](gridRowGap: ResponsiveValue[GridRowGapProperty[TLength]] = null): GridRowGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (gridRowGap != null) __obj.updateDynamic("gridRowGap")(gridRowGap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRowGapProps[TLength]]
  }
}

