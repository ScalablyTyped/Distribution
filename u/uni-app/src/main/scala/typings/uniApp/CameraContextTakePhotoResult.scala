package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraContextTakePhotoResult extends js.Object {
  /**
    * 照片文件的临时路径，安卓是jpg图片格式，ios是png
    */
  var tempImagePath: js.UndefOr[String] = js.native
}

object CameraContextTakePhotoResult {
  @scala.inline
  def apply(): CameraContextTakePhotoResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraContextTakePhotoResult]
  }
  @scala.inline
  implicit class CameraContextTakePhotoResultOps[Self <: CameraContextTakePhotoResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTempImagePath(value: String): Self = this.set("tempImagePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTempImagePath: Self = this.set("tempImagePath", js.undefined)
  }
  
}

