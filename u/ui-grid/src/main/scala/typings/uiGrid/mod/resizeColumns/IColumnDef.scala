package typings.uiGrid.mod.resizeColumns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDef extends js.Object {
  /**
    * Enable column resizing on an individual column
    * Defaults to GridOptions.enableColumnResizing
    */
  var enableColumnResizing: js.UndefOr[Boolean] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply(enableColumnResizing: js.UndefOr[Boolean] = js.undefined): IColumnDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnDef]
  }
}

