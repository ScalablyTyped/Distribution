package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTaxId extends StObject {
  
  val Verification: Any
}
object TypeofTaxId {
  
  inline def apply(Verification: Any): TypeofTaxId = {
    val __obj = js.Dynamic.literal(Verification = Verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTaxId]
  }
  
  extension [Self <: TypeofTaxId](x: Self) {
    
    inline def setVerification(value: Any): Self = StObject.set(x, "Verification", value.asInstanceOf[js.Any])
  }
}
