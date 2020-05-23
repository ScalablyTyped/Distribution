package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadSuccessData extends js.Object {
  /**
    * 开发者服务器返回的 HTTP 状态码
    */
  var statusCode: js.UndefOr[Double] = js.undefined
  /**
    * 临时文件路径，下载后的文件会存储到一个临时文件
    */
  var tempFilePath: js.UndefOr[String] = js.undefined
}

object DownloadSuccessData {
  @scala.inline
  def apply(statusCode: js.UndefOr[Double] = js.undefined, tempFilePath: String = null): DownloadSuccessData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    if (tempFilePath != null) __obj.updateDynamic("tempFilePath")(tempFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadSuccessData]
  }
}

