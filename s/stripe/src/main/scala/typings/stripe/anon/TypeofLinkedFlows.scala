package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLinkedFlows extends StObject {
  
  val SourceFlowDetails: Any
}
object TypeofLinkedFlows {
  
  inline def apply(SourceFlowDetails: Any): TypeofLinkedFlows = {
    val __obj = js.Dynamic.literal(SourceFlowDetails = SourceFlowDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofLinkedFlows]
  }
  
  extension [Self <: TypeofLinkedFlows](x: Self) {
    
    inline def setSourceFlowDetails(value: Any): Self = StObject.set(x, "SourceFlowDetails", value.asInstanceOf[js.Any])
  }
}
