package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFileOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 要上传文件资源的路径 */
  var filePath: String
  /** HTTP 请求中其他额外的 form data */
  var formData: js.UndefOr[js.Any] = js.undefined
  /** HTTP 请求 Header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 文件对应的 key , 开发者在服务器端通过这个 key 可以获取到文件二进制内容 */
  var name: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.undefined
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
    fail: /* res */ js.Any => Unit = null,
    formData: js.Any = null,
    header: RequestHeader = null,
    success: /* res */ js.Any => Unit = null
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

