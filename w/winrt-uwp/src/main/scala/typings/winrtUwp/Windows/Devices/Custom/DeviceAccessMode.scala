package typings.winrtUwp.Windows.Devices.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceAccessMode extends js.Object

/** The device access mode. */
@JSGlobal("Windows.Devices.Custom.DeviceAccessMode")
@js.native
object DeviceAccessMode extends js.Object {
  /** Read access. */
  @js.native
  sealed trait read extends DeviceAccessMode
  
  /** Read/write access. */
  @js.native
  sealed trait readWrite extends DeviceAccessMode
  
  /** Write access. */
  @js.native
  sealed trait write extends DeviceAccessMode
  
}

