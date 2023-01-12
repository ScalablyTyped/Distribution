package typings.stripe.anon

import typings.stripe.mod.Stripe.TestHelpers.Issuing.CardsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cards extends StObject {
  
  var cards: CardsResource
}
object Cards {
  
  inline def apply(cards: CardsResource): Cards = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cards]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cards] (val x: Self) extends AnyVal {
    
    inline def setCards(value: CardsResource): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
  }
}
