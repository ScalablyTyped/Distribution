package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsDeviceStatus extends js.Object

/** Contains values that indicate the readiness of an SMS device to engage in cellular network traffic operations. */
@JSGlobal("Windows.Devices.Sms.SmsDeviceStatus")
@js.native
object SmsDeviceStatus extends js.Object {
  /** The SIM is invalid; PIN unblock key retrials have exceeded the limit. */
  @js.native
  sealed trait badSim
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  /** The device is blocked by a PIN or password that prevents the device from initializing and registering on the nework. */
  @js.native
  sealed trait deviceBlocked
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  /** General device failure. */
  @js.native
  sealed trait deviceFailure
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  /** The device is locked by a PIN or password that prevents the device from initializing and registering on the network. */
  @js.native
  sealed trait deviceLocked
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  /** The device is powered off. */
  @js.native
  sealed trait off
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  /** The device is powered on and ready to be used. */
  @js.native
  sealed trait ready
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  /** The SIM card is not inserted into the device. */
  @js.native
  sealed trait simNotInserted
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  /** The service subscription is not activated. */
  @js.native
  sealed trait subscriptionNotActivated
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  val badSim: badSim with java.lang.String = js.native
  val deviceBlocked: deviceBlocked with java.lang.String = js.native
  val deviceFailure: deviceFailure with java.lang.String = js.native
  val deviceLocked: deviceLocked with java.lang.String = js.native
  val off: off with java.lang.String = js.native
  val ready: ready with java.lang.String = js.native
  val simNotInserted: simNotInserted with java.lang.String = js.native
  val subscriptionNotActivated: subscriptionNotActivated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus with java.lang.String] = js.native
}

