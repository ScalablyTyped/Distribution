package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Devices.Sms.SmsMessageType.binary
import typings.winrt.Windows.Devices.Sms.SmsMessageType.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsMessageType extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsMessageType")
@js.native
object SmsMessageType extends js.Object {
  @js.native
  sealed trait binary extends SmsMessageType
  
  @js.native
  sealed trait text extends SmsMessageType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsMessageType with Double] = js.native
  /* 0 */ @js.native
  object binary extends TopLevel[binary with Double]
  
  /* 1 */ @js.native
  object text extends TopLevel[text with Double]
  
}

