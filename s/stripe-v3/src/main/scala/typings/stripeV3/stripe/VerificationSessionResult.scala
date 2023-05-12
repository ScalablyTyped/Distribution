package typings.stripeV3.stripe

import typings.stripeV3.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationSessionResult extends StObject {
  
  var error: js.UndefOr[Error] = js.undefined
  
  var verificationSession: js.UndefOr[Id] = js.undefined
}
object VerificationSessionResult {
  
  inline def apply(): VerificationSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationSessionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerificationSessionResult] (val x: Self) extends AnyVal {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setVerificationSession(value: Id): Self = StObject.set(x, "verificationSession", value.asInstanceOf[js.Any])
    
    inline def setVerificationSessionUndefined: Self = StObject.set(x, "verificationSession", js.undefined)
  }
}
