package typings.winrt.Windows.Devices.Sms

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
  
  /* 3 */ val badSim: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.badSim with Double = js.native
  /* 7 */ val deviceBlocked: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceBlocked with Double = js.native
  /* 4 */ val deviceFailure: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceFailure with Double = js.native
  /* 6 */ val deviceLocked: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceLocked with Double = js.native
  /* 0 */ val off: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.off with Double = js.native
  /* 1 */ val ready: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.ready with Double = js.native
  /* 2 */ val simNotInserted: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.simNotInserted with Double = js.native
  /* 5 */ val subscriptionNotActivated: typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.subscriptionNotActivated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsDeviceStatus with Double] = js.native
}

