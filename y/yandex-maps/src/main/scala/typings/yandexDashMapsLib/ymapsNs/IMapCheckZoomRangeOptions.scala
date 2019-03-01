package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapCheckZoomRangeOptions extends js.Object {
  var checkZoomRange: js.UndefOr[scala.Boolean] = js.undefined
}

object IMapCheckZoomRangeOptions {
  @scala.inline
  def apply(checkZoomRange: js.UndefOr[scala.Boolean] = js.undefined): IMapCheckZoomRangeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkZoomRange)) __obj.updateDynamic("checkZoomRange")(checkZoomRange)
    __obj.asInstanceOf[IMapCheckZoomRangeOptions]
  }
}

