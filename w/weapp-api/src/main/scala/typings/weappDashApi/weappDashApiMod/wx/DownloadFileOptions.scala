package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** HTTP 请求 Header */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 下载成功后以 tempFilePath 的形式传给页面，res = {tempFilePath: '文件的临时路径'} */
  var success: js.UndefOr[TempFileResponseCallback] = js.undefined
  /** 下载资源的类型，用于客户端识别处理，有效值：image/audio/video */
  var `type`: js.UndefOr[String] = js.undefined
  /** 下载资源的 url */
  var url: String
}

object DownloadFileOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Unit = null,
    fail: /* res */ js.Any => Unit = null,
    header: RequestHeader = null,
    success: /* res */ TempFileResponse => Unit = null,
    `type`: String = null
  ): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (header != null) __obj.updateDynamic("header")(header)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DownloadFileOptions]
  }
}

