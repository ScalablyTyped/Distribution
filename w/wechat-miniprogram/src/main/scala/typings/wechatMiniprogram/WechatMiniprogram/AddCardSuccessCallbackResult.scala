package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddCardSuccessCallbackResult extends StObject {
  
  /** 卡券添加结果列表 */
  var cardList: js.Array[AddCardResponseInfo] = js.native
  
  var errMsg: String = js.native
}
object AddCardSuccessCallbackResult {
  
  @scala.inline
  def apply(cardList: js.Array[AddCardResponseInfo], errMsg: String): AddCardSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(cardList = cardList.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class AddCardSuccessCallbackResultMutableBuilder[Self <: AddCardSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardList(value: js.Array[AddCardResponseInfo]): Self = StObject.set(x, "cardList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardListVarargs(value: AddCardResponseInfo*): Self = StObject.set(x, "cardList", js.Array(value :_*))
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
  }
}
