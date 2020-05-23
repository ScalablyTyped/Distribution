package typings.winrtUwp.global.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumerated type identifies the format of a given protocol description unit (PDU) buffer. */
@JSGlobal("Windows.Devices.Sms.SmsDataFormat")
@js.native
object SmsDataFormat extends js.Object {
  /* 3 */ val cdmaDeliver: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat.cdmaDeliver with Double = js.native
  /* 1 */ val cdmaSubmit: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat.cdmaSubmit with Double = js.native
  /* 4 */ val gsmDeliver: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat.gsmDeliver with Double = js.native
  /* 2 */ val gsmSubmit: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat.gsmSubmit with Double = js.native
  /* 0 */ val unknown: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat with Double] = js.native
}

