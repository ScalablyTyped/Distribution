package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPersonCreateParams extends StObject {
  
  val Documents: Any
  
  val Verification: Any
}
object TypeofPersonCreateParams {
  
  inline def apply(Documents: Any, Verification: Any): TypeofPersonCreateParams = {
    val __obj = js.Dynamic.literal(Documents = Documents.asInstanceOf[js.Any], Verification = Verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPersonCreateParams]
  }
  
  extension [Self <: TypeofPersonCreateParams](x: Self) {
    
    inline def setDocuments(value: Any): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Any): Self = StObject.set(x, "Verification", value.asInstanceOf[js.Any])
  }
}
