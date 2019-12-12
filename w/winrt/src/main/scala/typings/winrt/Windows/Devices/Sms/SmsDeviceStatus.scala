package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.badSim
import typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceBlocked
import typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceFailure
import typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.deviceLocked
import typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.off
import typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.ready
import typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.simNotInserted
import typings.winrt.Windows.Devices.Sms.SmsDeviceStatus.subscriptionNotActivated
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

