package typings.winrtDashUwp.WindowsNs.NetworkingNs.NetworkOperatorsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the PIN manager for a given mobile broadband modem and SIM Card. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinManager")
@js.native
abstract class MobileBroadbandPinManager () extends js.Object {
  /** Gets a list of the supported PIN types for the mobile broadband modem and SIM Card. */
  var supportedPins: IVectorView[MobileBroadbandPinType] = js.native
  /**
    * Gets the mobile broadband PIN of a specific PIN type.
    * @param pinType The mobile broadband PIN type.
    * @return The mobile broadband PIN returned. This value is either provided by the end user or from a cache if allowed. .
    */
  def getPin(pinType: MobileBroadbandPinType): MobileBroadbandPin = js.native
}

