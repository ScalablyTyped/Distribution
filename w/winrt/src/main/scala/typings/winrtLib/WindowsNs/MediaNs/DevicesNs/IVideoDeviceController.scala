package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVideoDeviceController extends IMediaDeviceController {
  var backlightCompensation: MediaDeviceControl
  var brightness: MediaDeviceControl
  var contrast: MediaDeviceControl
  var exposure: MediaDeviceControl
  var focus: MediaDeviceControl
  var hue: MediaDeviceControl
  var pan: MediaDeviceControl
  var roll: MediaDeviceControl
  var tilt: MediaDeviceControl
  var whiteBalance: MediaDeviceControl
  var zoom: MediaDeviceControl
  def tryGetPowerlineFrequency(): winrtLib.Anon_Succeeded
  def trySetPowerlineFrequency(value: winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency): scala.Boolean
}

