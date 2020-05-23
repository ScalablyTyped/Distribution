package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the PIN manager for a given mobile broadband modem and SIM Card. */
trait MobileBroadbandPinManager extends js.Object {
  /** Gets a list of the supported PIN types for the mobile broadband modem and SIM Card. */
  var supportedPins: IVectorView[MobileBroadbandPinType]
  /**
    * Gets the mobile broadband PIN of a specific PIN type.
    * @param pinType The mobile broadband PIN type.
    * @return The mobile broadband PIN returned. This value is either provided by the end user or from a cache if allowed. .
    */
  def getPin(pinType: MobileBroadbandPinType): MobileBroadbandPin
}

object MobileBroadbandPinManager {
  @scala.inline
  def apply(
    getPin: MobileBroadbandPinType => MobileBroadbandPin,
    supportedPins: IVectorView[MobileBroadbandPinType]
  ): MobileBroadbandPinManager = {
    val __obj = js.Dynamic.literal(getPin = js.Any.fromFunction1(getPin), supportedPins = supportedPins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinManager]
  }
}

