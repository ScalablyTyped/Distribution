package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType.corporatePin
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType.custom
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType.firstSimPin
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType.networkPin
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType.networkSubsetPin
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType.none
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType.pin1
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType.pin2
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType.serviceProviderPin
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType.simPin
import typings.winrtDashUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType.subsidyLock
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MobileBroadbandPinType with Double] = js.native
  /* 9 */ @js.native
  object corporatePin extends TopLevel[corporatePin with Double]
  
  /* 1 */ @js.native
  object custom extends TopLevel[custom with Double]
  
  /* 5 */ @js.native
  object firstSimPin extends TopLevel[firstSimPin with Double]
  
  /* 6 */ @js.native
  object networkPin extends TopLevel[networkPin with Double]
  
  /* 7 */ @js.native
  object networkSubsetPin extends TopLevel[networkSubsetPin with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object pin1 extends TopLevel[pin1 with Double]
  
  /* 3 */ @js.native
  object pin2 extends TopLevel[pin2 with Double]
  
  /* 8 */ @js.native
  object serviceProviderPin extends TopLevel[serviceProviderPin with Double]
  
  /* 4 */ @js.native
  object simPin extends TopLevel[simPin with Double]
  
  /* 10 */ @js.native
  object subsidyLock extends TopLevel[subsidyLock with Double]
  
}

