package typings.swellJs.anon

import typings.swellJs.typesPaymentMod.InputPaymentRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  var card: js.UndefOr[InputPaymentRedirect] = js.undefined
  
  var klarna: js.UndefOr[InputPaymentRedirect] = js.undefined
  
  var paysafecard: js.UndefOr[InputPaymentRedirect] = js.undefined
}
object Card {
  
  inline def apply(): Card = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
    
    inline def setCard(value: InputPaymentRedirect): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setKlarna(value: InputPaymentRedirect): Self = StObject.set(x, "klarna", value.asInstanceOf[js.Any])
    
    inline def setKlarnaUndefined: Self = StObject.set(x, "klarna", js.undefined)
    
    inline def setPaysafecard(value: InputPaymentRedirect): Self = StObject.set(x, "paysafecard", value.asInstanceOf[js.Any])
    
    inline def setPaysafecardUndefined: Self = StObject.set(x, "paysafecard", js.undefined)
  }
}
