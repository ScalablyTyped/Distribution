package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the PIN manager for a given mobile broadband modem and SIM Card. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinManager")
@js.native
abstract class MobileBroadbandPinManager ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinManager {
  /** Gets a list of the supported PIN types for the mobile broadband modem and SIM Card. */
  /* CompleteClass */
  override var supportedPins: IVectorView[typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType] = js.native
  /**
    * Gets the mobile broadband PIN of a specific PIN type.
    * @param pinType The mobile broadband PIN type.
    * @return The mobile broadband PIN returned. This value is either provided by the end user or from a cache if allowed. .
    */
  /* CompleteClass */
  override def getPin(pinType: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType): typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPin = js.native
}

