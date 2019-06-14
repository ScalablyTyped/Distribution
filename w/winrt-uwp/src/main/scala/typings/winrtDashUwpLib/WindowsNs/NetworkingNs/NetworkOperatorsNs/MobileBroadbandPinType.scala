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
  
  /* 9 */ val corporatePin: corporatePin with scala.Double = js.native
  /* 1 */ val custom: custom with scala.Double = js.native
  /* 5 */ val firstSimPin: firstSimPin with scala.Double = js.native
  /* 6 */ val networkPin: networkPin with scala.Double = js.native
  /* 7 */ val networkSubsetPin: networkSubsetPin with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val pin1: pin1 with scala.Double = js.native
  /* 3 */ val pin2: pin2 with scala.Double = js.native
  /* 8 */ val serviceProviderPin: serviceProviderPin with scala.Double = js.native
  /* 4 */ val simPin: simPin with scala.Double = js.native
  /* 10 */ val subsidyLock: subsidyLock with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType with scala.Double
  ] = js.native
}

