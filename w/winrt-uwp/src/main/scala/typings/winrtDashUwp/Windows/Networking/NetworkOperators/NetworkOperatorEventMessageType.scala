package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkOperatorEventMessageType extends js.Object

/** Describes the type of a network operator notification message. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkOperatorEventMessageType")
@js.native
object NetworkOperatorEventMessageType extends js.Object {
  /** The message type is CDMA. */
  @js.native
  sealed trait cdma extends NetworkOperatorEventMessageType
  
  /** Data plan has been deleted. */
  @js.native
  sealed trait dataPlanDeleted extends NetworkOperatorEventMessageType
  
  /** Data plan has been reset. */
  @js.native
  sealed trait dataPlanReset extends NetworkOperatorEventMessageType
  
  /** Data plan data threshold has been reached. */
  @js.native
  sealed trait dataPlanThresholdReached extends NetworkOperatorEventMessageType
  
  /** The message type is GSM. */
  @js.native
  sealed trait gsm extends NetworkOperatorEventMessageType
  
  /** Profile connected to mobile operator. */
  @js.native
  sealed trait profileConnected extends NetworkOperatorEventMessageType
  
  /** Profile disconnected from mobile operator. */
  @js.native
  sealed trait profileDisconnected extends NetworkOperatorEventMessageType
  
  /** Mobile broadband device registered as home. */
  @js.native
  sealed trait registeredHome extends NetworkOperatorEventMessageType
  
  /** Mobile broadband device registered as roaming. */
  @js.native
  sealed trait registeredRoaming extends NetworkOperatorEventMessageType
  
  /** Mobile broadband device can be used for tethering. */
  @js.native
  sealed trait tetheringEntitlementCheck extends NetworkOperatorEventMessageType
  
  /** Number of clients currently using the tethering network has changed. */
  @js.native
  sealed trait tetheringNumberOfClientsChanged extends NetworkOperatorEventMessageType
  
  /** Operational state of the device's tethering capability has changed. */
  @js.native
  sealed trait tetheringOperationalStateChanged extends NetworkOperatorEventMessageType
  
  /** The message type is USSD. */
  @js.native
  sealed trait ussd extends NetworkOperatorEventMessageType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkOperatorEventMessageType with Double] = js.native
  /* 1 */ @js.native
  object cdma extends TopLevel[cdma with Double]
  
  /* 5 */ @js.native
  object dataPlanDeleted extends TopLevel[dataPlanDeleted with Double]
  
  /* 4 */ @js.native
  object dataPlanReset extends TopLevel[dataPlanReset with Double]
  
  /* 3 */ @js.native
  object dataPlanThresholdReached extends TopLevel[dataPlanThresholdReached with Double]
  
  /* 0 */ @js.native
  object gsm extends TopLevel[gsm with Double]
  
  /* 6 */ @js.native
  object profileConnected extends TopLevel[profileConnected with Double]
  
  /* 7 */ @js.native
  object profileDisconnected extends TopLevel[profileDisconnected with Double]
  
  /* 9 */ @js.native
  object registeredHome extends TopLevel[registeredHome with Double]
  
  /* 8 */ @js.native
  object registeredRoaming extends TopLevel[registeredRoaming with Double]
  
  /* 10 */ @js.native
  object tetheringEntitlementCheck extends TopLevel[tetheringEntitlementCheck with Double]
  
  /* 12 */ @js.native
  object tetheringNumberOfClientsChanged extends TopLevel[tetheringNumberOfClientsChanged with Double]
  
  /* 11 */ @js.native
  object tetheringOperationalStateChanged extends TopLevel[tetheringOperationalStateChanged with Double]
  
  /* 2 */ @js.native
  object ussd extends TopLevel[ussd with Double]
  
}

