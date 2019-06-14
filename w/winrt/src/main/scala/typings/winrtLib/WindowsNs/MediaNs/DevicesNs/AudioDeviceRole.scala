package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioDeviceRole extends js.Object

@JSGlobal("Windows.Media.Devices.AudioDeviceRole")
@js.native
object AudioDeviceRole extends js.Object {
  @js.native
  sealed trait communications
    extends winrtLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole
  
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole
  
  /* 1 */ val communications: communications with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole with scala.Double] = js.native
}

