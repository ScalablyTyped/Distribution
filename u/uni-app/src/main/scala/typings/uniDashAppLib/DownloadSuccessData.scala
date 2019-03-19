package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadSuccessData extends js.Object {
  /**
    * 开发者服务器返回的 HTTP 状态码
    */
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  /**
    * 临时文件路径，下载后的文件会存储到一个临时文件
    */
  var tempFilePath: js.UndefOr[java.lang.String] = js.undefined
}

object DownloadSuccessData {
  @scala.inline
  def apply(statusCode: scala.Int | scala.Double = null, tempFilePath: java.lang.String = null): DownloadSuccessData = {
    val __obj = js.Dynamic.literal()
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (tempFilePath != null) __obj.updateDynamic("tempFilePath")(tempFilePath)
    __obj.asInstanceOf[DownloadSuccessData]
  }
}

