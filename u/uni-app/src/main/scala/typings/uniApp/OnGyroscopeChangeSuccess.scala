package typings.uniApp

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
  def apply(
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined,
    z: js.UndefOr[Double] = js.undefined
  ): OnGyroscopeChangeSuccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGyroscopeChangeSuccess]
  }
}

