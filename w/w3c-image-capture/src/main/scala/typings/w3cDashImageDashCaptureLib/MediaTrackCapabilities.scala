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

