package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsReceivedEventDetails
  extends StObject
     with ISmsReceivedEventDetails
object SmsReceivedEventDetails {
  
  inline def apply(deviceId: String, messageIndex: Double): SmsReceivedEventDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], messageIndex = messageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsReceivedEventDetails]
  }
}
