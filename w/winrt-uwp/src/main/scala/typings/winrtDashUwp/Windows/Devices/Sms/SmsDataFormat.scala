package typings.winrtDashUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsDataFormat extends js.Object

/** This enumerated type identifies the format of a given protocol description unit (PDU) buffer. */
@JSGlobal("Windows.Devices.Sms.SmsDataFormat")
@js.native
object SmsDataFormat extends js.Object {
  /** The data format is CDMA WMT format of type deliver. */
  @js.native
  sealed trait cdmaDeliver extends SmsDataFormat
  
  /** The data format is CDMA WMT format of type submit. */
  @js.native
  sealed trait cdmaSubmit extends SmsDataFormat
  
  /** The data format is GSM of type deliver. */
  @js.native
  sealed trait gsmDeliver extends SmsDataFormat
  
  /** The data format is GSM of type submit. */
  @js.native
  sealed trait gsmSubmit extends SmsDataFormat
  
  /** The data format is unknown. */
  @js.native
  sealed trait unknown extends SmsDataFormat
  
  /* 3 */ val cdmaDeliver: typings.winrtDashUwp.Windows.Devices.Sms.SmsDataFormat.cdmaDeliver with Double = js.native
  /* 1 */ val cdmaSubmit: typings.winrtDashUwp.Windows.Devices.Sms.SmsDataFormat.cdmaSubmit with Double = js.native
  /* 4 */ val gsmDeliver: typings.winrtDashUwp.Windows.Devices.Sms.SmsDataFormat.gsmDeliver with Double = js.native
  /* 2 */ val gsmSubmit: typings.winrtDashUwp.Windows.Devices.Sms.SmsDataFormat.gsmSubmit with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Devices.Sms.SmsDataFormat.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsDataFormat with Double] = js.native
}

