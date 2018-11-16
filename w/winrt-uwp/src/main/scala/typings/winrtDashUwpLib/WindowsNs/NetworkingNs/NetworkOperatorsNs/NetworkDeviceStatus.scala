package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkDeviceStatus extends js.Object

/** Describes the readiness of a device to connect to a wireless network. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkDeviceStatus")
@js.native
object NetworkDeviceStatus extends js.Object {
  /** A subscription account for the mobile broadband device is not active. */
  @js.native
  sealed trait accountNotActivated
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  /** The SIM card is not valid. This can occur when PIN Unblock Key attempts have exceeded the limit. */
  @js.native
  sealed trait badSim
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  /** The mobile broadband device is blocked by a PIN or password preventing the device from initializing and registering with a wireless network. */
  @js.native
  sealed trait deviceBlocked
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  /** The mobile broadband device hardware is not responding. */
  @js.native
  sealed trait deviceHardwareFailure
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  /** The mobile broadband device is locked by a PIN or password preventing the device from initializing and registering with a wireless network. */
  @js.native
  sealed trait deviceLocked
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  /** The mobile broadband device is off. */
  @js.native
  sealed trait deviceNotReady
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  /** The device is powered on and ready for mobile broadband operations. */
  @js.native
  sealed trait deviceReady
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  /** The mobile broadband device does not have a SIM card. */
  @js.native
  sealed trait simNotInserted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus
  
  val accountNotActivated: accountNotActivated with java.lang.String = js.native
  val badSim: badSim with java.lang.String = js.native
  val deviceBlocked: deviceBlocked with java.lang.String = js.native
  val deviceHardwareFailure: deviceHardwareFailure with java.lang.String = js.native
  val deviceLocked: deviceLocked with java.lang.String = js.native
  val deviceNotReady: deviceNotReady with java.lang.String = js.native
  val deviceReady: deviceReady with java.lang.String = js.native
  val simNotInserted: simNotInserted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkDeviceStatus with java.lang.String
  ] = js.native
}

