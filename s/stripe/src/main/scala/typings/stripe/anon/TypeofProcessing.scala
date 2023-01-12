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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofProcessing] (val x: Self) extends AnyVal {
    
    inline def setCard(value: Any): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
  }
}
