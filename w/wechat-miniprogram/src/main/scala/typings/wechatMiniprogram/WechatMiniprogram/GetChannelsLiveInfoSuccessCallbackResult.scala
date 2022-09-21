package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelsLiveInfoSuccessCallbackResult extends StObject {
  
  /** 直播描述 */
  var description: String
  
  var errMsg: String
  
  /** 直播 feedId */
  var feedId: String
  
  /** 直播封面 */
  var headUrl: String
  
  /** 直播名称 */
  var nickname: String
  
  /** 直播 nonceId */
  var nonceId: String
  
  /** 直播状态，1未开播，2直播中，3直播结束，4直播准备中 */
  var status: Double
}
object GetChannelsLiveInfoSuccessCallbackResult {
  
  inline def apply(
    description: String,
    errMsg: String,
    feedId: String,
    headUrl: String,
    nickname: String,
    nonceId: String,
    status: Double
  ): GetChannelsLiveInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], feedId = feedId.asInstanceOf[js.Any], headUrl = headUrl.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], nonceId = nonceId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChannelsLiveInfoSuccessCallbackResult]
  }
  
  extension [Self <: GetChannelsLiveInfoSuccessCallbackResult](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setFeedId(value: String): Self = StObject.set(x, "feedId", value.asInstanceOf[js.Any])
    
    inline def setHeadUrl(value: String): Self = StObject.set(x, "headUrl", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNonceId(value: String): Self = StObject.set(x, "nonceId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
