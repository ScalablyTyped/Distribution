package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs

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
  sealed trait connected
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialDeviceDisplayStatus
  
  /** The device is attempting to connect. */
  @js.native
  sealed trait connecting
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialDeviceDisplayStatus
  
  /** The device is disconnected. */
  @js.native
  sealed trait disconnected
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialDeviceDisplayStatus
  
  /** The device is attempting to disconnect. */
  @js.native
  sealed trait disconnecting
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialDeviceDisplayStatus
  
  /** The device shows an error. */
  @js.native
  sealed trait error
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialDeviceDisplayStatus
  
  /** The device is not connected. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialDeviceDisplayStatus
  
  val connected: connected with java.lang.String = js.native
  val connecting: connecting with java.lang.String = js.native
  val disconnected: disconnected with java.lang.String = js.native
  val disconnecting: disconnecting with java.lang.String = js.native
  val error: error with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DialProtocolNs.DialDeviceDisplayStatus with java.lang.String
  ] = js.native
}

