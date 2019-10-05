package typings.winrtDashUwp.Windows.Devices.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceSharingMode extends js.Object

/** The device sharing mode. */
@JSGlobal("Windows.Devices.Custom.DeviceSharingMode")
@js.native
object DeviceSharingMode extends js.Object {
  /** The device is exclusive. */
  @js.native
  sealed trait exclusive extends DeviceSharingMode
  
  /** The device is shared. */
  @js.native
  sealed trait shared extends DeviceSharingMode
  
  /* 1 */ val exclusive: typings.winrtDashUwp.Windows.Devices.Custom.DeviceSharingMode.exclusive with Double = js.native
  /* 0 */ val shared: typings.winrtDashUwp.Windows.Devices.Custom.DeviceSharingMode.shared with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceSharingMode with Double] = js.native
}

