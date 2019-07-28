package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

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
  sealed trait corporatePin extends MobileBroadbandPinType
  
  /** This is a custom vendor-defined PIN type. It is not included in the list. */
  @js.native
  sealed trait custom extends MobileBroadbandPinType
  
  /** This is a PIN that locks the device to the very first inserted SIM card. */
  @js.native
  sealed trait firstSimPin extends MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be personalized to a network. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait networkPin extends MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be personalized to a subset of a network. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait networkSubsetPin extends MobileBroadbandPinType
  
  /** Not used (only for initialization). */
  @js.native
  sealed trait none extends MobileBroadbandPinType
  
  /** For GSM-based devices, this is a Subscriber Identity Module (SIM) PIN. For CDMA-based devices, power-on device lock is reported as PIN1. */
  @js.native
  sealed trait pin1 extends MobileBroadbandPinType
  
  /** This is a SIM PIN2 that protects certain SIM functionality. */
  @js.native
  sealed trait pin2 extends MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be personalized to a service provider. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait serviceProviderPin extends MobileBroadbandPinType
  
  /** This is a PIN that locks the device to a specific SIM card. */
  @js.native
  sealed trait simPin extends MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be restricted to operate on a specific network. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait subsidyLock extends MobileBroadbandPinType
  
  /* 9 */ val corporatePin: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType.corporatePin with Double = js.native
  /* 1 */ val custom: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType.custom with Double = js.native
  /* 5 */ val firstSimPin: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType.firstSimPin with Double = js.native
  /* 6 */ val networkPin: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType.networkPin with Double = js.native
  /* 7 */ val networkSubsetPin: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType.networkSubsetPin with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType.none with Double = js.native
  /* 2 */ val pin1: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType.pin1 with Double = js.native
  /* 3 */ val pin2: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType.pin2 with Double = js.native
  /* 8 */ val serviceProviderPin: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType.serviceProviderPin with Double = js.native
  /* 4 */ val simPin: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType.simPin with Double = js.native
  /* 10 */ val subsidyLock: typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs.MobileBroadbandPinType.subsidyLock with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandPinType with Double] = js.native
}

