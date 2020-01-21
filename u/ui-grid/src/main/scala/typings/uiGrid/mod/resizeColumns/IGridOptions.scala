package typings.uiGrid.mod.resizeColumns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Enable column resizing on the entire grid
    * Defaults to true
    * @default true
    */
  var enableColumnResizing: js.UndefOr[Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(enableColumnResizing: js.UndefOr[Boolean] = js.undefined): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableColumnResizing)) __obj.updateDynamic("enableColumnResizing")(enableColumnResizing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions]
  }
}

