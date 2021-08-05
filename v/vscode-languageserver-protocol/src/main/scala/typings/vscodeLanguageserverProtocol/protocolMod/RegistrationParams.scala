package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistrationParams extends StObject {
  
  var registrations: js.Array[Registration]
}
object RegistrationParams {
  
  inline def apply(registrations: js.Array[Registration]): RegistrationParams = {
    val __obj = js.Dynamic.literal(registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationParams]
  }
  
  extension [Self <: RegistrationParams](x: Self) {
    
    inline def setRegistrations(value: js.Array[Registration]): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
    
    inline def setRegistrationsVarargs(value: Registration*): Self = StObject.set(x, "registrations", js.Array(value :_*))
  }
}
