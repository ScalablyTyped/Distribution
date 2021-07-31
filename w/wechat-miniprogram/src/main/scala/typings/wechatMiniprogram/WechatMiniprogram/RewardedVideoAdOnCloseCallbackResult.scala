package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RewardedVideoAdOnCloseCallbackResult extends StObject {
  
  /** 视频是否是在用户完整观看的情况下被关闭的
    *
    * 最低基础库： `2.1.0` */
  var isEnded: Boolean
}
object RewardedVideoAdOnCloseCallbackResult {
  
  @scala.inline
  def apply(isEnded: Boolean): RewardedVideoAdOnCloseCallbackResult = {
    val __obj = js.Dynamic.literal(isEnded = isEnded.asInstanceOf[js.Any])
    __obj.asInstanceOf[RewardedVideoAdOnCloseCallbackResult]
  }
  
  @scala.inline
  implicit class RewardedVideoAdOnCloseCallbackResultMutableBuilder[Self <: RewardedVideoAdOnCloseCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEnded(value: Boolean): Self = StObject.set(x, "isEnded", value.asInstanceOf[js.Any])
  }
}
