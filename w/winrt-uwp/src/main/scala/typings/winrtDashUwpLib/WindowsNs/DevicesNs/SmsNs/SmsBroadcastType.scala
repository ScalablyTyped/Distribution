package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsBroadcastType extends js.Object

/** Values that describe the type of a broadcast (emergency alert) message. */
@JSGlobal("Windows.Devices.Sms.SmsBroadcastType")
@js.native
object SmsBroadcastType extends js.Object {
  /** A CMAS Amber alert message. */
  @js.native
  sealed trait cmasAmber
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** A CMAS Extreme alert message. */
  @js.native
  sealed trait cmasExtreme
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** A Commercial Mobile Alert System (CMAS) Presidential alert message. */
  @js.native
  sealed trait cmasPresidential
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** A CMAS Severe alert message. */
  @js.native
  sealed trait cmasSevere
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** A CMAS Test message. */
  @js.native
  sealed trait cmasTest
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** An Earthquake and Tsunami Warning System (ETWS) earthquake alert message. */
  @js.native
  sealed trait etwsEarthquake
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** An ETWS tsunami alert message. */
  @js.native
  sealed trait etwsTsunami
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** An ETWS tsunami and earthquake alert message. */
  @js.native
  sealed trait etwsTsunamiAndEarthquake
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** An EU Alert 1 message. */
  @js.native
  sealed trait euAlert1
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** An EU Alert 2 message. */
  @js.native
  sealed trait euAlert2
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** An EU Alert 3 message. */
  @js.native
  sealed trait euAlert3
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** An EU Amber Alert message. */
  @js.native
  sealed trait euAlertAmber
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** An EU informational message. */
  @js.native
  sealed trait euAlertInfo
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** A local LAT alert broadcast message. */
  @js.native
  sealed trait latAlertLocal
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /** An unknown broadcast type. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType
  
  /* 4 */ val cmasAmber: cmasAmber with scala.Double = js.native
  /* 2 */ val cmasExtreme: cmasExtreme with scala.Double = js.native
  /* 1 */ val cmasPresidential: cmasPresidential with scala.Double = js.native
  /* 3 */ val cmasSevere: cmasSevere with scala.Double = js.native
  /* 5 */ val cmasTest: cmasTest with scala.Double = js.native
  /* 11 */ val etwsEarthquake: etwsEarthquake with scala.Double = js.native
  /* 12 */ val etwsTsunami: etwsTsunami with scala.Double = js.native
  /* 13 */ val etwsTsunamiAndEarthquake: etwsTsunamiAndEarthquake with scala.Double = js.native
  /* 6 */ val euAlert1: euAlert1 with scala.Double = js.native
  /* 7 */ val euAlert2: euAlert2 with scala.Double = js.native
  /* 8 */ val euAlert3: euAlert3 with scala.Double = js.native
  /* 9 */ val euAlertAmber: euAlertAmber with scala.Double = js.native
  /* 10 */ val euAlertInfo: euAlertInfo with scala.Double = js.native
  /* 14 */ val latAlertLocal: latAlertLocal with scala.Double = js.native
  /* 0 */ val other: other with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType with scala.Double] = js.native
}

