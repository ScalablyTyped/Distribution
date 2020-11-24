package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PairingRequested event. */
@js.native
trait DevicePairingRequestedEventArgs extends js.Object {
  
  /** Accepts a PairingRequested event and pairs the device with the application. */
  def accept(): Unit = js.native
  /**
    * Accepts a PairingRequested event and pairs the device with the application. Requires a pin for pairing purposes.
    * @param pin The pin to use for attempting to pair a device.
    */
  def accept(pin: String): Unit = js.native
  
  /** Gets the DeviceInformation object associated with this pairing request. */
  var deviceInformation: DeviceInformation = js.native
  
  /**
    * Requests a Deferral to support asynchronous operations.
    * @return The deferral necessary to support asynchronous actions.
    */
  def getDeferral(): Deferral = js.native
  
  /** Gets the kind of pairing associated with this pairing event. */
  var pairingKind: DevicePairingKinds = js.native
  
  /** Gets the pin associated with a pairing request. */
  var pin: String = js.native
}
