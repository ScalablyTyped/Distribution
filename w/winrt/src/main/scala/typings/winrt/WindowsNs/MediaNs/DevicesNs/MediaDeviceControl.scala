package typings.winrt.WindowsNs.MediaNs.DevicesNs

import typings.winrt.Anon_SucceededValue
import typings.winrt.Anon_SucceededValueBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Devices.MediaDeviceControl")
@js.native
class MediaDeviceControl () extends IMediaDeviceControl {
  /* CompleteClass */
  override var capabilities: MediaDeviceControlCapabilities = js.native
  /* CompleteClass */
  override def tryGetAuto(): Anon_SucceededValueBoolean = js.native
  /* CompleteClass */
  override def tryGetValue(): Anon_SucceededValue = js.native
  /* CompleteClass */
  override def trySetAuto(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def trySetValue(value: Double): Boolean = js.native
}

