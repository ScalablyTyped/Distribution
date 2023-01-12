package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReceivedCreditListP extends StObject {
  
  val LinkedFlows: Any
}
object TypeofReceivedCreditListP {
  
  inline def apply(LinkedFlows: Any): TypeofReceivedCreditListP = {
    val __obj = js.Dynamic.literal(LinkedFlows = LinkedFlows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReceivedCreditListP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofReceivedCreditListP] (val x: Self) extends AnyVal {
    
    inline def setLinkedFlows(value: Any): Self = StObject.set(x, "LinkedFlows", value.asInstanceOf[js.Any])
  }
}
