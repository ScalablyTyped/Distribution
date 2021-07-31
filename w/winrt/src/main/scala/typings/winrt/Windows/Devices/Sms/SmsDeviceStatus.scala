package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsDeviceStatus extends StObject
@JSGlobal("Windows.Devices.Sms.SmsDeviceStatus")
@js.native
object SmsDeviceStatus extends StObject {
  
  @js.native
  sealed trait badSim
    extends StObject
       with SmsDeviceStatus
  
  @js.native
  sealed trait deviceBlocked
    extends StObject
       with SmsDeviceStatus
  
  @js.native
  sealed trait deviceFailure
    extends StObject
       with SmsDeviceStatus
  
  @js.native
  sealed trait deviceLocked
    extends StObject
       with SmsDeviceStatus
  
  @js.native
  sealed trait off
    extends StObject
       with SmsDeviceStatus
  
  @js.native
  sealed trait ready
    extends StObject
       with SmsDeviceStatus
  
  @js.native
  sealed trait simNotInserted
    extends StObject
       with SmsDeviceStatus
  
  @js.native
  sealed trait subscriptionNotActivated
    extends StObject
       with SmsDeviceStatus
}
