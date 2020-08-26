package typings.w3cImageCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaTrackCapabilities extends js.Object {
  var brightness: MediaSettingsRange = js.native
  var colorTemperature: MediaSettingsRange = js.native
  var contrast: MediaSettingsRange = js.native
  var exposureCompensation: MediaSettingsRange = js.native
  var exposureMode: js.Array[MeteringMode] = js.native
  var focusDistance: MediaSettingsRange = js.native
  var focusMode: js.Array[MeteringMode] = js.native
  var iso: MediaSettingsRange = js.native
  var saturation: MediaSettingsRange = js.native
  var sharpness: MediaSettingsRange = js.native
  var torch: Boolean = js.native
  var whiteBalanceMode: js.Array[MeteringMode] = js.native
  var zoom: MediaSettingsRange = js.native
}

object MediaTrackCapabilities {
  @scala.inline
  def apply(
    brightness: MediaSettingsRange,
    colorTemperature: MediaSettingsRange,
    contrast: MediaSettingsRange,
    exposureCompensation: MediaSettingsRange,
    exposureMode: js.Array[MeteringMode],
    focusDistance: MediaSettingsRange,
    focusMode: js.Array[MeteringMode],
    iso: MediaSettingsRange,
    saturation: MediaSettingsRange,
    sharpness: MediaSettingsRange,
    torch: Boolean,
    whiteBalanceMode: js.Array[MeteringMode],
    zoom: MediaSettingsRange
  ): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], colorTemperature = colorTemperature.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], focusDistance = focusDistance.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sharpness = sharpness.asInstanceOf[js.Any], torch = torch.asInstanceOf[js.Any], whiteBalanceMode = whiteBalanceMode.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
  @scala.inline
  implicit class MediaTrackCapabilitiesOps[Self <: MediaTrackCapabilities] (val x: Self) extends AnyVal {
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
    def setBrightness(value: MediaSettingsRange): Self = this.set("brightness", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorTemperature(value: MediaSettingsRange): Self = this.set("colorTemperature", value.asInstanceOf[js.Any])
    @scala.inline
    def setContrast(value: MediaSettingsRange): Self = this.set("contrast", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposureCompensation(value: MediaSettingsRange): Self = this.set("exposureCompensation", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposureModeVarargs(value: MeteringMode*): Self = this.set("exposureMode", js.Array(value :_*))
    @scala.inline
    def setExposureMode(value: js.Array[MeteringMode]): Self = this.set("exposureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusDistance(value: MediaSettingsRange): Self = this.set("focusDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusModeVarargs(value: MeteringMode*): Self = this.set("focusMode", js.Array(value :_*))
    @scala.inline
    def setFocusMode(value: js.Array[MeteringMode]): Self = this.set("focusMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIso(value: MediaSettingsRange): Self = this.set("iso", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaturation(value: MediaSettingsRange): Self = this.set("saturation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharpness(value: MediaSettingsRange): Self = this.set("sharpness", value.asInstanceOf[js.Any])
    @scala.inline
    def setTorch(value: Boolean): Self = this.set("torch", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiteBalanceModeVarargs(value: MeteringMode*): Self = this.set("whiteBalanceMode", js.Array(value :_*))
    @scala.inline
    def setWhiteBalanceMode(value: js.Array[MeteringMode]): Self = this.set("whiteBalanceMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: MediaSettingsRange): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
  
}

