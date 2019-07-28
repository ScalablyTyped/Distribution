package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAccelerometerChangeSuccess extends js.Object {
  /**
    * X 轴
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Y 轴
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * Z 轴
    */
  var z: js.UndefOr[Double] = js.undefined
}

object OnAccelerometerChangeSuccess {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null, z: Int | Double = null): OnAccelerometerChangeSuccess = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAccelerometerChangeSuccess]
  }
}

