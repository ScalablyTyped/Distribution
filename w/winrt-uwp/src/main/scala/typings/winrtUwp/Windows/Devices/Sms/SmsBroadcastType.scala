package typings.winrtUwp.Windows.Devices.Sms

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
  
}

