package typings
package w3cDashImageDashCaptureLib

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
  var torch: scala.Boolean
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
    torch: scala.Boolean,
    whiteBalanceMode: js.Array[MeteringMode],
    zoom: MediaSettingsRange
  ): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("brightness")(brightness)
    __obj.updateDynamic("colorTemperature")(colorTemperature)
    __obj.updateDynamic("contrast")(contrast)
    __obj.updateDynamic("exposureCompensation")(exposureCompensation)
    __obj.updateDynamic("exposureMode")(exposureMode)
    __obj.updateDynamic("focusDistance")(focusDistance)
    __obj.updateDynamic("focusMode")(focusMode)
    __obj.updateDynamic("iso")(iso)
    __obj.updateDynamic("saturation")(saturation)
    __obj.updateDynamic("sharpness")(sharpness)
    __obj.updateDynamic("torch")(torch)
    __obj.updateDynamic("whiteBalanceMode")(whiteBalanceMode)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
}

