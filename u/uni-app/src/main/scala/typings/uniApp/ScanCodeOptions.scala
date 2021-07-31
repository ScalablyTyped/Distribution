package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanCodeOptions extends StObject {
  
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 是否只能从相机扫码，不允许从相册选择图片
    */
  var onlyFromCamera: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 扫码类型，参数类型是数组，二维码是'qrCode'，一维码是'barCode'，DataMatrix是‘datamatrix’，pdf417是‘pdf417’。
    */
  var scanType: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ ScanCodeSuccessRes, Unit]] = js.undefined
}
object ScanCodeOptions {
  
  @scala.inline
  def apply(): ScanCodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanCodeOptions]
  }
  
  @scala.inline
  implicit class ScanCodeOptionsMutableBuilder[Self <: ScanCodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setOnlyFromCamera(value: Boolean): Self = StObject.set(x, "onlyFromCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyFromCameraUndefined: Self = StObject.set(x, "onlyFromCamera", js.undefined)
    
    @scala.inline
    def setScanType(value: js.Array[js.Any]): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanTypeUndefined: Self = StObject.set(x, "scanType", js.undefined)
    
    @scala.inline
    def setScanTypeVarargs(value: js.Any*): Self = StObject.set(x, "scanType", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: /* result */ ScanCodeSuccessRes => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
