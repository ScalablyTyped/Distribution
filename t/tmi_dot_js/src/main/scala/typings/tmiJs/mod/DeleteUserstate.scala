package typings.tmiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserstate extends StObject {
  
  var login: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var `target-msg-id`: js.UndefOr[String] = js.undefined
}
object DeleteUserstate {
  
  @scala.inline
  def apply(): DeleteUserstate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteUserstate]
  }
  
  @scala.inline
  implicit class DeleteUserstateMutableBuilder[Self <: DeleteUserstate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def `setTarget-msg-id`(value: String): Self = StObject.set(x, "target-msg-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-msg-idUndefined`: Self = StObject.set(x, "target-msg-id", js.undefined)
  }
}
