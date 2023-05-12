package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCard extends StObject {
  
  val Installments: Any
}
object TypeofCard {
  
  inline def apply(Installments: Any): TypeofCard = {
    val __obj = js.Dynamic.literal(Installments = Installments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCard] (val x: Self) extends AnyVal {
    
    inline def setInstallments(value: Any): Self = StObject.set(x, "Installments", value.asInstanceOf[js.Any])
  }
}
