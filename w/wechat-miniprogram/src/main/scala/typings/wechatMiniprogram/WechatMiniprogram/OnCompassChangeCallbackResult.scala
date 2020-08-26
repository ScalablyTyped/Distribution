package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCompassChangeCallbackResult extends js.Object {
  /** 精度
    *
    * 最低基础库： `2.4.0` */
  var accuracy: Double | String = js.native
  /** 面对的方向度数 */
  var direction: Double = js.native
}

object OnCompassChangeCallbackResult {
  @scala.inline
  def apply(accuracy: Double | String, direction: Double): OnCompassChangeCallbackResult = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCompassChangeCallbackResult]
  }
  @scala.inline
  implicit class OnCompassChangeCallbackResultOps[Self <: OnCompassChangeCallbackResult] (val x: Self) extends AnyVal {
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
    def setAccuracy(value: Double | String): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
  }
  
}

