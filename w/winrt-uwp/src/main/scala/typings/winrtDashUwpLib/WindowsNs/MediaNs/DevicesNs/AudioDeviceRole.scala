package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioDeviceRole extends js.Object

/** Indicates the role of an audio device. */
@JSGlobal("Windows.Media.Devices.AudioDeviceRole")
@js.native
object AudioDeviceRole extends js.Object {
  /** The audio device is used for communications. */
  @js.native
  sealed trait communications
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole
  
  /** The audio device is used in the default role. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole
  
  val communications: communications with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.AudioDeviceRole with java.lang.String
  ] = js.native
}

