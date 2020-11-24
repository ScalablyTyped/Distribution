package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsMessageFilter extends js.Object
@JSGlobal("Windows.Devices.Sms.SmsMessageFilter")
@js.native
object SmsMessageFilter extends js.Object {
  
  @js.native
  sealed trait all extends SmsMessageFilter
  
  @js.native
  sealed trait draft extends SmsMessageFilter
  
  @js.native
  sealed trait read extends SmsMessageFilter
  
  @js.native
  sealed trait sent extends SmsMessageFilter
  
  @js.native
  sealed trait unread extends SmsMessageFilter
}
