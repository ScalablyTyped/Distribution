package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Devices.MediaDeviceControl")
@js.native
class MediaDeviceControl () extends IMediaDeviceControl {
  /* CompleteClass */
  override var capabilities: MediaDeviceControlCapabilities = js.native
  /* CompleteClass */
  override def tryGetAuto(): winrtLib.Anon_SucceededValueBoolean = js.native
  /* CompleteClass */
  override def tryGetValue(): winrtLib.Anon_SucceededValue = js.native
  /* CompleteClass */
  override def trySetAuto(value: scala.Boolean): scala.Boolean = js.native
  /* CompleteClass */
  override def trySetValue(value: scala.Double): scala.Boolean = js.native
}

