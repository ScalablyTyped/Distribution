package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSourceUpdateParams extends StObject {
  
  val Mandate: TypeofMandateAcceptance
  
  val SourceOrder: TypeofSourceOrder
}
object TypeofSourceUpdateParams {
  
  inline def apply(Mandate: TypeofMandateAcceptance, SourceOrder: TypeofSourceOrder): TypeofSourceUpdateParams = {
    val __obj = js.Dynamic.literal(Mandate = Mandate.asInstanceOf[js.Any], SourceOrder = SourceOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSourceUpdateParams]
  }
  
  extension [Self <: TypeofSourceUpdateParams](x: Self) {
    
    inline def setMandate(value: TypeofMandateAcceptance): Self = StObject.set(x, "Mandate", value.asInstanceOf[js.Any])
    
    inline def setSourceOrder(value: TypeofSourceOrder): Self = StObject.set(x, "SourceOrder", value.asInstanceOf[js.Any])
  }
}
