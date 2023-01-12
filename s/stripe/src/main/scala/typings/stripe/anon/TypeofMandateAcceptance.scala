package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofMandateAcceptance extends StObject {
  
  val Acceptance: Any
}
object TypeofMandateAcceptance {
  
  inline def apply(Acceptance: Any): TypeofMandateAcceptance = {
    val __obj = js.Dynamic.literal(Acceptance = Acceptance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofMandateAcceptance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofMandateAcceptance] (val x: Self) extends AnyVal {
    
    inline def setAcceptance(value: Any): Self = StObject.set(x, "Acceptance", value.asInstanceOf[js.Any])
  }
}
