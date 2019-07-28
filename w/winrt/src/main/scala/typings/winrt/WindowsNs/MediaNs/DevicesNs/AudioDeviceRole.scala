package typings.winrt.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioDeviceRole extends js.Object

@JSGlobal("Windows.Media.Devices.AudioDeviceRole")
@js.native
object AudioDeviceRole extends js.Object {
  @js.native
  sealed trait communications extends AudioDeviceRole
  
  @js.native
  sealed trait default extends AudioDeviceRole
  
  /* 1 */ val communications: typings.winrt.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole.communications with Double = js.native
  /* 0 */ val default: typings.winrt.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole.default with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioDeviceRole with Double] = js.native
}

