package typings.weixinApp.wx

import typings.weixinApp.anon.AuthSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenSettingOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_OpenSettingOptions: js.UndefOr[js.Function1[/* res */ AuthSetting, Unit]] = js.native
}
object OpenSettingOptions {
  
  @scala.inline
  def apply(): OpenSettingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenSettingOptions]
  }
  
  @scala.inline
  implicit class OpenSettingOptionsMutableBuilder[Self <: OpenSettingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ AuthSetting => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
