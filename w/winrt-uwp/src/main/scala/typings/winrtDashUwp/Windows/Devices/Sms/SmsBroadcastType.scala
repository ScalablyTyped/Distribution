package typings.winrtDashUwp.Windows.Devices.Sms

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
  sealed trait cmasAmber extends SmsBroadcastType
  
  /** A CMAS Extreme alert message. */
  @js.native
  sealed trait cmasExtreme extends SmsBroadcastType
  
  /** A Commercial Mobile Alert System (CMAS) Presidential alert message. */
  @js.native
  sealed trait cmasPresidential extends SmsBroadcastType
  
  /** A CMAS Severe alert message. */
  @js.native
  sealed trait cmasSevere extends SmsBroadcastType
  
  /** A CMAS Test message. */
  @js.native
  sealed trait cmasTest extends SmsBroadcastType
  
  /** An Earthquake and Tsunami Warning System (ETWS) earthquake alert message. */
  @js.native
  sealed trait etwsEarthquake extends SmsBroadcastType
  
  /** An ETWS tsunami alert message. */
  @js.native
  sealed trait etwsTsunami extends SmsBroadcastType
  
  /** An ETWS tsunami and earthquake alert message. */
  @js.native
  sealed trait etwsTsunamiAndEarthquake extends SmsBroadcastType
  
  /** An EU Alert 1 message. */
  @js.native
  sealed trait euAlert1 extends SmsBroadcastType
  
  /** An EU Alert 2 message. */
  @js.native
  sealed trait euAlert2 extends SmsBroadcastType
  
  /** An EU Alert 3 message. */
  @js.native
  sealed trait euAlert3 extends SmsBroadcastType
  
  /** An EU Amber Alert message. */
  @js.native
  sealed trait euAlertAmber extends SmsBroadcastType
  
  /** An EU informational message. */
  @js.native
  sealed trait euAlertInfo extends SmsBroadcastType
  
  /** A local LAT alert broadcast message. */
  @js.native
  sealed trait latAlertLocal extends SmsBroadcastType
  
  /** An unknown broadcast type. */
  @js.native
  sealed trait other extends SmsBroadcastType
  
  /* 4 */ val cmasAmber: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.cmasAmber with Double = js.native
  /* 2 */ val cmasExtreme: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.cmasExtreme with Double = js.native
  /* 1 */ val cmasPresidential: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.cmasPresidential with Double = js.native
  /* 3 */ val cmasSevere: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.cmasSevere with Double = js.native
  /* 5 */ val cmasTest: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.cmasTest with Double = js.native
  /* 11 */ val etwsEarthquake: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.etwsEarthquake with Double = js.native
  /* 12 */ val etwsTsunami: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.etwsTsunami with Double = js.native
  /* 13 */ val etwsTsunamiAndEarthquake: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.etwsTsunamiAndEarthquake with Double = js.native
  /* 6 */ val euAlert1: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.euAlert1 with Double = js.native
  /* 7 */ val euAlert2: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.euAlert2 with Double = js.native
  /* 8 */ val euAlert3: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.euAlert3 with Double = js.native
  /* 9 */ val euAlertAmber: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.euAlertAmber with Double = js.native
  /* 10 */ val euAlertInfo: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.euAlertInfo with Double = js.native
  /* 14 */ val latAlertLocal: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.latAlertLocal with Double = js.native
  /* 0 */ val other: typings.winrtDashUwp.Windows.Devices.Sms.SmsBroadcastType.other with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsBroadcastType with Double] = js.native
}

