package typings.w3cImageCapture

import typings.w3cImageCapture.W3C.ConstrainPoint2D
import typings.webrtc.W3C.ConstrainBoolean
import typings.webrtc.W3C.ConstrainDouble
import typings.webrtc.W3C.ConstrainString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackConstraintSet extends js.Object {
  var brightness: js.UndefOr[ConstrainDouble] = js.native
  var colorTemperature: js.UndefOr[ConstrainDouble] = js.native
  var contrast: js.UndefOr[ConstrainDouble] = js.native
  var exposureCompensation: js.UndefOr[ConstrainDouble] = js.native
  var exposureMode: js.UndefOr[ConstrainString] = js.native
  var focusDistance: js.UndefOr[ConstrainDouble] = js.native
  var focusMode: js.UndefOr[ConstrainString] = js.native
  var iso: js.UndefOr[ConstrainDouble] = js.native
  var pointsOfInterest: js.UndefOr[ConstrainPoint2D] = js.native
  var saturation: js.UndefOr[ConstrainDouble] = js.native
  var sharpness: js.UndefOr[ConstrainDouble] = js.native
  var torch: js.UndefOr[ConstrainBoolean] = js.native
  var whiteBalanceMode: js.UndefOr[ConstrainString] = js.native
  var zoom: js.UndefOr[ConstrainDouble] = js.native
}

object MediaTrackConstraintSet {
  @scala.inline
  def apply(): MediaTrackConstraintSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
  @scala.inline
  implicit class MediaTrackConstraintSetOps[Self <: MediaTrackConstraintSet] (val x: Self) extends AnyVal {
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
    def setBrightness(value: ConstrainDouble): Self = this.set("brightness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrightness: Self = this.set("brightness", js.undefined)
    @scala.inline
    def setColorTemperature(value: ConstrainDouble): Self = this.set("colorTemperature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorTemperature: Self = this.set("colorTemperature", js.undefined)
    @scala.inline
    def setContrast(value: ConstrainDouble): Self = this.set("contrast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContrast: Self = this.set("contrast", js.undefined)
    @scala.inline
    def setExposureCompensation(value: ConstrainDouble): Self = this.set("exposureCompensation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposureCompensation: Self = this.set("exposureCompensation", js.undefined)
    @scala.inline
    def setExposureModeVarargs(value: String*): Self = this.set("exposureMode", js.Array(value :_*))
    @scala.inline
    def setExposureMode(value: ConstrainString): Self = this.set("exposureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposureMode: Self = this.set("exposureMode", js.undefined)
    @scala.inline
    def setFocusDistance(value: ConstrainDouble): Self = this.set("focusDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusDistance: Self = this.set("focusDistance", js.undefined)
    @scala.inline
    def setFocusModeVarargs(value: String*): Self = this.set("focusMode", js.Array(value :_*))
    @scala.inline
    def setFocusMode(value: ConstrainString): Self = this.set("focusMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusMode: Self = this.set("focusMode", js.undefined)
    @scala.inline
    def setIso(value: ConstrainDouble): Self = this.set("iso", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIso: Self = this.set("iso", js.undefined)
    @scala.inline
    def setPointsOfInterestVarargs(value: Point2D*): Self = this.set("pointsOfInterest", js.Array(value :_*))
    @scala.inline
    def setPointsOfInterest(value: ConstrainPoint2D): Self = this.set("pointsOfInterest", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointsOfInterest: Self = this.set("pointsOfInterest", js.undefined)
    @scala.inline
    def setSaturation(value: ConstrainDouble): Self = this.set("saturation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaturation: Self = this.set("saturation", js.undefined)
    @scala.inline
    def setSharpness(value: ConstrainDouble): Self = this.set("sharpness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharpness: Self = this.set("sharpness", js.undefined)
    @scala.inline
    def setTorch(value: ConstrainBoolean): Self = this.set("torch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTorch: Self = this.set("torch", js.undefined)
    @scala.inline
    def setWhiteBalanceModeVarargs(value: String*): Self = this.set("whiteBalanceMode", js.Array(value :_*))
    @scala.inline
    def setWhiteBalanceMode(value: ConstrainString): Self = this.set("whiteBalanceMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhiteBalanceMode: Self = this.set("whiteBalanceMode", js.undefined)
    @scala.inline
    def setZoom(value: ConstrainDouble): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

