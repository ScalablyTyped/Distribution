package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPerson extends StObject {
  
  val Documents: Any
  
  val Verification: Any
}
object TypeofPerson {
  
  inline def apply(Documents: Any, Verification: Any): TypeofPerson = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], Verification = Verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPerson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPerson] (val x: Self) extends AnyVal {
    
    inline def setDocuments(value: Any): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Any): Self = StObject.set(x, "Verification", value.asInstanceOf[js.Any])
  }
}
