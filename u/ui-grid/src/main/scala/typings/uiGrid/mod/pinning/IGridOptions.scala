package typings.uiGrid.mod.pinning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Enable pinning for the entire grid.
    * Defaults to true
    * @default true
    */
  var enablePinning: js.UndefOr[Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(enablePinning: js.UndefOr[Boolean] = js.undefined): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enablePinning)) __obj.updateDynamic("enablePinning")(enablePinning.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions]
  }
}

