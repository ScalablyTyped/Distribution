package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NetworkOperatorEventMessageType extends StObject
/** Describes the type of a network operator notification message. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType")
@js.native
object NetworkOperatorEventMessageType extends StObject {
  
  /** The message type is CDMA. */
  @js.native
  sealed trait cdma
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** Data plan has been deleted. */
  @js.native
  sealed trait dataPlanDeleted
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** Data plan has been reset. */
  @js.native
  sealed trait dataPlanReset
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** Data plan data threshold has been reached. */
  @js.native
  sealed trait dataPlanThresholdReached
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** The message type is GSM. */
  @js.native
  sealed trait gsm
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** Profile connected to mobile operator. */
  @js.native
  sealed trait profileConnected
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** Profile disconnected from mobile operator. */
  @js.native
  sealed trait profileDisconnected
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** Mobile broadband device registered as home. */
  @js.native
  sealed trait registeredHome
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** Mobile broadband device registered as roaming. */
  @js.native
  sealed trait registeredRoaming
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** Mobile broadband device can be used for tethering. */
  @js.native
  sealed trait tetheringEntitlementCheck
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** Number of clients currently using the tethering network has changed. */
  @js.native
  sealed trait tetheringNumberOfClientsChanged
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** Operational state of the device's tethering capability has changed. */
  @js.native
  sealed trait tetheringOperationalStateChanged
    extends StObject
       with NetworkOperatorEventMessageType
  
  /** The message type is USSD. */
  @js.native
  sealed trait ussd
    extends StObject
       with NetworkOperatorEventMessageType
}
