package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 需要添加的卡券列表 */
trait AddCardRequestInfo extends StObject {
  
  /** 卡券的扩展参数。需将 CardExt 对象 JSON 序列化为**字符串**传入 */
  var cardExt: String
  
  /** 卡券 ID */
  var cardId: String
}
object AddCardRequestInfo {
  
  inline def apply(cardExt: String, cardId: String): AddCardRequestInfo = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardRequestInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCardRequestInfo] (val x: Self) extends AnyVal {
    
    inline def setCardExt(value: String): Self = StObject.set(x, "cardExt", value.asInstanceOf[js.Any])
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
  }
}
