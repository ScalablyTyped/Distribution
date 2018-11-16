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
  
  val communications: communications with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole with java.lang.String] = js.native
}

