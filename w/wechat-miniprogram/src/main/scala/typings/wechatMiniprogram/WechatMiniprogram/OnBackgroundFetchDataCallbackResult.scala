package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBackgroundFetchDataCallbackResult extends StObject {
  
  /** 缓存数据类别 (periodic) */
  var fetchType: String
  
  /** 缓存数据 */
  var fetchedData: String
  
  /** 客户端拿到缓存数据的时间戳 */
  var timeStamp: Double
}
object OnBackgroundFetchDataCallbackResult {
  
  inline def apply(fetchType: String, fetchedData: String, timeStamp: Double): OnBackgroundFetchDataCallbackResult = {
    val __obj = js.Dynamic.literal(fetchType = fetchType.asInstanceOf[js.Any], fetchedData = fetchedData.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBackgroundFetchDataCallbackResult]
  }
  
  extension [Self <: OnBackgroundFetchDataCallbackResult](x: Self) {
    
    inline def setFetchType(value: String): Self = StObject.set(x, "fetchType", value.asInstanceOf[js.Any])
    
    inline def setFetchedData(value: String): Self = StObject.set(x, "fetchedData", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
