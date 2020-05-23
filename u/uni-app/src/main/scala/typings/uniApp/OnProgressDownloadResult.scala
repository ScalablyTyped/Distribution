package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnProgressDownloadResult extends js.Object {
  /**
    * 下载进度百分比
    */
  var progress: js.UndefOr[Double] = js.undefined
  /**
    * 预期需要下载的数据总长度，单位 Bytes
    */
  var totalBytesExpectedToWrite: js.UndefOr[Double] = js.undefined
  /**
    * 已经下载的数据长度，单位 Bytes
    */
  var totalBytesWritten: js.UndefOr[Double] = js.undefined
}

object OnProgressDownloadResult {
  @scala.inline
  def apply(
    progress: js.UndefOr[Double] = js.undefined,
    totalBytesExpectedToWrite: js.UndefOr[Double] = js.undefined,
    totalBytesWritten: js.UndefOr[Double] = js.undefined
  ): OnProgressDownloadResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalBytesExpectedToWrite)) __obj.updateDynamic("totalBytesExpectedToWrite")(totalBytesExpectedToWrite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalBytesWritten)) __obj.updateDynamic("totalBytesWritten")(totalBytesWritten.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnProgressDownloadResult]
  }
}

