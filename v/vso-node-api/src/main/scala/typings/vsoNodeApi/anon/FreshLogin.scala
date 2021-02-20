package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreshLogin extends StObject {
  
  var freshLogin: scala.Double = js.native
  
  var login: scala.Double = js.native
  
  var noOption: scala.Double = js.native
  
  var selectAccount: scala.Double = js.native
}
object FreshLogin {
  
  @scala.inline
  def apply(freshLogin: scala.Double, login: scala.Double, noOption: scala.Double, selectAccount: scala.Double): FreshLogin = {
    val __obj = js.Dynamic.literal(freshLogin = freshLogin.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], noOption = noOption.asInstanceOf[js.Any], selectAccount = selectAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreshLogin]
  }
  
  @scala.inline
  implicit class FreshLoginMutableBuilder[Self <: FreshLogin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFreshLogin(value: scala.Double): Self = StObject.set(x, "freshLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogin(value: scala.Double): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoOption(value: scala.Double): Self = StObject.set(x, "noOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAccount(value: scala.Double): Self = StObject.set(x, "selectAccount", value.asInstanceOf[js.Any])
  }
}
