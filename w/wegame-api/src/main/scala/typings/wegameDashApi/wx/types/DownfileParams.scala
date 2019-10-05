package typings.wegameDashApi.wx.types

import org.scalablytyped.runtime.StringDictionary
import typings.wegameDashApi.Anon_ErrMsg
import typings.wegameDashApi.Anon_StatusCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ Anon_ErrMsg, Unit]] = js.undefined
  /**
    * 在指定filePath之后success回调中将不会有res.tempFilePath路径值，下载的文件会直接写入filePath指定的路径（有写入权限的情况下，根目录请使用wx.env.USER_DATA_PATH，路径文件夹必须存在，否则写入失败）
    */
  var filePath: js.UndefOr[String] = js.undefined
  /**
    * 	HTTP 请求的 Header，Header 中不能设置 Referer
    */
  var header: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * res.tempFilePath 临时文件路径。如果没传入 filePath 指定文件存储路径，则下载后的文件会存储到一个临时文件
    * res.statusCode 开发者服务器返回的 HTTP 状态码
    */
  var success: js.UndefOr[js.Function1[/* res */ Anon_StatusCode, Unit]] = js.undefined
  var url: String
}

object DownfileParams {
  @scala.inline
  def apply(
    url: String,
    complete: () => Unit = null,
    fail: /* res */ Anon_ErrMsg => Unit = null,
    filePath: String = null,
    header: StringDictionary[String] = null,
    success: /* res */ Anon_StatusCode => Unit = null
  ): DownfileParams = {
    val __obj = js.Dynamic.literal(url = url)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (header != null) __obj.updateDynamic("header")(header)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[DownfileParams]
  }
}

