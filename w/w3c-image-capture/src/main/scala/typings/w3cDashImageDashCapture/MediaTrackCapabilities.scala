package typings.w3cDashImageDashCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackCapabilities extends js.Object {
  var brightness: MediaSettingsRange
  var colorTemperature: MediaSettingsRange
  var contrast: MediaSettingsRange
  var exposureCompensation: MediaSettingsRange
  var exposureMode: js.Array[MeteringMode]
  var focusDistance: MediaSettingsRange
  var focusMode: js.Array[MeteringMode]
  var iso: MediaSettingsRange
  var saturation: MediaSettingsRange
  var sharpness: MediaSettingsRange
  var torch: Boolean
  var whiteBalanceMode: js.Array[MeteringMode]
  var zoom: MediaSettingsRange
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
    val __obj = js.Dynamic.literal(brightness = brightness, colorTemperature = colorTemperature, contrast = contrast, exposureCompensation = exposureCompensation, exposureMode = exposureMode, focusDistance = focusDistance, focusMode = focusMode, iso = iso, saturation = saturation, sharpness = sharpness, torch = torch, whiteBalanceMode = whiteBalanceMode, zoom = zoom)
  
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
}

