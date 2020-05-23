package typings.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiTouchOptions extends js.Object {
  var tremor: js.UndefOr[Double] = js.undefined
}

object IMultiTouchOptions {
  @scala.inline
  def apply(tremor: js.UndefOr[Double] = js.undefined): IMultiTouchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tremor)) __obj.updateDynamic("tremor")(tremor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiTouchOptions]
  }
}

