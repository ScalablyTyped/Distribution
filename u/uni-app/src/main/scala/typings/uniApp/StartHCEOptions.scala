package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartHCEOptions extends StObject {
  
  /**
    * 需要注册到系统的 AID 列表，每个 AID 为 String 类型
    */
  var aid_list: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object StartHCEOptions {
  
  @scala.inline
  def apply(): StartHCEOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartHCEOptions]
  }
  
  @scala.inline
  implicit class StartHCEOptionsMutableBuilder[Self <: StartHCEOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAid_list(value: js.Array[js.Any]): Self = StObject.set(x, "aid_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAid_listUndefined: Self = StObject.set(x, "aid_list", js.undefined)
    
    @scala.inline
    def setAid_listVarargs(value: js.Any*): Self = StObject.set(x, "aid_list", js.Array(value :_*))
    
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
