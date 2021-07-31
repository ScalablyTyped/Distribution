package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsMessageFilter extends StObject
@JSGlobal("Windows.Devices.Sms.SmsMessageFilter")
@js.native
object SmsMessageFilter extends StObject {
  
  @js.native
  sealed trait all
    extends StObject
       with SmsMessageFilter
  
  @js.native
  sealed trait draft
    extends StObject
       with SmsMessageFilter
  
  @js.native
  sealed trait read
    extends StObject
       with SmsMessageFilter
  
  @js.native
  sealed trait sent
    extends StObject
       with SmsMessageFilter
  
  @js.native
  sealed trait unread
    extends StObject
       with SmsMessageFilter
}
