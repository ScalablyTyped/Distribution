package typings.tmiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserNoticeState
  extends StObject
     with CommonUserstate {
  
  var login: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var `system-msg`: js.UndefOr[String] = js.undefined
}
object UserNoticeState {
  
  inline def apply(): UserNoticeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserNoticeState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserNoticeState] (val x: Self) extends AnyVal {
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def `setSystem-msg`(value: String): Self = StObject.set(x, "system-msg", value.asInstanceOf[js.Any])
    
    inline def `setSystem-msgUndefined`: Self = StObject.set(x, "system-msg", js.undefined)
  }
}
