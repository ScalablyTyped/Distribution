package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInit extends StObject {
  
  var iconUri: js.UndefOr[String] = js.undefined
  
  var userName: js.UndefOr[String] = js.undefined
}
object AccountInit {
  
  inline def apply(): AccountInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountInit] (val x: Self) extends AnyVal {
    
    inline def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    inline def setIconUriUndefined: Self = StObject.set(x, "iconUri", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
