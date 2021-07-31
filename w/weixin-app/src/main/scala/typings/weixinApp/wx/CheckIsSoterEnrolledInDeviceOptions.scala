package typings.weixinApp.wx

import typings.weixinApp.anon.IsEnrolled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIsSoterEnrolledInDeviceOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var checkAuthMode: AuthModes
  
  // 认证方式
  @JSName("success")
  var success_CheckIsSoterEnrolledInDeviceOptions: js.UndefOr[js.Function1[/* res */ IsEnrolled, Unit]] = js.undefined
}
object CheckIsSoterEnrolledInDeviceOptions {
  
  @scala.inline
  def apply(checkAuthMode: AuthModes): CheckIsSoterEnrolledInDeviceOptions = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOptions]
  }
  
  @scala.inline
  implicit class CheckIsSoterEnrolledInDeviceOptionsMutableBuilder[Self <: CheckIsSoterEnrolledInDeviceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckAuthMode(value: AuthModes): Self = StObject.set(x, "checkAuthMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ IsEnrolled => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
