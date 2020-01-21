package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraContextTakePhotoResult extends js.Object {
  /**
    * 照片文件的临时路径，安卓是jpg图片格式，ios是png
    */
  var tempImagePath: js.UndefOr[String] = js.undefined
}

object CameraContextTakePhotoResult {
  @scala.inline
  def apply(tempImagePath: String = null): CameraContextTakePhotoResult = {
    val __obj = js.Dynamic.literal()
    if (tempImagePath != null) __obj.updateDynamic("tempImagePath")(tempImagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraContextTakePhotoResult]
  }
}

