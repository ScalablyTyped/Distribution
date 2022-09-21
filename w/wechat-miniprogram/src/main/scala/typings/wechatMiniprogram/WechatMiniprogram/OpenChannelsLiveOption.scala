package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenChannelsLiveOption extends StObject {
  
  /** 直播 feedId，通过 getChannelsLiveInfo 接口获取 */
  var feedId: String
  
  /** 视频号 id */
  var finderUserName: String
  
  /** 直播 nonceId，通过 getChannelsLiveInfo 接口获取 */
  var nonceId: String
}
object OpenChannelsLiveOption {
  
  inline def apply(feedId: String, finderUserName: String, nonceId: String): OpenChannelsLiveOption = {
    val __obj = js.Dynamic.literal(feedId = feedId.asInstanceOf[js.Any], finderUserName = finderUserName.asInstanceOf[js.Any], nonceId = nonceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenChannelsLiveOption]
  }
  
  extension [Self <: OpenChannelsLiveOption](x: Self) {
    
    inline def setFeedId(value: String): Self = StObject.set(x, "feedId", value.asInstanceOf[js.Any])
    
    inline def setFinderUserName(value: String): Self = StObject.set(x, "finderUserName", value.asInstanceOf[js.Any])
    
    inline def setNonceId(value: String): Self = StObject.set(x, "nonceId", value.asInstanceOf[js.Any])
  }
}
