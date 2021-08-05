package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.high
import typings.wechatMiniprogram.wechatMiniprogramStrings.low
import typings.wechatMiniprogram.wechatMiniprogramStrings.medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAdvertisingObject extends StObject {
  
  /** 广播自定义参数 */
  var advertiseRequest: AdvertiseReqObj
  
  /** 广播功率
    *
    * 可选值：
    * - 'low': 功率低;
    * - 'medium': 功率适中;
    * - 'high': 功率高; */
  var powerLevel: js.UndefOr[low | medium | high] = js.undefined
}
object StartAdvertisingObject {
  
  inline def apply(advertiseRequest: AdvertiseReqObj): StartAdvertisingObject = {
    val __obj = js.Dynamic.literal(advertiseRequest = advertiseRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAdvertisingObject]
  }
  
  extension [Self <: StartAdvertisingObject](x: Self) {
    
    inline def setAdvertiseRequest(value: AdvertiseReqObj): Self = StObject.set(x, "advertiseRequest", value.asInstanceOf[js.Any])
    
    inline def setPowerLevel(value: low | medium | high): Self = StObject.set(x, "powerLevel", value.asInstanceOf[js.Any])
    
    inline def setPowerLevelUndefined: Self = StObject.set(x, "powerLevel", js.undefined)
  }
}
