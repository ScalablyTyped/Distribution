package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnProgressUpdateResult extends js.Object {
  /**
    * 上传进度百分比
    */
  var progress: js.UndefOr[Double] = js.undefined
  /**
    * 预期需要上传的数据总长度，单位 Bytes
    */
  var totalBytesExpectedToSend: js.UndefOr[Double] = js.undefined
  /**
    * 已经上传的数据长度，单位 Bytes
    */
  var totalBytesSent: js.UndefOr[Double] = js.undefined
}

object OnProgressUpdateResult {
  @scala.inline
  def apply(
    progress: js.UndefOr[Double] = js.undefined,
    totalBytesExpectedToSend: js.UndefOr[Double] = js.undefined,
    totalBytesSent: js.UndefOr[Double] = js.undefined
  ): OnProgressUpdateResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalBytesExpectedToSend)) __obj.updateDynamic("totalBytesExpectedToSend")(totalBytesExpectedToSend.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalBytesSent)) __obj.updateDynamic("totalBytesSent")(totalBytesSent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnProgressUpdateResult]
  }
}

