package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnAccelerometerChangeSuccess extends js.Object {
  /**
    * X 轴
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * Y 轴
    */
  var y: js.UndefOr[scala.Double] = js.undefined
  /**
    * Z 轴
    */
  var z: js.UndefOr[scala.Double] = js.undefined
}

object OnAccelerometerChangeSuccess {
  @scala.inline
  def apply(
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
  ): OnAccelerometerChangeSuccess = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAccelerometerChangeSuccess]
  }
}

