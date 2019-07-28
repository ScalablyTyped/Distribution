package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGyroscopeChangeSuccess extends js.Object {
  /**
    * x 轴方向角速度
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * y 轴方向角速度
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * z 轴方向角速度
    */
  var z: js.UndefOr[Double] = js.undefined
}

object OnGyroscopeChangeSuccess {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null, z: Int | Double = null): OnGyroscopeChangeSuccess = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGyroscopeChangeSuccess]
  }
}

