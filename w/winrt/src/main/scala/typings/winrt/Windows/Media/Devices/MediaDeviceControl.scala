package typings.winrt.Windows.Media.Devices

import typings.winrt.AnonSucceededValue
import typings.winrt.AnonSucceededValueBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Media.Devices.MediaDeviceControl")
@js.native
class MediaDeviceControl () extends IMediaDeviceControl {
  /* CompleteClass */
  override var capabilities: MediaDeviceControlCapabilities = js.native
  /* CompleteClass */
  override def tryGetAuto(): AnonSucceededValueBoolean = js.native
  /* CompleteClass */
  override def tryGetValue(): AnonSucceededValue = js.native
  /* CompleteClass */
  override def trySetAuto(value: Boolean): Boolean = js.native
  /* CompleteClass */
  override def trySetValue(value: Double): Boolean = js.native
}

