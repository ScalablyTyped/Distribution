package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofVerificationSession extends StObject {
  
  val Options: TypeofOptions
}
object TypeofVerificationSession {
  
  inline def apply(Options: TypeofOptions): TypeofVerificationSession = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofVerificationSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofVerificationSession] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: TypeofOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
  }
}
