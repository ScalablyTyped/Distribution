package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
  
  /* 1 */ val cdma: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.cdma with Double = js.native
  /* 5 */ val dataPlanDeleted: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.dataPlanDeleted with Double = js.native
  /* 4 */ val dataPlanReset: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.dataPlanReset with Double = js.native
  /* 3 */ val dataPlanThresholdReached: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.dataPlanThresholdReached with Double = js.native
  /* 0 */ val gsm: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.gsm with Double = js.native
  /* 6 */ val profileConnected: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.profileConnected with Double = js.native
  /* 7 */ val profileDisconnected: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.profileDisconnected with Double = js.native
  /* 9 */ val registeredHome: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.registeredHome with Double = js.native
  /* 8 */ val registeredRoaming: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.registeredRoaming with Double = js.native
  /* 10 */ val tetheringEntitlementCheck: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.tetheringEntitlementCheck with Double = js.native
  /* 12 */ val tetheringNumberOfClientsChanged: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.tetheringNumberOfClientsChanged with Double = js.native
  /* 11 */ val tetheringOperationalStateChanged: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.tetheringOperationalStateChanged with Double = js.native
  /* 2 */ val ussd: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType.ussd with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkOperatorEventMessageType with Double] = js.native
}

