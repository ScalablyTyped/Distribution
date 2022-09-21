package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSourceCreateParams extends StObject {
  
  val Mandate: TypeofMandateAcceptance
  
  val Receiver: Any
  
  val SourceOrder: TypeofSourceOrder
}
object TypeofSourceCreateParams {
  
  inline def apply(Mandate: TypeofMandateAcceptance, Receiver: Any, SourceOrder: TypeofSourceOrder): TypeofSourceCreateParams = {
    val __obj = js.Dynamic.literal(Mandate = Mandate.asInstanceOf[js.Any], Receiver = Receiver.asInstanceOf[js.Any], SourceOrder = SourceOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSourceCreateParams]
  }
  
  extension [Self <: TypeofSourceCreateParams](x: Self) {
    
    inline def setMandate(value: TypeofMandateAcceptance): Self = StObject.set(x, "Mandate", value.asInstanceOf[js.Any])
    
    inline def setReceiver(value: Any): Self = StObject.set(x, "Receiver", value.asInstanceOf[js.Any])
    
    inline def setSourceOrder(value: TypeofSourceOrder): Self = StObject.set(x, "SourceOrder", value.asInstanceOf[js.Any])
  }
}
