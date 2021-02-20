package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrationParams extends StObject {
  
  var registrations: js.Array[Registration] = js.native
}
object RegistrationParams {
  
  @scala.inline
  def apply(registrations: js.Array[Registration]): RegistrationParams = {
    val __obj = js.Dynamic.literal(registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationParams]
  }
  
  @scala.inline
  implicit class RegistrationParamsMutableBuilder[Self <: RegistrationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistrations(value: js.Array[Registration]): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationsVarargs(value: Registration*): Self = StObject.set(x, "registrations", js.Array(value :_*))
  }
}
