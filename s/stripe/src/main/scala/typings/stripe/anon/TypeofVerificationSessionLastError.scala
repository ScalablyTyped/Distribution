package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofVerificationSessionLastError extends StObject {
  
  val LastError: Any
  
  val Options: TypeofOptions
  
  val Redaction: Any
  
  val VerifiedOutputs: Any
}
object TypeofVerificationSessionLastError {
  
  inline def apply(LastError: Any, Options: TypeofOptions, Redaction: Any, VerifiedOutputs: Any): TypeofVerificationSessionLastError = {
    val __obj = js.Dynamic.literal(LastError = LastError.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Redaction = Redaction.asInstanceOf[js.Any], VerifiedOutputs = VerifiedOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofVerificationSessionLastError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofVerificationSessionLastError] (val x: Self) extends AnyVal {
    
    inline def setLastError(value: Any): Self = StObject.set(x, "LastError", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TypeofOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setRedaction(value: Any): Self = StObject.set(x, "Redaction", value.asInstanceOf[js.Any])
    
    inline def setVerifiedOutputs(value: Any): Self = StObject.set(x, "VerifiedOutputs", value.asInstanceOf[js.Any])
  }
}
