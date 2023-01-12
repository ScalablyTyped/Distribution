package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCompany extends StObject {
  
  val Verification: Any
}
object TypeofCompany {
  
  inline def apply(Verification: Any): TypeofCompany = {
    val __obj = js.Dynamic.literal(Verification = Verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCompany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCompany] (val x: Self) extends AnyVal {
    
    inline def setVerification(value: Any): Self = StObject.set(x, "Verification", value.asInstanceOf[js.Any])
  }
}
