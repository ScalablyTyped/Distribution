package typings.winrtDashUwp.Windows.Media.DialProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DialDeviceDisplayStatus extends js.Object

/** The possible statuses a DIAL device can have in the DIAL device picker. You can use these to adjust the sub-status and other visual attributes for a particular device in the picker. */
@JSGlobal("Windows.Media.DialProtocol.DialDeviceDisplayStatus")
@js.native
object DialDeviceDisplayStatus extends js.Object {
  /** The device is connected. */
  @js.native
  sealed trait connected extends DialDeviceDisplayStatus
  
  /** The device is attempting to connect. */
  @js.native
  sealed trait connecting extends DialDeviceDisplayStatus
  
  /** The device is disconnected. */
  @js.native
  sealed trait disconnected extends DialDeviceDisplayStatus
  
  /** The device is attempting to disconnect. */
  @js.native
  sealed trait disconnecting extends DialDeviceDisplayStatus
  
  /** The device shows an error. */
  @js.native
  sealed trait error extends DialDeviceDisplayStatus
  
  /** The device is not connected. */
  @js.native
  sealed trait none extends DialDeviceDisplayStatus
  
  /* 2 */ val connected: typings.winrtDashUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.connected with Double = js.native
  /* 1 */ val connecting: typings.winrtDashUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.connecting with Double = js.native
  /* 4 */ val disconnected: typings.winrtDashUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.disconnected with Double = js.native
  /* 3 */ val disconnecting: typings.winrtDashUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.disconnecting with Double = js.native
  /* 5 */ val error: typings.winrtDashUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.error with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Media.DialProtocol.DialDeviceDisplayStatus.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DialDeviceDisplayStatus with Double] = js.native
}

