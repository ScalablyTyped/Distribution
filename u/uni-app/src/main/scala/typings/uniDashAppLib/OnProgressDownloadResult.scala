package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnProgressDownloadResult extends js.Object {
  /**
    * 下载进度百分比
    */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /**
    * 预期需要下载的数据总长度，单位 Bytes
    */
  var totalBytesExpectedToWrite: js.UndefOr[scala.Double] = js.undefined
  /**
    * 已经下载的数据长度，单位 Bytes
    */
  var totalBytesWritten: js.UndefOr[scala.Double] = js.undefined
}

object OnProgressDownloadResult {
  @scala.inline
  def apply(
    progress: scala.Int | scala.Double = null,
    totalBytesExpectedToWrite: scala.Int | scala.Double = null,
    totalBytesWritten: scala.Int | scala.Double = null
  ): OnProgressDownloadResult = {
    val __obj = js.Dynamic.literal()
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (totalBytesExpectedToWrite != null) __obj.updateDynamic("totalBytesExpectedToWrite")(totalBytesExpectedToWrite.asInstanceOf[js.Any])
    if (totalBytesWritten != null) __obj.updateDynamic("totalBytesWritten")(totalBytesWritten.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnProgressDownloadResult]
  }
}

