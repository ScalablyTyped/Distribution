package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RewardedVideoAdOnCloseCallbackResult extends js.Object {
  
  /** 视频是否是在用户完整观看的情况下被关闭的
    *
    * 最低基础库： `2.1.0` */
  var isEnded: Boolean = js.native
}
object RewardedVideoAdOnCloseCallbackResult {
  
  @scala.inline
  def apply(isEnded: Boolean): RewardedVideoAdOnCloseCallbackResult = {
    val __obj = js.Dynamic.literal(isEnded = isEnded.asInstanceOf[js.Any])
    __obj.asInstanceOf[RewardedVideoAdOnCloseCallbackResult]
  }
  
  @scala.inline
  implicit class RewardedVideoAdOnCloseCallbackResultOps[Self <: RewardedVideoAdOnCloseCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setIsEnded(value: Boolean): Self = this.set("isEnded", value.asInstanceOf[js.Any])
  }
}
