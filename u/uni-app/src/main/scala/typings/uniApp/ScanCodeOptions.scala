package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanCodeOptions extends js.Object {
  
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 是否只能从相机扫码，不允许从相册选择图片
    */
  var onlyFromCamera: js.UndefOr[Boolean] = js.native
  
  /**
    * 扫码类型，参数类型是数组，二维码是'qrCode'，一维码是'barCode'，DataMatrix是‘datamatrix’，pdf417是‘pdf417’。
    */
  var scanType: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ ScanCodeSuccessRes, Unit]] = js.native
}
object ScanCodeOptions {
  
  @scala.inline
  def apply(): ScanCodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanCodeOptions]
  }
  
  @scala.inline
  implicit class ScanCodeOptionsOps[Self <: ScanCodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setOnlyFromCamera(value: Boolean): Self = this.set("onlyFromCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyFromCamera: Self = this.set("onlyFromCamera", js.undefined)
    
    @scala.inline
    def setScanTypeVarargs(value: js.Any*): Self = this.set("scanType", js.Array(value :_*))
    
    @scala.inline
    def setScanType(value: js.Array[_]): Self = this.set("scanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanType: Self = this.set("scanType", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ ScanCodeSuccessRes => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
