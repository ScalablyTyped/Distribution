package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 上传下载
trait UploadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 要上传文件资源的路径 */
  var filePath: java.lang.String
  /** HTTP 请求中其他额外的 form data */
  var formData: js.UndefOr[js.Any] = js.undefined
  /** HTTP 请求 Header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var name: java.lang.String
  /** 开发者服务器 url */
  var url: java.lang.String
}

object UploadFileOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    name: java.lang.String,
    url: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    formData: js.Any = null,
    header: RequestHeader = null,
    success: js.Any => scala.Unit = null
  ): UploadFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, name = name, url = url)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (formData != null) __obj.updateDynamic("formData")(formData)
    if (header != null) __obj.updateDynamic("header")(header)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[UploadFileOptions]
  }
}

