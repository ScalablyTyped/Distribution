package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardData extends StObject {
  
  /**
    * 用户领取到卡券的扩展参数，与调用时传入的参数相同
    */
  var cardExt: js.UndefOr[String] = js.undefined
  
  /**
    * 用户领取到卡券的id
    */
  var cardId: js.UndefOr[String] = js.undefined
  
  /**
    * 加密 code，为用户领取到卡券的code加密后的字符串
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * 是否成功
    */
  var isSuccess: js.UndefOr[Boolean] = js.undefined
}
object CardData {
  
  inline def apply(): CardData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardData] (val x: Self) extends AnyVal {
    
    inline def setCardExt(value: String): Self = StObject.set(x, "cardExt", value.asInstanceOf[js.Any])
    
    inline def setCardExtUndefined: Self = StObject.set(x, "cardExt", js.undefined)
    
    inline def setCardId(value: String): Self = StObject.set(x, "cardId", value.asInstanceOf[js.Any])
    
    inline def setCardIdUndefined: Self = StObject.set(x, "cardId", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIsSuccess(value: Boolean): Self = StObject.set(x, "isSuccess", value.asInstanceOf[js.Any])
    
    inline def setIsSuccessUndefined: Self = StObject.set(x, "isSuccess", js.undefined)
  }
}
