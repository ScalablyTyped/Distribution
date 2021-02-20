package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 所有Menu中的相关接口的请求参数
  */
@js.native
trait WxBaseMenuRequestConfig extends WxBaseRequestConfig {
  
  /**
    * 监听Menu中的按钮点击时触发的方法
    */
  var trigger: js.UndefOr[js.Function0[Unit]] = js.native
}
object WxBaseMenuRequestConfig {
  
  @scala.inline
  def apply(): WxBaseMenuRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WxBaseMenuRequestConfig]
  }
  
  @scala.inline
  implicit class WxBaseMenuRequestConfigMutableBuilder[Self <: WxBaseMenuRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrigger(value: () => Unit): Self = StObject.set(x, "trigger", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
