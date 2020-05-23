package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapCheckZoomRangeOptions extends js.Object {
  var checkZoomRange: js.UndefOr[Boolean] = js.undefined
}

object IMapCheckZoomRangeOptions {
  @scala.inline
  def apply(checkZoomRange: js.UndefOr[Boolean] = js.undefined): IMapCheckZoomRangeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkZoomRange)) __obj.updateDynamic("checkZoomRange")(checkZoomRange.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapCheckZoomRangeOptions]
  }
}

