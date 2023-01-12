package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofVerificationSessionOptions extends StObject {
  
  val Options: TypeofOptions
}
object TypeofVerificationSessionOptions {
  
  inline def apply(Options: TypeofOptions): TypeofVerificationSessionOptions = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofVerificationSessionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofVerificationSessionOptions] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: TypeofOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
  }
}
