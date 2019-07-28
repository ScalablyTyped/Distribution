package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileOption extends js.Object {
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * HTTP 请求 Header，header 中不能设置 Referer
    */
  var header: js.UndefOr[js.Any] = js.undefined
  /**
    * 下载成功后以 tempFilePath 的形式传给页面，res = {tempFilePath: '文件的临时路径'}
    */
  var success: js.UndefOr[js.Function1[/* result */ DownloadSuccessData, Unit]] = js.undefined
  /**
    * 下载资源的 url
    */
  var url: js.UndefOr[String] = js.undefined
}

object DownloadFileOption {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    header: js.Any = null,
    success: /* result */ DownloadSuccessData => Unit = null,
    url: String = null
  ): DownloadFileOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (header != null) __obj.updateDynamic("header")(header)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DownloadFileOption]
  }
}

