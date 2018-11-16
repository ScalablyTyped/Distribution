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
  
  val cdma: cdma with java.lang.String = js.native
  val dataPlanDeleted: dataPlanDeleted with java.lang.String = js.native
  val dataPlanReset: dataPlanReset with java.lang.String = js.native
  val dataPlanThresholdReached: dataPlanThresholdReached with java.lang.String = js.native
  val gsm: gsm with java.lang.String = js.native
  val profileConnected: profileConnected with java.lang.String = js.native
  val profileDisconnected: profileDisconnected with java.lang.String = js.native
  val registeredHome: registeredHome with java.lang.String = js.native
  val registeredRoaming: registeredRoaming with java.lang.String = js.native
  val tetheringEntitlementCheck: tetheringEntitlementCheck with java.lang.String = js.native
  val tetheringNumberOfClientsChanged: tetheringNumberOfClientsChanged with java.lang.String = js.native
  val tetheringOperationalStateChanged: tetheringOperationalStateChanged with java.lang.String = js.native
  val ussd: ussd with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.NetworkOperatorEventMessageType with java.lang.String
  ] = js.native
}

