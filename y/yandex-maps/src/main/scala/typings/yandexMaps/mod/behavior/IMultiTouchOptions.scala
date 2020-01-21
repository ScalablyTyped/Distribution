package typings.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiTouchOptions extends js.Object {
  var tremor: js.UndefOr[Double] = js.undefined
}

object IMultiTouchOptions {
  @scala.inline
  def apply(tremor: Int | Double = null): IMultiTouchOptions = {
    val __obj = js.Dynamic.literal()
    if (tremor != null) __obj.updateDynamic("tremor")(tremor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiTouchOptions]
  }
}

