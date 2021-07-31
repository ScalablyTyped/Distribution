package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseOptions[R, E] extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[js.Function1[/* res */ E, Unit]] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[js.Function1[/* res */ R, Unit]] = js.undefined
}
object BaseOptions {
  
  @scala.inline
  def apply[R, E](): BaseOptions[R, E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOptions[R, E]]
  }
  
  @scala.inline
  implicit class BaseOptionsMutableBuilder[Self <: BaseOptions[?, ?], R, E] (val x: Self & (BaseOptions[R, E])) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ E => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ R => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
