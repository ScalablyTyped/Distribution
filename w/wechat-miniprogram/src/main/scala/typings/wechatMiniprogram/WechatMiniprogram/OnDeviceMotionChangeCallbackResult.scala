package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnDeviceMotionChangeCallbackResult extends js.Object {
  /** 当 手机坐标 X/Y 和 地球 X/Y 重合时，绕着 Z 轴转动的夹角为 alpha，范围值为 [0, 2*PI)。逆时针转动为正。 */
  var alpha: Double = js.native
  /** 当手机坐标 Y/Z 和地球 Y/Z 重合时，绕着 X 轴转动的夹角为 beta。范围值为 [-1*PI, PI) 。顶部朝着地球表面转动为正。也有可能朝着用户为正。 */
  var beta: Double = js.native
  /** 当手机 X/Z 和地球 X/Z 重合时，绕着 Y 轴转动的夹角为 gamma。范围值为 [-1*PI/2, PI/2)。右边朝着地球表面转动为正。 */
  var gamma: Double = js.native
}

object OnDeviceMotionChangeCallbackResult {
  @scala.inline
  def apply(alpha: Double, beta: Double, gamma: Double): OnDeviceMotionChangeCallbackResult = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDeviceMotionChangeCallbackResult]
  }
  @scala.inline
  implicit class OnDeviceMotionChangeCallbackResultOps[Self <: OnDeviceMotionChangeCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeta(value: Double): Self = this.set("beta", value.asInstanceOf[js.Any])
    @scala.inline
    def setGamma(value: Double): Self = this.set("gamma", value.asInstanceOf[js.Any])
  }
  
}

