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
  
  val cmasAmber: cmasAmber with java.lang.String = js.native
  val cmasExtreme: cmasExtreme with java.lang.String = js.native
  val cmasPresidential: cmasPresidential with java.lang.String = js.native
  val cmasSevere: cmasSevere with java.lang.String = js.native
  val cmasTest: cmasTest with java.lang.String = js.native
  val etwsEarthquake: etwsEarthquake with java.lang.String = js.native
  val etwsTsunami: etwsTsunami with java.lang.String = js.native
  val etwsTsunamiAndEarthquake: etwsTsunamiAndEarthquake with java.lang.String = js.native
  val euAlert1: euAlert1 with java.lang.String = js.native
  val euAlert2: euAlert2 with java.lang.String = js.native
  val euAlert3: euAlert3 with java.lang.String = js.native
  val euAlertAmber: euAlertAmber with java.lang.String = js.native
  val euAlertInfo: euAlertInfo with java.lang.String = js.native
  val latAlertLocal: latAlertLocal with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsBroadcastType with java.lang.String] = js.native
}

