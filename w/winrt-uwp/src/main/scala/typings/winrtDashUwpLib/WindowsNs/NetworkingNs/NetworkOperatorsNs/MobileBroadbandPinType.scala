package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MobileBroadbandPinType extends js.Object

/** Describes the possible types for a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinType")
@js.native
object MobileBroadbandPinType extends js.Object {
  /** This is a PIN that allows the device to be personalized to a specific company. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait corporatePin
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType
  
  /** This is a custom vendor-defined PIN type. It is not included in the list. */
  @js.native
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType
  
  /** This is a PIN that locks the device to the very first inserted SIM card. */
  @js.native
  sealed trait firstSimPin
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be personalized to a network. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait networkPin
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be personalized to a subset of a network. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait networkSubsetPin
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType
  
  /** Not used (only for initialization). */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType
  
  /** For GSM-based devices, this is a Subscriber Identity Module (SIM) PIN. For CDMA-based devices, power-on device lock is reported as PIN1. */
  @js.native
  sealed trait pin1
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType
  
  /** This is a SIM PIN2 that protects certain SIM functionality. */
  @js.native
  sealed trait pin2
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be personalized to a service provider. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait serviceProviderPin
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType
  
  /** This is a PIN that locks the device to a specific SIM card. */
  @js.native
  sealed trait simPin
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be restricted to operate on a specific network. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait subsidyLock
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType
  
  val corporatePin: corporatePin with java.lang.String = js.native
  val custom: custom with java.lang.String = js.native
  val firstSimPin: firstSimPin with java.lang.String = js.native
  val networkPin: networkPin with java.lang.String = js.native
  val networkSubsetPin: networkSubsetPin with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val pin1: pin1 with java.lang.String = js.native
  val pin2: pin2 with java.lang.String = js.native
  val serviceProviderPin: serviceProviderPin with java.lang.String = js.native
  val simPin: simPin with java.lang.String = js.native
  val subsidyLock: subsidyLock with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType with java.lang.String
  ] = js.native
}

