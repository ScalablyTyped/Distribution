package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsBroadcastType extends StObject
/** Values that describe the type of a broadcast (emergency alert) message. */
@JSGlobal("Windows.Devices.Sms.SmsBroadcastType")
@js.native
object SmsBroadcastType extends StObject {
  
  /** A CMAS Amber alert message. */
  @js.native
  sealed trait cmasAmber
    extends StObject
       with SmsBroadcastType
  
  /** A CMAS Extreme alert message. */
  @js.native
  sealed trait cmasExtreme
    extends StObject
       with SmsBroadcastType
  
  /** A Commercial Mobile Alert System (CMAS) Presidential alert message. */
  @js.native
  sealed trait cmasPresidential
    extends StObject
       with SmsBroadcastType
  
  /** A CMAS Severe alert message. */
  @js.native
  sealed trait cmasSevere
    extends StObject
       with SmsBroadcastType
  
  /** A CMAS Test message. */
  @js.native
  sealed trait cmasTest
    extends StObject
       with SmsBroadcastType
  
  /** An Earthquake and Tsunami Warning System (ETWS) earthquake alert message. */
  @js.native
  sealed trait etwsEarthquake
    extends StObject
       with SmsBroadcastType
  
  /** An ETWS tsunami alert message. */
  @js.native
  sealed trait etwsTsunami
    extends StObject
       with SmsBroadcastType
  
  /** An ETWS tsunami and earthquake alert message. */
  @js.native
  sealed trait etwsTsunamiAndEarthquake
    extends StObject
       with SmsBroadcastType
  
  /** An EU Alert 1 message. */
  @js.native
  sealed trait euAlert1
    extends StObject
       with SmsBroadcastType
  
  /** An EU Alert 2 message. */
  @js.native
  sealed trait euAlert2
    extends StObject
       with SmsBroadcastType
  
  /** An EU Alert 3 message. */
  @js.native
  sealed trait euAlert3
    extends StObject
       with SmsBroadcastType
  
  /** An EU Amber Alert message. */
  @js.native
  sealed trait euAlertAmber
    extends StObject
       with SmsBroadcastType
  
  /** An EU informational message. */
  @js.native
  sealed trait euAlertInfo
    extends StObject
       with SmsBroadcastType
  
  /** A local LAT alert broadcast message. */
  @js.native
  sealed trait latAlertLocal
    extends StObject
       with SmsBroadcastType
  
  /** An unknown broadcast type. */
  @js.native
  sealed trait other
    extends StObject
       with SmsBroadcastType
}
