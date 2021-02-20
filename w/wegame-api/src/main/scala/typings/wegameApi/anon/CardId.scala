package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardId extends StObject {
  
  /**
    * 卡券 ID
    */
  var cardId: String = js.native
  
  /**
    * 由 wx.addCard 的返回对象中的加密 code 通过解密后得到，解密请参照：code 解码接口（https://developers.weixin.qq.com/doc/offiaccount/Cards_and_Offer/Coupons-Mini_Program_Start_Up.html）
    */
  var code: String = js.native
}
object CardId {
  
  @scala.inline
  def apply(cardId: String, code: String): CardId = {
    val __obj = js.Dynamic.literal(cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardId]
  }
  
  @scala.inline
  implicit class CardIdMutableBuilder[Self <: CardId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
