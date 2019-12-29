package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsMessageFilter with Double] = js.native
  /* 0 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 4 */ @js.native
  object draft extends TopLevel[draft with Double]
  
  /* 2 */ @js.native
  object read extends TopLevel[read with Double]
  
  /* 3 */ @js.native
  object sent extends TopLevel[sent with Double]
  
  /* 1 */ @js.native
  object unread extends TopLevel[unread with Double]
  
}

