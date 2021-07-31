package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MobileBroadbandPinType extends StObject
/** Describes the possible types for a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinType")
@js.native
object MobileBroadbandPinType extends StObject {
  
  /** This is a PIN that allows the device to be personalized to a specific company. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait corporatePin
    extends StObject
       with MobileBroadbandPinType
  
  /** This is a custom vendor-defined PIN type. It is not included in the list. */
  @js.native
  sealed trait custom
    extends StObject
       with MobileBroadbandPinType
  
  /** This is a PIN that locks the device to the very first inserted SIM card. */
  @js.native
  sealed trait firstSimPin
    extends StObject
       with MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be personalized to a network. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait networkPin
    extends StObject
       with MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be personalized to a subset of a network. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait networkSubsetPin
    extends StObject
       with MobileBroadbandPinType
  
  /** Not used (only for initialization). */
  @js.native
  sealed trait none
    extends StObject
       with MobileBroadbandPinType
  
  /** For GSM-based devices, this is a Subscriber Identity Module (SIM) PIN. For CDMA-based devices, power-on device lock is reported as PIN1. */
  @js.native
  sealed trait pin1
    extends StObject
       with MobileBroadbandPinType
  
  /** This is a SIM PIN2 that protects certain SIM functionality. */
  @js.native
  sealed trait pin2
    extends StObject
       with MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be personalized to a service provider. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait serviceProviderPin
    extends StObject
       with MobileBroadbandPinType
  
  /** This is a PIN that locks the device to a specific SIM card. */
  @js.native
  sealed trait simPin
    extends StObject
       with MobileBroadbandPinType
  
  /** This is a PIN that allows the device to be restricted to operate on a specific network. For more information about this PIN type, see section 22.022 of the 3GPP specification. */
  @js.native
  sealed trait subsidyLock
    extends StObject
       with MobileBroadbandPinType
}
