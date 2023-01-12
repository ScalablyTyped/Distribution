package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofIndividual extends StObject {
  
  val Verification: Any
}
object TypeofIndividual {
  
  inline def apply(Verification: Any): TypeofIndividual = {
    val __obj = js.Dynamic.literal(Verification = Verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIndividual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofIndividual] (val x: Self) extends AnyVal {
    
    inline def setVerification(value: Any): Self = StObject.set(x, "Verification", value.asInstanceOf[js.Any])
  }
}
