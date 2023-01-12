package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreshLogin extends StObject {
  
  var freshLogin: scala.Double
  
  var login: scala.Double
  
  var noOption: scala.Double
  
  var selectAccount: scala.Double
}
object FreshLogin {
  
  inline def apply(freshLogin: scala.Double, login: scala.Double, noOption: scala.Double, selectAccount: scala.Double): FreshLogin = {
    val __obj = js.Dynamic.literal(freshLogin = freshLogin.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], noOption = noOption.asInstanceOf[js.Any], selectAccount = selectAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreshLogin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FreshLogin] (val x: Self) extends AnyVal {
    
    inline def setFreshLogin(value: scala.Double): Self = StObject.set(x, "freshLogin", value.asInstanceOf[js.Any])
    
    inline def setLogin(value: scala.Double): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setNoOption(value: scala.Double): Self = StObject.set(x, "noOption", value.asInstanceOf[js.Any])
    
    inline def setSelectAccount(value: scala.Double): Self = StObject.set(x, "selectAccount", value.asInstanceOf[js.Any])
  }
}
