package typings.winrtDashUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.badSim
import typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceBlocked
import typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceFailure
import typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.deviceLocked
import typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.off
import typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.ready
import typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.simNotInserted
import typings.winrtDashUwp.Windows.Devices.Sms.SmsDeviceStatus.subscriptionNotActivated
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsDeviceStatus with Double] = js.native
  /* 3 */ @js.native
  object badSim extends TopLevel[badSim with Double]
  
  /* 7 */ @js.native
  object deviceBlocked extends TopLevel[deviceBlocked with Double]
  
  /* 4 */ @js.native
  object deviceFailure extends TopLevel[deviceFailure with Double]
  
  /* 6 */ @js.native
  object deviceLocked extends TopLevel[deviceLocked with Double]
  
  /* 0 */ @js.native
  object off extends TopLevel[off with Double]
  
  /* 1 */ @js.native
  object ready extends TopLevel[ready with Double]
  
  /* 2 */ @js.native
  object simNotInserted extends TopLevel[simNotInserted with Double]
  
  /* 5 */ @js.native
  object subscriptionNotActivated extends TopLevel[subscriptionNotActivated with Double]
  
}

