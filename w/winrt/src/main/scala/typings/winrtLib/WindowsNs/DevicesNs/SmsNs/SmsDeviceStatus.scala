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
  
  /* 3 */ val badSim: badSim with scala.Double = js.native
  /* 7 */ val deviceBlocked: deviceBlocked with scala.Double = js.native
  /* 4 */ val deviceFailure: deviceFailure with scala.Double = js.native
  /* 6 */ val deviceLocked: deviceLocked with scala.Double = js.native
  /* 0 */ val off: off with scala.Double = js.native
  /* 1 */ val ready: ready with scala.Double = js.native
  /* 2 */ val simNotInserted: simNotInserted with scala.Double = js.native
  /* 5 */ val subscriptionNotActivated: subscriptionNotActivated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus with scala.Double] = js.native
}

