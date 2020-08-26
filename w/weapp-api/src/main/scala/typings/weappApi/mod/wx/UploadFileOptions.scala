package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadFileOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.native
  /** 要上传文件资源的路径 */
  var filePath: String = js.native
  /** HTTP 请求中其他额外的 form data */
  var formData: js.UndefOr[js.Any] = js.native
  /** HTTP 请求 Header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.native
  /** 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var name: String = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.native
  /** 开发者服务器 url */
  var url: String = js.native
}

object UploadFileOptions {
  @scala.inline
  def apply(filePath: String, name: String, url: String): UploadFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOptions]
  }
  @scala.inline
  implicit class UploadFileOptionsOps[Self <: UploadFileOptions] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: /* res */ js.Any => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: /* res */ js.Any => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setFormData(value: js.Any): Self = this.set("formData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    @scala.inline
    def setHeader(value: RequestHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ js.Any => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

