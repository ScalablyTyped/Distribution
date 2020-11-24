package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanCodeSuccessRes extends js.Object {
  
  /**
    * 所扫码的字符集
    */
  var charSet: js.UndefOr[String] = js.native
  
  /**
    * 当所扫的码为当前应用的合法二维码时，会返回此字段，内容为二维码携带的 path。
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * 所扫码的内容
    */
  var result: js.UndefOr[String] = js.native
  
  /**
    * 所扫码的类型
    */
  var scanType: js.UndefOr[String] = js.native
}
object ScanCodeSuccessRes {
  
  @scala.inline
  def apply(): ScanCodeSuccessRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanCodeSuccessRes]
  }
  
  @scala.inline
  implicit class ScanCodeSuccessResOps[Self <: ScanCodeSuccessRes] (val x: Self) extends AnyVal {
    
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
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharSet: Self = this.set("charSet", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setScanType(value: String): Self = this.set("scanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanType: Self = this.set("scanType", js.undefined)
  }
}
