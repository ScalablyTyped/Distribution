package typings.winrtDashUwp.Windows.Media.Devices

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
  sealed trait communications extends AudioDeviceRole
  
  /** The audio device is used in the default role. */
  @js.native
  sealed trait default extends AudioDeviceRole
  
  /* 1 */ val communications: typings.winrtDashUwp.Windows.Media.Devices.AudioDeviceRole.communications with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.Windows.Media.Devices.AudioDeviceRole.default with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioDeviceRole with Double] = js.native
}

