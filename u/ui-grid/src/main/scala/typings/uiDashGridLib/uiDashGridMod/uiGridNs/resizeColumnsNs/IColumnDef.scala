package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.resizeColumnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDef extends js.Object {
  /**
    * Enable column resizing on an individual column
    * Defaults to GridOptions.enableColumnResizing
    */
  var enableColumnResizing: js.UndefOr[scala.Boolean] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply(enableColumnResizing: js.UndefOr[scala.Boolean] = js.undefined): IColumnDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing)
    __obj.asInstanceOf[IColumnDef]
  }
}

