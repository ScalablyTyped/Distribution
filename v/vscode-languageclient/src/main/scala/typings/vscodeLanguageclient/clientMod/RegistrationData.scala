package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistrationData[T] extends StObject {
  
  var id: String
  
  var registerOptions: T
}
object RegistrationData {
  
  @scala.inline
  def apply[T](id: String, registerOptions: T): RegistrationData[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], registerOptions = registerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationData[T]]
  }
  
  @scala.inline
  implicit class RegistrationDataMutableBuilder[Self <: RegistrationData[?], T] (val x: Self & RegistrationData[T]) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterOptions(value: T): Self = StObject.set(x, "registerOptions", value.asInstanceOf[js.Any])
  }
}
