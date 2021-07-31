package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsMessageType extends StObject
@JSGlobal("Windows.Devices.Sms.SmsMessageType")
@js.native
object SmsMessageType extends StObject {
  
  @js.native
  sealed trait binary
    extends StObject
       with SmsMessageType
  
  @js.native
  sealed trait text
    extends StObject
       with SmsMessageType
}
