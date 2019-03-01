package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.expandableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridRow extends js.Object {
  /**
    * If set to true, the row is expanded and the expanded view is visible
    * Defaults to false
    * @default false
    */
  var isExpanded: js.UndefOr[scala.Boolean] = js.undefined
}

object IGridRow {
  @scala.inline
  def apply(isExpanded: js.UndefOr[scala.Boolean] = js.undefined): IGridRow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded)
    __obj.asInstanceOf[IGridRow]
  }
}

