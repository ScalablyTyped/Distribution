package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofProcessing extends StObject {
  
  val Card: Any
}
object TypeofProcessing {
  
  inline def apply(Card: Any): TypeofProcessing = {
    val __obj = js.Dynamic.literal(Card = Card.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofProcessing]
  }
  
  extension [Self <: TypeofProcessing](x: Self) {
    
    inline def setCard(value: Any): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
  }
}
