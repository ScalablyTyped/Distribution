package typings.swellJs

import typings.swellJs.anon.ElementId
import typings.swellJs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputPaymentElementCardSnake
  extends StObject
     with InputPaymentElementBaseSnake {
  
  var card_cvc: js.UndefOr[`0`] = js.undefined
  
  var card_expiry: js.UndefOr[`0`] = js.undefined
  
  var card_number: js.UndefOr[ElementId] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  // https://stripe.com/docs/js/elements_object/create_element?type=card
  var seperate_elements: js.UndefOr[Boolean] = js.undefined
}
object InputPaymentElementCardSnake {
  
  inline def apply(): InputPaymentElementCardSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputPaymentElementCardSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputPaymentElementCardSnake] (val x: Self) extends AnyVal {
    
    inline def setCard_cvc(value: `0`): Self = StObject.set(x, "card_cvc", value.asInstanceOf[js.Any])
    
    inline def setCard_cvcUndefined: Self = StObject.set(x, "card_cvc", js.undefined)
    
    inline def setCard_expiry(value: `0`): Self = StObject.set(x, "card_expiry", value.asInstanceOf[js.Any])
    
    inline def setCard_expiryUndefined: Self = StObject.set(x, "card_expiry", js.undefined)
    
    inline def setCard_number(value: ElementId): Self = StObject.set(x, "card_number", value.asInstanceOf[js.Any])
    
    inline def setCard_numberUndefined: Self = StObject.set(x, "card_number", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSeperate_elements(value: Boolean): Self = StObject.set(x, "seperate_elements", value.asInstanceOf[js.Any])
    
    inline def setSeperate_elementsUndefined: Self = StObject.set(x, "seperate_elements", js.undefined)
  }
}
