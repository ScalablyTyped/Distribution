package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsBroadcastType with Double] = js.native
  /* 4 */ @js.native
  object cmasAmber extends TopLevel[cmasAmber with Double]
  
  /* 2 */ @js.native
  object cmasExtreme extends TopLevel[cmasExtreme with Double]
  
  /* 1 */ @js.native
  object cmasPresidential extends TopLevel[cmasPresidential with Double]
  
  /* 3 */ @js.native
  object cmasSevere extends TopLevel[cmasSevere with Double]
  
  /* 5 */ @js.native
  object cmasTest extends TopLevel[cmasTest with Double]
  
  /* 11 */ @js.native
  object etwsEarthquake extends TopLevel[etwsEarthquake with Double]
  
  /* 12 */ @js.native
  object etwsTsunami extends TopLevel[etwsTsunami with Double]
  
  /* 13 */ @js.native
  object etwsTsunamiAndEarthquake extends TopLevel[etwsTsunamiAndEarthquake with Double]
  
  /* 6 */ @js.native
  object euAlert1 extends TopLevel[euAlert1 with Double]
  
  /* 7 */ @js.native
  object euAlert2 extends TopLevel[euAlert2 with Double]
  
  /* 8 */ @js.native
  object euAlert3 extends TopLevel[euAlert3 with Double]
  
  /* 9 */ @js.native
  object euAlertAmber extends TopLevel[euAlertAmber with Double]
  
  /* 10 */ @js.native
  object euAlertInfo extends TopLevel[euAlertInfo with Double]
  
  /* 14 */ @js.native
  object latAlertLocal extends TopLevel[latAlertLocal with Double]
  
  /* 0 */ @js.native
  object other extends TopLevel[other with Double]
  
}

