package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanCodeOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 是否只能从相机扫码，不允许从相册选择图片
    * @version 1.2.0
    */
  var onlyFromCamera: js.UndefOr[Boolean] = js.native
  /**
    * 扫码类型，参数类型是数组
    * 二维码是'qrCode'，一维码是'barCode'，DataMatrix是‘datamatrix’，pdf417是‘pdf417’。
    * @version 1.7.0
    */
  var scanType: js.UndefOr[js.Array[String]] = js.native
  @JSName("success")
  def success_MScanCodeOptions(res: ScanCodeData): Unit = js.native
}

object ScanCodeOptions {
  @scala.inline
  def apply(success: ScanCodeData => Unit): ScanCodeOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
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
    def setSuccess(value: ScanCodeData => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def setOnlyFromCamera(value: Boolean): Self = this.set("onlyFromCamera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyFromCamera: Self = this.set("onlyFromCamera", js.undefined)
    @scala.inline
    def setScanTypeVarargs(value: String*): Self = this.set("scanType", js.Array(value :_*))
    @scala.inline
    def setScanType(value: js.Array[String]): Self = this.set("scanType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanType: Self = this.set("scanType", js.undefined)
  }
  
}

