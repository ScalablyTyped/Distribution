package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDisputeCreateParams extends StObject {
  
  val Evidence: TypeofEvidence
}
object TypeofDisputeCreateParams {
  
  inline def apply(Evidence: TypeofEvidence): TypeofDisputeCreateParams = {
    val __obj = js.Dynamic.literal(Evidence = Evidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDisputeCreateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDisputeCreateParams] (val x: Self) extends AnyVal {
    
    inline def setEvidence(value: TypeofEvidence): Self = StObject.set(x, "Evidence", value.asInstanceOf[js.Any])
  }
}
