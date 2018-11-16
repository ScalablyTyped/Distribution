package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMediaDeviceStatics extends js.Object {
  var ondefaultaudiocapturedevicechanged: js.Any
  var ondefaultaudiorenderdevicechanged: js.Any
  def getAudioCaptureSelector(): java.lang.String
  def getAudioRenderSelector(): java.lang.String
  def getDefaultAudioCaptureId(role: AudioDeviceRole): java.lang.String
  def getDefaultAudioRenderId(role: AudioDeviceRole): java.lang.String
  def getVideoCaptureSelector(): java.lang.String
}

