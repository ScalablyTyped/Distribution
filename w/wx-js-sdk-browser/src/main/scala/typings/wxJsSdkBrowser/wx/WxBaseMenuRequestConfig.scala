package typings.wxJsSdkBrowser.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 所有Menu中的相关接口的请求参数
  */
trait WxBaseMenuRequestConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 监听Menu中的按钮点击时触发的方法
    */
  var trigger: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object WxBaseMenuRequestConfig {
  
  inline def apply(): WxBaseMenuRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WxBaseMenuRequestConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WxBaseMenuRequestConfig] (val x: Self) extends AnyVal {
    
    inline def setTrigger(value: () => Unit): Self = StObject.set(x, "trigger", js.Any.fromFunction0(value))
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
