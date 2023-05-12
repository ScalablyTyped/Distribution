package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderGiftCardSnake extends StObject {
  
  var amount: js.UndefOr[Double] = js.undefined
  
  var code: js.UndefOr[String] = js.undefined
  
  var code_formatted: js.UndefOr[String] = js.undefined
  
  var giftcard: js.UndefOr[Any] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var last4: js.UndefOr[String] = js.undefined
}
object OrderGiftCardSnake {
  
  inline def apply(): OrderGiftCardSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderGiftCardSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderGiftCardSnake] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCode_formatted(value: String): Self = StObject.set(x, "code_formatted", value.asInstanceOf[js.Any])
    
    inline def setCode_formattedUndefined: Self = StObject.set(x, "code_formatted", js.undefined)
    
    inline def setGiftcard(value: Any): Self = StObject.set(x, "giftcard", value.asInstanceOf[js.Any])
    
    inline def setGiftcardUndefined: Self = StObject.set(x, "giftcard", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLast4(value: String): Self = StObject.set(x, "last4", value.asInstanceOf[js.Any])
    
    inline def setLast4Undefined: Self = StObject.set(x, "last4", js.undefined)
  }
}
