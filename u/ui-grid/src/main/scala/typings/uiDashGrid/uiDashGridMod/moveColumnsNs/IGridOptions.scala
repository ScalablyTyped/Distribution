package typings.uiDashGrid.uiDashGridMod.moveColumnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * If defined, sets the default value for the colMovable flag on each individual colDefs
    * if their individual enableColumnMoving configuration is not defined.
    * Defaults to true.
    * @default true
    */
  var enableColumnMoving: js.UndefOr[Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(enableColumnMoving: js.UndefOr[Boolean] = js.undefined): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableColumnMoving)) __obj.updateDynamic("enableColumnMoving")(enableColumnMoving)
    __obj.asInstanceOf[IGridOptions]
  }
}

