package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseImageOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 最多可以选择的图片张数，默认9
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * original 原图，compressed 压缩图，默认二者都有
    */
  var sizeType: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * album 从相册选图，camera 使用相机，默认二者都有
    */
  var sourceType: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * 成功则返回图片的本地文件路径列表 tempFilePaths
    */
  var success: js.UndefOr[js.Function1[/* result */ ChooseImageSuccessCallbackResult, Unit]] = js.undefined
}
object ChooseImageOptions {
  
  @scala.inline
  def apply(): ChooseImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseImageOptions]
  }
  
  @scala.inline
  implicit class ChooseImageOptionsMutableBuilder[Self <: ChooseImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSizeType(value: String | js.Array[String]): Self = StObject.set(x, "sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeTypeUndefined: Self = StObject.set(x, "sizeType", js.undefined)
    
    @scala.inline
    def setSizeTypeVarargs(value: String*): Self = StObject.set(x, "sizeType", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: String | js.Array[String]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    @scala.inline
    def setSourceTypeVarargs(value: String*): Self = StObject.set(x, "sourceType", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* result */ ChooseImageSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
