package typings.uiDashGrid.uiDashGridMod.infiniteScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /**
    * Enable infinite scrolling for this grid
    * Defaults to true
    * @default true
    */
  var enableInfiniteScroll: js.UndefOr[Boolean] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(enableInfiniteScroll: js.UndefOr[Boolean] = js.undefined): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableInfiniteScroll)) __obj.updateDynamic("enableInfiniteScroll")(enableInfiniteScroll)
    __obj.asInstanceOf[IGridOptions]
  }
}

