package typings.weixinApp.wx

import typings.weixinApp.anon.SupportMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIsSupportSoterAuthenticationOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_CheckIsSupportSoterAuthenticationOptions: js.UndefOr[js.Function1[/* res */ SupportMode, Unit]] = js.undefined
}
object CheckIsSupportSoterAuthenticationOptions {
  
  inline def apply(): CheckIsSupportSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckIsSupportSoterAuthenticationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckIsSupportSoterAuthenticationOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: /* res */ SupportMode => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
