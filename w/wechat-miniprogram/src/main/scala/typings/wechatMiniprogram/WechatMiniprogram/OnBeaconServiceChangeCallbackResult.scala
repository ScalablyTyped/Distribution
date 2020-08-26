package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBeaconServiceChangeCallbackResult extends js.Object {
  /** 服务目前是否可用 */
  var available: Boolean = js.native
  /** 目前是否处于搜索状态 */
  var discovering: Boolean = js.native
}

object OnBeaconServiceChangeCallbackResult {
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): OnBeaconServiceChangeCallbackResult = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeaconServiceChangeCallbackResult]
  }
  @scala.inline
  implicit class OnBeaconServiceChangeCallbackResultOps[Self <: OnBeaconServiceChangeCallbackResult] (val x: Self) extends AnyVal {
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
    def setAvailable(value: Boolean): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscovering(value: Boolean): Self = this.set("discovering", value.asInstanceOf[js.Any])
  }
  
}

