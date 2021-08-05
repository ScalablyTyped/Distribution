package typings.stripe.anon

import typings.stripe.mod.cards.ICardSourceCreationOptionsExtended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  var card: js.UndefOr[String | ICardSourceCreationOptionsExtended] = js.undefined
}
object Card {
  
  inline def apply(): Card = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setCard(value: String | ICardSourceCreationOptionsExtended): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
  }
}
