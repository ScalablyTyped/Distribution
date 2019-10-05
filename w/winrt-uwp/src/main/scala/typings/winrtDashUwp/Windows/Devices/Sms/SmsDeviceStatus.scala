package typings.winrtDashUwp.Windows.Devices.Sms

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
  sealed trait badSim extends SmsDeviceStatus
  
  /** The device is blocked by a PIN or password that prevents the device from initializing and registering on the nework. */
  @js.native
  sealed trait deviceBlocked extends SmsDeviceStatus
  
  /** General device failure. */
  @js.native
  sealed trait deviceFailure extends SmsDeviceStatus
  
  /** The device is locked by a PIN or password that prevents the device from initializing and registering on the network. */
  @js.native
  sealed trait deviceLocked extends SmsDeviceStatus
  
  /** The device is powered off. */
  @js.native
  sealed trait off extends SmsDeviceStatus
  
  /** The device is powered on and ready to be used. */
  @js.native
  sealed trait ready extends SmsDeviceStatus
  
  /** The SIM card is not inserted into the device. */
  @js.native
  sealed trait simNotInserted extends SmsDeviceStatus
  
  /** The service subscription is not activated. */
  @js.native
  sealed trait subscriptionNotActivated extends SmsDeviceStatus
  
  /* 3 */ val badSim: typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.badSim with Double = js.native
  /* 7 */ val deviceBlocked: typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceBlocked with Double = js.native
  /* 4 */ val deviceFailure: typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceFailure with Double = js.native
  /* 6 */ val deviceLocked: typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceLocked with Double = js.native
  /* 0 */ val off: typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.off with Double = js.native
  /* 1 */ val ready: typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.ready with Double = js.native
  /* 2 */ val simNotInserted: typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.simNotInserted with Double = js.native
  /* 5 */ val subscriptionNotActivated: typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.subscriptionNotActivated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsDeviceStatus with Double] = js.native
}

