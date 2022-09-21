package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDispute extends StObject {
  
  val Evidence: TypeofEvidence
}
object TypeofDispute {
  
  inline def apply(Evidence: TypeofEvidence): TypeofDispute = {
    val __obj = js.Dynamic.literal(Evidence = Evidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDispute]
  }
  
  extension [Self <: TypeofDispute](x: Self) {
    
    inline def setEvidence(value: TypeofEvidence): Self = StObject.set(x, "Evidence", value.asInstanceOf[js.Any])
  }
}
