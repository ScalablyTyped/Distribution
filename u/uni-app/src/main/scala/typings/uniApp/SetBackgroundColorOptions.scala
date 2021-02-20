package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBackgroundColorOptions extends StObject {
  
  /**
    * 窗口的背景色，必须为十六进制颜色值
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * 底部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
    */
  var backgroundColorBottom: js.UndefOr[String] = js.native
  
  /**
    * 顶部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
    */
  var backgroundColorTop: js.UndefOr[String] = js.native
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}
object SetBackgroundColorOptions {
  
  @scala.inline
  def apply(): SetBackgroundColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBackgroundColorOptions]
  }
  
  @scala.inline
  implicit class SetBackgroundColorOptionsMutableBuilder[Self <: SetBackgroundColorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorBottom(value: String): Self = StObject.set(x, "backgroundColorBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorBottomUndefined: Self = StObject.set(x, "backgroundColorBottom", js.undefined)
    
    @scala.inline
    def setBackgroundColorTop(value: String): Self = StObject.set(x, "backgroundColorTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorTopUndefined: Self = StObject.set(x, "backgroundColorTop", js.undefined)
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
