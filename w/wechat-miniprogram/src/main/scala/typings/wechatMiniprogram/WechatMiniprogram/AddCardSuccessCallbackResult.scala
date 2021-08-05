package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCardSuccessCallbackResult extends StObject {
  
  /** 卡券添加结果列表 */
  var cardList: js.Array[AddCardResponseInfo]
  
  var errMsg: String
}
object AddCardSuccessCallbackResult {
  
  inline def apply(cardList: js.Array[AddCardResponseInfo], errMsg: String): AddCardSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardSuccessCallbackResult]
  }
  
  extension [Self <: AddCardSuccessCallbackResult](x: Self) {
    
    inline def setCardList(value: js.Array[AddCardResponseInfo]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    inline def setCardListVarargs(value: AddCardResponseInfo*): Self = StObject.set(x, "cardList", js.Array(value :_*))
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
