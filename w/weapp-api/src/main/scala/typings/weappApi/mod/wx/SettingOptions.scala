package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 设置
@js.native
trait SettingOptions extends CommonCallbackOptions {
  
  @JSName("success")
  var success_SettingOptions: js.UndefOr[js.Function1[/* res */ AuthSetting, Unit]] = js.native
}
object SettingOptions {
  
  @scala.inline
  def apply(): SettingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingOptions]
  }
  
  @scala.inline
  implicit class SettingOptionsMutableBuilder[Self <: SettingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ AuthSetting => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
