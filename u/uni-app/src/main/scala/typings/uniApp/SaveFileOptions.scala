package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveFileOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 返回文件的保存路径，res = {savedFilePath: '文件的保存路径'}
    */
  var success: js.UndefOr[js.Function1[/* result */ SaveFileSuccess, Unit]] = js.undefined
  
  /**
    * 需要保存的文件的临时路径
    */
  var tempFilePath: js.UndefOr[String] = js.undefined
}
object SaveFileOptions {
  
  @scala.inline
  def apply(): SaveFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveFileOptions]
  }
  
  @scala.inline
  implicit class SaveFileOptionsMutableBuilder[Self <: SaveFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ SaveFileSuccess => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePathUndefined: Self = StObject.set(x, "tempFilePath", js.undefined)
  }
}
