package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 运动数据列表 */
trait WxaSportRecord extends StObject {
  
  /** 消耗卡路里 */
  var calorie: Double
  
  /** 运动距离 */
  var distance: Double
  
  /** 运动时长 */
  var time: Double
  
  /** 运动项目id */
  var typeId: String
  
  /** 小程序app内跳转url */
  var url: String
}
object WxaSportRecord {
  
  inline def apply(calorie: Double, distance: Double, time: Double, typeId: String, url: String): WxaSportRecord = {
    val __obj = js.Dynamic.literal(calorie = calorie.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxaSportRecord]
  }
  
  extension [Self <: WxaSportRecord](x: Self) {
    
    inline def setCalorie(value: Double): Self = StObject.set(x, "calorie", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTypeId(value: String): Self = StObject.set(x, "typeId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
