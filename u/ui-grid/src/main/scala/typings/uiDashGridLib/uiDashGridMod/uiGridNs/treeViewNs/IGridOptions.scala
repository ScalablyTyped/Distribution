package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.treeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Enable row tree view for entire grid.
    * Defaults to true
    * @default true
    */
  var enableTreeView: js.UndefOr[scala.Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(enableTreeView: js.UndefOr[scala.Boolean] = js.undefined): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableTreeView)) __obj.updateDynamic("enableTreeView")(enableTreeView)
    __obj.asInstanceOf[IGridOptions]
  }
}

