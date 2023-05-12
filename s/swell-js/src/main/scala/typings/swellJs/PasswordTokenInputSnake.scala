package typings.swellJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordTokenInputSnake extends StObject {
  
  var password_token: js.UndefOr[String] = js.undefined
}
object PasswordTokenInputSnake {
  
  inline def apply(): PasswordTokenInputSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordTokenInputSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PasswordTokenInputSnake] (val x: Self) extends AnyVal {
    
    inline def setPassword_token(value: String): Self = StObject.set(x, "password_token", value.asInstanceOf[js.Any])
    
    inline def setPassword_tokenUndefined: Self = StObject.set(x, "password_token", js.undefined)
  }
}
