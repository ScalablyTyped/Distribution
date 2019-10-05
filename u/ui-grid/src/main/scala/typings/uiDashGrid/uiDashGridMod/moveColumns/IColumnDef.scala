package typings.uiDashGrid.uiDashGridMod.moveColumns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDef extends js.Object {
  /**
    * Enable column moving for the column
    */
  var enableColumnMoving: js.UndefOr[Boolean] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply(enableColumnMoving: js.UndefOr[Boolean] = js.undefined): IColumnDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableColumnMoving)) __obj.updateDynamic("enableColumnMoving")(enableColumnMoving)
    __obj.asInstanceOf[IColumnDef]
  }
}

