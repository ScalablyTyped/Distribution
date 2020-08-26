package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.barCode
import typings.wechatMiniprogram.wechatMiniprogramStrings.datamatrix
import typings.wechatMiniprogram.wechatMiniprogramStrings.pdf417
import typings.wechatMiniprogram.wechatMiniprogramStrings.qrCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScanCodeOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ScanCodeCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ScanCodeFailCallback] = js.native
  /** 是否只能从相机扫码，不允许从相册选择图片
    *
    * 最低基础库： `1.2.0` */
  var onlyFromCamera: js.UndefOr[Boolean] = js.native
  /** 扫码类型
    *
    * 可选值：
    * - 'barCode': 一维码;
    * - 'qrCode': 二维码;
    * - 'datamatrix': Data Matrix 码;
    * - 'pdf417': PDF417 条码;
    *
    * 最低基础库： `1.7.0` */
  var scanType: js.UndefOr[js.Array[barCode | qrCode | datamatrix | pdf417]] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ScanCodeSuccessCallback] = js.native
}

object ScanCodeOption {
  @scala.inline
  def apply(): ScanCodeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanCodeOption]
  }
  @scala.inline
  implicit class ScanCodeOptionOps[Self <: ScanCodeOption] (val x: Self) extends AnyVal {
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
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setOnlyFromCamera(value: Boolean): Self = this.set("onlyFromCamera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyFromCamera: Self = this.set("onlyFromCamera", js.undefined)
    @scala.inline
    def setScanTypeVarargs(value: (barCode | qrCode | datamatrix | pdf417)*): Self = this.set("scanType", js.Array(value :_*))
    @scala.inline
    def setScanType(value: js.Array[barCode | qrCode | datamatrix | pdf417]): Self = this.set("scanType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanType: Self = this.set("scanType", js.undefined)
    @scala.inline
    def setSuccess(value: /* result */ ScanCodeSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

