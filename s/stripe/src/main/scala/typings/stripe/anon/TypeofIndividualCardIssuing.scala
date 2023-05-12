package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofIndividualCardIssuing extends StObject {
  
  val CardIssuing: Any
  
  val Verification: Any
}
object TypeofIndividualCardIssuing {
  
  inline def apply(CardIssuing: Any, Verification: Any): TypeofIndividualCardIssuing = {
    val __obj = js.Dynamic.literal(CardIssuing = CardIssuing.asInstanceOf[js.Any], Verification = Verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIndividualCardIssuing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofIndividualCardIssuing] (val x: Self) extends AnyVal {
    
    inline def setCardIssuing(value: Any): Self = StObject.set(x, "CardIssuing", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Any): Self = StObject.set(x, "Verification", value.asInstanceOf[js.Any])
  }
}
