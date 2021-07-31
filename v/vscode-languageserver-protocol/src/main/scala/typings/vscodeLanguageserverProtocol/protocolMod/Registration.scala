package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registration extends StObject {
  
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again.
    */
  var id: String
  
  /**
    * The method to register for.
    */
  var method: String
  
  /**
    * Options necessary for the registration.
    */
  var registerOptions: js.UndefOr[js.Any] = js.undefined
}
object Registration {
  
  @scala.inline
  def apply(id: String, method: String): Registration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registration]
  }
  
  @scala.inline
  implicit class RegistrationMutableBuilder[Self <: Registration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterOptions(value: js.Any): Self = StObject.set(x, "registerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterOptionsUndefined: Self = StObject.set(x, "registerOptions", js.undefined)
  }
}
