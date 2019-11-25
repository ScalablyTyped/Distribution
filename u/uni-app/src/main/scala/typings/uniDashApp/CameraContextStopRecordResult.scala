package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraContextStopRecordResult extends js.Object {
  /**
    * 封面图片文件的临时路径
    */
  var tempThumbPath: js.UndefOr[String] = js.undefined
  /**
    * 视频的文件的临时路径
    */
  var tempVideoPath: js.UndefOr[String] = js.undefined
}

object CameraContextStopRecordResult {
  @scala.inline
  def apply(tempThumbPath: String = null, tempVideoPath: String = null): CameraContextStopRecordResult = {
    val __obj = js.Dynamic.literal()
    if (tempThumbPath != null) __obj.updateDynamic("tempThumbPath")(tempThumbPath.asInstanceOf[js.Any])
    if (tempVideoPath != null) __obj.updateDynamic("tempVideoPath")(tempVideoPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraContextStopRecordResult]
  }
}

