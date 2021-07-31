package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CameraContextStartRecordOptions extends StObject {
  
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
  
  /**
    * 超过30s或页面onHide时会结束录像
    */
  var timeoutCallback: js.UndefOr[js.Function1[/* result */ CameraContextStopRecordResult, Unit]] = js.undefined
}
object CameraContextStartRecordOptions {
  
  @scala.inline
  def apply(): CameraContextStartRecordOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextStartRecordOptions]
  }
  
  @scala.inline
  implicit class CameraContextStartRecordOptionsMutableBuilder[Self <: CameraContextStartRecordOptions] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setTimeoutCallback(value: /* result */ CameraContextStopRecordResult => Unit): Self = StObject.set(x, "timeoutCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeoutCallbackUndefined: Self = StObject.set(x, "timeoutCallback", js.undefined)
  }
}
