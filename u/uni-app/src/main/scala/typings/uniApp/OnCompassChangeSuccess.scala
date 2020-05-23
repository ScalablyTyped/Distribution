package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCompassChangeSuccess extends js.Object {
  /**
    * 面对的方向度数
    */
  var direction: js.UndefOr[Double] = js.undefined
}

object OnCompassChangeSuccess {
  @scala.inline
  def apply(direction: js.UndefOr[Double] = js.undefined): OnCompassChangeSuccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(direction)) __obj.updateDynamic("direction")(direction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCompassChangeSuccess]
  }
}

