package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.anon.ResultStr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanQRCodeConfig extends WxBaseRequestConfig {
  
  /**
    * 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
    */
  var needResult: js.UndefOr[Double] = js.native
  
  /**
    * ["qrCode","barCode"], 可以指定扫二维码还是一维码，默认二者都有
    */
  var scanType: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * resultStr 是当 needResult 为 1 时，扫码返回的结果
    */
  @JSName("success")
  var success_ScanQRCodeConfig: js.UndefOr[js.Function1[/* res */ ResultStr, Unit]] = js.native
}
object ScanQRCodeConfig {
  
  @scala.inline
  def apply(): ScanQRCodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanQRCodeConfig]
  }
  
  @scala.inline
  implicit class ScanQRCodeConfigOps[Self <: ScanQRCodeConfig] (val x: Self) extends AnyVal {
    
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
    def setNeedResult(value: Double): Self = this.set("needResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedResult: Self = this.set("needResult", js.undefined)
    
    @scala.inline
    def setScanTypeVarargs(value: String*): Self = this.set("scanType", js.Array(value :_*))
    
    @scala.inline
    def setScanType(value: js.Array[String]): Self = this.set("scanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanType: Self = this.set("scanType", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ ResultStr => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
