package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSuccess extends StObject {
  
  /**
    * 卡券的扩展参数，值为一个 JSON 字符串
    */
  var cardExt: String
  
  /**
    * 用户领取到卡券的 ID
    */
  var cardId: String
  
  /**
    * 加密 code，为用户领取到卡券的code加密后的字符串，解密请参照：code 解码接口
    */
  var code: String
  
  /**
    * 是否成功
    */
  var isSuccess: Boolean
}
object IsSuccess {
  
  inline def apply(cardExt: String, cardId: String, code: String, isSuccess: Boolean): IsSuccess = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], isSuccess = isSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSuccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsSuccess] (val x: Self) extends AnyVal {
    
    inline def setCardExt(value: String): Self = StObject.set(x, "cardExt", value.asInstanceOf[js.Any])
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setIsSuccess(value: Boolean): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
  }
}
