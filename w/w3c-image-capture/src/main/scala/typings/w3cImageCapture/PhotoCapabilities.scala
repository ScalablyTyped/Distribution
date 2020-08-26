package typings.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotoCapabilities extends js.Object {
  val fillLightMode: js.Array[FillLightMode] = js.native
  val imageHeight: MediaSettingsRange = js.native
  val imageWidth: MediaSettingsRange = js.native
  val redEyeReduction: RedEyeReduction = js.native
}

object PhotoCapabilities {
  @scala.inline
  def apply(
    fillLightMode: js.Array[FillLightMode],
    imageHeight: MediaSettingsRange,
    imageWidth: MediaSettingsRange,
    redEyeReduction: RedEyeReduction
  ): PhotoCapabilities = {
    val __obj = js.Dynamic.literal(fillLightMode = fillLightMode.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], redEyeReduction = redEyeReduction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoCapabilities]
  }
  @scala.inline
  implicit class PhotoCapabilitiesOps[Self <: PhotoCapabilities] (val x: Self) extends AnyVal {
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
    def setFillLightModeVarargs(value: FillLightMode*): Self = this.set("fillLightMode", js.Array(value :_*))
    @scala.inline
    def setFillLightMode(value: js.Array[FillLightMode]): Self = this.set("fillLightMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageHeight(value: MediaSettingsRange): Self = this.set("imageHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageWidth(value: MediaSettingsRange): Self = this.set("imageWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedEyeReduction(value: RedEyeReduction): Self = this.set("redEyeReduction", value.asInstanceOf[js.Any])
  }
  
}

