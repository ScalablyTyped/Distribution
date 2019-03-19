package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnProgressUpdateResult extends js.Object {
  /**
    * 上传进度百分比
    */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /**
    * 预期需要上传的数据总长度，单位 Bytes
    */
  var totalBytesExpectedToSend: js.UndefOr[scala.Double] = js.undefined
  /**
    * 已经上传的数据长度，单位 Bytes
    */
  var totalBytesSent: js.UndefOr[scala.Double] = js.undefined
}

object OnProgressUpdateResult {
  @scala.inline
  def apply(
    progress: scala.Int | scala.Double = null,
    totalBytesExpectedToSend: scala.Int | scala.Double = null,
    totalBytesSent: scala.Int | scala.Double = null
  ): OnProgressUpdateResult = {
    val __obj = js.Dynamic.literal()
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (totalBytesExpectedToSend != null) __obj.updateDynamic("totalBytesExpectedToSend")(totalBytesExpectedToSend.asInstanceOf[js.Any])
    if (totalBytesSent != null) __obj.updateDynamic("totalBytesSent")(totalBytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnProgressUpdateResult]
  }
}

