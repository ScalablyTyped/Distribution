package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 上传下载
trait UploadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 要上传文件资源的路径 */
  var filePath: String
  /** HTTP 请求中其他额外的 form data */
  var formData: js.UndefOr[js.Any] = js.undefined
  /** HTTP 请求 Header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var name: String
  /** 开发者服务器 url */
  var url: String
}

object UploadFileOptions {
  @scala.inline
  def apply(
    filePath: String,
    name: String,
    url: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    formData: js.Any = null,
    header: RequestHeader = null,
    success: js.Any => Unit = null
  ): UploadFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[UploadFileOptions]
  }
}

