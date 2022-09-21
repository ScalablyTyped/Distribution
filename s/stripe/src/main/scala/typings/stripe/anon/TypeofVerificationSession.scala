package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofVerificationSession extends StObject {
  
  val LastError: Any
  
  val Options: TypeofOptions
  
  val Redaction: Any
  
  val VerifiedOutputs: Any
}
object TypeofVerificationSession {
  
  inline def apply(LastError: Any, Options: TypeofOptions, Redaction: Any, VerifiedOutputs: Any): TypeofVerificationSession = {
    val __obj = js.Dynamic.literal(LastError = LastError.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], Redaction = Redaction.asInstanceOf[js.Any], VerifiedOutputs = VerifiedOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofVerificationSession]
  }
  
  extension [Self <: TypeofVerificationSession](x: Self) {
    
    inline def setLastError(value: Any): Self = StObject.set(x, "LastError", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TypeofOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setRedaction(value: Any): Self = StObject.set(x, "Redaction", value.asInstanceOf[js.Any])
    
    inline def setVerifiedOutputs(value: Any): Self = StObject.set(x, "VerifiedOutputs", value.asInstanceOf[js.Any])
  }
}
