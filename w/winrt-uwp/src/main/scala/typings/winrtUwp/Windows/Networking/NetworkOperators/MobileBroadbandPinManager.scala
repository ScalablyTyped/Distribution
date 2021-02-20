package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the PIN manager for a given mobile broadband modem and SIM Card. */
@js.native
trait MobileBroadbandPinManager extends StObject {
  
  /**
    * Gets the mobile broadband PIN of a specific PIN type.
    * @param pinType The mobile broadband PIN type.
    * @return The mobile broadband PIN returned. This value is either provided by the end user or from a cache if allowed. .
    */
  def getPin(pinType: MobileBroadbandPinType): MobileBroadbandPin = js.native
  
  /** Gets a list of the supported PIN types for the mobile broadband modem and SIM Card. */
  var supportedPins: IVectorView[MobileBroadbandPinType] = js.native
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
  
  @scala.inline
  implicit class MobileBroadbandPinManagerMutableBuilder[Self <: MobileBroadbandPinManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPin(value: MobileBroadbandPinType => MobileBroadbandPin): Self = StObject.set(x, "getPin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSupportedPins(value: IVectorView[MobileBroadbandPinType]): Self = StObject.set(x, "supportedPins", value.asInstanceOf[js.Any])
  }
}
