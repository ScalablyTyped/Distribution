package typings.weixinApp.wx

import typings.weixinApp.anon.SupportMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckIsSupportSoterAuthenticationOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_CheckIsSupportSoterAuthenticationOptions: js.UndefOr[js.Function1[/* res */ SupportMode, Unit]] = js.native
}
object CheckIsSupportSoterAuthenticationOptions {
  
  @scala.inline
  def apply(): CheckIsSupportSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationOptions]
  }
  
  @scala.inline
  implicit class CheckIsSupportSoterAuthenticationOptionsMutableBuilder[Self <: CheckIsSupportSoterAuthenticationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ SupportMode => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
