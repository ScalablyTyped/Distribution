package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsDataFormat extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsDataFormat")
@js.native
object SmsDataFormat extends js.Object {
  @js.native
  sealed trait cdmaDeliver extends SmsDataFormat
  
  @js.native
  sealed trait cdmaSubmit extends SmsDataFormat
  
  @js.native
  sealed trait gsmDeliver extends SmsDataFormat
  
  @js.native
  sealed trait gsmSubmit extends SmsDataFormat
  
  @js.native
  sealed trait unknown extends SmsDataFormat
  
  /* 3 */ val cdmaDeliver: typings.winrt.Windows.Devices.Sms.SmsDataFormat.cdmaDeliver with Double = js.native
  /* 1 */ val cdmaSubmit: typings.winrt.Windows.Devices.Sms.SmsDataFormat.cdmaSubmit with Double = js.native
  /* 4 */ val gsmDeliver: typings.winrt.Windows.Devices.Sms.SmsDataFormat.gsmDeliver with Double = js.native
  /* 2 */ val gsmSubmit: typings.winrt.Windows.Devices.Sms.SmsDataFormat.gsmSubmit with Double = js.native
  /* 0 */ val unknown: typings.winrt.Windows.Devices.Sms.SmsDataFormat.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsDataFormat with Double] = js.native
}

