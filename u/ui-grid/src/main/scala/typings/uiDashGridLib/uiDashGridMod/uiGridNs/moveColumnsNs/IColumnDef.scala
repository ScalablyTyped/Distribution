package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.moveColumnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDef extends js.Object {
  /**
    * Enable column moving for the column
    */
  var enableColumnMoving: js.UndefOr[scala.Boolean] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply(enableColumnMoving: js.UndefOr[scala.Boolean] = js.undefined): IColumnDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableColumnMoving)) __obj.updateDynamic("enableColumnMoving")(enableColumnMoving)
    __obj.asInstanceOf[IColumnDef]
  }
}

