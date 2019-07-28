package typings.uniDashApp

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
  def apply(direction: Int | Double = null): OnCompassChangeSuccess = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCompassChangeSuccess]
  }
}

