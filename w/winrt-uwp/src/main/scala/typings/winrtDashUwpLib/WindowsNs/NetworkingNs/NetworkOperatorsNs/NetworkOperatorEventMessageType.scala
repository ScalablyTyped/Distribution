package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
  sealed trait cdma
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** Data plan has been deleted. */
  @js.native
  sealed trait dataPlanDeleted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** Data plan has been reset. */
  @js.native
  sealed trait dataPlanReset
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** Data plan data threshold has been reached. */
  @js.native
  sealed trait dataPlanThresholdReached
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** The message type is GSM. */
  @js.native
  sealed trait gsm
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** Profile connected to mobile operator. */
  @js.native
  sealed trait profileConnected
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** Profile disconnected from mobile operator. */
  @js.native
  sealed trait profileDisconnected
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** Mobile broadband device registered as home. */
  @js.native
  sealed trait registeredHome
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** Mobile broadband device registered as roaming. */
  @js.native
  sealed trait registeredRoaming
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** Mobile broadband device can be used for tethering. */
  @js.native
  sealed trait tetheringEntitlementCheck
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** Number of clients currently using the tethering network has changed. */
  @js.native
  sealed trait tetheringNumberOfClientsChanged
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** Operational state of the device's tethering capability has changed. */
  @js.native
  sealed trait tetheringOperationalStateChanged
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /** The message type is USSD. */
  @js.native
  sealed trait ussd
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType
  
  /* 1 */ val cdma: cdma with scala.Double = js.native
  /* 5 */ val dataPlanDeleted: dataPlanDeleted with scala.Double = js.native
  /* 4 */ val dataPlanReset: dataPlanReset with scala.Double = js.native
  /* 3 */ val dataPlanThresholdReached: dataPlanThresholdReached with scala.Double = js.native
  /* 0 */ val gsm: gsm with scala.Double = js.native
  /* 6 */ val profileConnected: profileConnected with scala.Double = js.native
  /* 7 */ val profileDisconnected: profileDisconnected with scala.Double = js.native
  /* 9 */ val registeredHome: registeredHome with scala.Double = js.native
  /* 8 */ val registeredRoaming: registeredRoaming with scala.Double = js.native
  /* 10 */ val tetheringEntitlementCheck: tetheringEntitlementCheck with scala.Double = js.native
  /* 12 */ val tetheringNumberOfClientsChanged: tetheringNumberOfClientsChanged with scala.Double = js.native
  /* 11 */ val tetheringOperationalStateChanged: tetheringOperationalStateChanged with scala.Double = js.native
  /* 2 */ val ussd: ussd with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType with scala.Double
  ] = js.native
}

