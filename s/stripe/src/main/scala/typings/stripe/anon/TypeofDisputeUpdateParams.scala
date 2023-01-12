package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDisputeUpdateParams extends StObject {
  
  val Evidence: TypeofEvidence
}
object TypeofDisputeUpdateParams {
  
  inline def apply(Evidence: TypeofEvidence): TypeofDisputeUpdateParams = {
    val __obj = js.Dynamic.literal(Evidence = Evidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDisputeUpdateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDisputeUpdateParams] (val x: Self) extends AnyVal {
    
    inline def setEvidence(value: TypeofEvidence): Self = StObject.set(x, "Evidence", value.asInstanceOf[js.Any])
  }
}
