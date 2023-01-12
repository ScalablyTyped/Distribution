package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofOutboundPayments extends StObject {
  
  val Ach: TypeofAch
  
  val UsDomesticWire: TypeofUsDomesticWire
}
object TypeofOutboundPayments {
  
  inline def apply(Ach: TypeofAch, UsDomesticWire: TypeofUsDomesticWire): TypeofOutboundPayments = {
    val __obj = js.Dynamic.literal(Ach = Ach.asInstanceOf[js.Any], UsDomesticWire = UsDomesticWire.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofOutboundPayments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofOutboundPayments] (val x: Self) extends AnyVal {
    
    inline def setAch(value: TypeofAch): Self = StObject.set(x, "Ach", value.asInstanceOf[js.Any])
    
    inline def setUsDomesticWire(value: TypeofUsDomesticWire): Self = StObject.set(x, "UsDomesticWire", value.asInstanceOf[js.Any])
  }
}
