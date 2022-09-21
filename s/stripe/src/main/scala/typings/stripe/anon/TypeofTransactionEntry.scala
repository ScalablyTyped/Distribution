package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTransactionEntry extends StObject {
  
  val FlowDetails: Any
}
object TypeofTransactionEntry {
  
  inline def apply(FlowDetails: Any): TypeofTransactionEntry = {
    val __obj = js.Dynamic.literal(FlowDetails = FlowDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTransactionEntry]
  }
  
  extension [Self <: TypeofTransactionEntry](x: Self) {
    
    inline def setFlowDetails(value: Any): Self = StObject.set(x, "FlowDetails", value.asInstanceOf[js.Any])
  }
}
