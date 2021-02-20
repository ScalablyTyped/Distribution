package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 公共回调函数
  */
@js.native
trait CommonCallbackOptions extends StObject {
  
  //  接口调用结束的回调函数
  var complete: js.UndefOr[ResponseCallback] = js.native
  
  //  接口调用失败回调函数
  var fail: js.UndefOr[ResponseCallback] = js.native
  
  //  接口调用成功回调函数
  var success: js.UndefOr[ResponseCallback] = js.native
}
object CommonCallbackOptions {
  
  @scala.inline
  def apply(): CommonCallbackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonCallbackOptions]
  }
  
  @scala.inline
  implicit class CommonCallbackOptionsMutableBuilder[Self <: CommonCallbackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
