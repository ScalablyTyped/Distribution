package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsDeviceStatus extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsDeviceStatus")
@js.native
object SmsDeviceStatus extends js.Object {
  @js.native
  sealed trait badSim
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  @js.native
  sealed trait deviceBlocked
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  @js.native
  sealed trait deviceFailure
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  @js.native
  sealed trait deviceLocked
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  @js.native
  sealed trait off
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  @js.native
  sealed trait ready
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  @js.native
  sealed trait simNotInserted
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  @js.native
  sealed trait subscriptionNotActivated
    extends winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus
  
  val badSim: badSim with java.lang.String = js.native
  val deviceBlocked: deviceBlocked with java.lang.String = js.native
  val deviceFailure: deviceFailure with java.lang.String = js.native
  val deviceLocked: deviceLocked with java.lang.String = js.native
  val off: off with java.lang.String = js.native
  val ready: ready with java.lang.String = js.native
  val simNotInserted: simNotInserted with java.lang.String = js.native
  val subscriptionNotActivated: subscriptionNotActivated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus with java.lang.String] = js.native
}

