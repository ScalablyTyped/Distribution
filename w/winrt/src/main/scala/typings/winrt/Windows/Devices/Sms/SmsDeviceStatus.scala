package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsDeviceStatus extends StObject
@JSGlobal("Windows.Devices.Sms.SmsDeviceStatus")
@js.native
object SmsDeviceStatus extends StObject {
  
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
}
