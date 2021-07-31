package typings.stripeV3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  var card: String
}
object Card {
  
  @scala.inline
  def apply(card: String): Card = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  
  @scala.inline
  implicit class CardMutableBuilder[Self <: Card] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCard(value: String): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
  }
}
