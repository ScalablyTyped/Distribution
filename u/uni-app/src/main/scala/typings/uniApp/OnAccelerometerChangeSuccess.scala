package typings.uniApp

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
  def apply(
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): OnAccelerometerChangeSuccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAccelerometerChangeSuccess]
  }
}

