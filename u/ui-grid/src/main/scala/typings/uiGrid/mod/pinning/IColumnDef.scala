package typings.uiGrid.mod.pinning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColumnDef extends js.Object {
  /**
    * Enable pinning for the individual column.  Defaults to true
    * @default true
    */
  var enablePinning: js.UndefOr[Boolean] = js.undefined
  /**
    * Column is pinned left when grid is rendered.  Defaults to false
    * @default false
    */
  var pinnedLeft: js.UndefOr[Boolean] = js.undefined
  /**
    * Column is pinned right when grid is rendered.  Defaults to false
    * @default false
    */
  var pinnedRight: js.UndefOr[Boolean] = js.undefined
}

object IColumnDef {
  @scala.inline
  def apply(
    enablePinning: js.UndefOr[Boolean] = js.undefined,
    pinnedLeft: js.UndefOr[Boolean] = js.undefined,
    pinnedRight: js.UndefOr[Boolean] = js.undefined
  ): IColumnDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enablePinning)) __obj.updateDynamic("enablePinning")(enablePinning.asInstanceOf[js.Any])
    if (!js.isUndefined(pinnedLeft)) __obj.updateDynamic("pinnedLeft")(pinnedLeft.asInstanceOf[js.Any])
    if (!js.isUndefined(pinnedRight)) __obj.updateDynamic("pinnedRight")(pinnedRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumnDef]
  }
}

