package typings.winrt.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsDeviceStatus extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsDeviceStatus")
@js.native
object SmsDeviceStatus extends js.Object {
  @js.native
  sealed trait badSim extends SmsDeviceStatus
  
  @js.native
  sealed trait deviceBlocked extends SmsDeviceStatus
  
  @js.native
  sealed trait deviceFailure extends SmsDeviceStatus
  
  @js.native
  sealed trait deviceLocked extends SmsDeviceStatus
  
  @js.native
  sealed trait off extends SmsDeviceStatus
  
  @js.native
  sealed trait ready extends SmsDeviceStatus
  
  @js.native
  sealed trait simNotInserted extends SmsDeviceStatus
  
  @js.native
  sealed trait subscriptionNotActivated extends SmsDeviceStatus
  
  /* 3 */ val badSim: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus.badSim with Double = js.native
  /* 7 */ val deviceBlocked: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus.deviceBlocked with Double = js.native
  /* 4 */ val deviceFailure: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus.deviceFailure with Double = js.native
  /* 6 */ val deviceLocked: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus.deviceLocked with Double = js.native
  /* 0 */ val off: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus.off with Double = js.native
  /* 1 */ val ready: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus.ready with Double = js.native
  /* 2 */ val simNotInserted: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus.simNotInserted with Double = js.native
  /* 5 */ val subscriptionNotActivated: typings.winrt.WindowsNs.DevicesNs.SmsNs.SmsDeviceStatus.subscriptionNotActivated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsDeviceStatus with Double] = js.native
}

