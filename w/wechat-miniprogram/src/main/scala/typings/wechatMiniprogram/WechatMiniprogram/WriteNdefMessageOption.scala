package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteNdefMessageOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[WriteNdefMessageCompleteCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WriteNdefMessageFailCallback] = js.native
  /** 二进制对象数组, 需要指明 id, type 以及 payload (均为 ArrayBuffer 类型) */
  var records: js.Array[_] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WriteNdefMessageSuccessCallback] = js.native
  /** text 数组 */
  var texts: js.Array[_] = js.native
  /** uri 数组 */
  var uris: js.Array[_] = js.native
}

object WriteNdefMessageOption {
  @scala.inline
  def apply(records: js.Array[_], texts: js.Array[_], uris: js.Array[_]): WriteNdefMessageOption = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any], texts = texts.asInstanceOf[js.Any], uris = uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteNdefMessageOption]
  }
  @scala.inline
  implicit class WriteNdefMessageOptionOps[Self <: WriteNdefMessageOption] (val x: Self) extends AnyVal {
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
    def setRecordsVarargs(value: js.Any*): Self = this.set("records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: js.Array[_]): Self = this.set("records", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextsVarargs(value: js.Any*): Self = this.set("texts", js.Array(value :_*))
    @scala.inline
    def setTexts(value: js.Array[_]): Self = this.set("texts", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrisVarargs(value: js.Any*): Self = this.set("uris", js.Array(value :_*))
    @scala.inline
    def setUris(value: js.Array[_]): Self = this.set("uris", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

