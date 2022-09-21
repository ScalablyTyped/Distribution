package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.pairingrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a custom pairing for a DeviceInformation object. */
@js.native
trait DeviceInformationCustomPairing extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pairingrequested(
    `type`: pairingrequested,
    listener: TypedEventHandler[DeviceInformationCustomPairing, DevicePairingRequestedEventArgs]
  ): Unit = js.native
  
  /** Raised when a pairing action is requested. */
  def onpairingrequested(ev: DevicePairingRequestedEventArgs & WinRTEvent[DeviceInformationCustomPairing]): Unit = js.native
  /** Raised when a pairing action is requested. */
  @JSName("onpairingrequested")
  var onpairingrequested_Original: TypedEventHandler[DeviceInformationCustomPairing, DevicePairingRequestedEventArgs] = js.native
  
  /**
    * Attempts to pair the device.
    * @param pairingKindsSupported The different pairing kinds supported by this DeviceInformation object.
    * @return The result of the pairing action.
    */
  def pairAsync(pairingKindsSupported: DevicePairingKinds): IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
  /**
    * Attempts to pair a device using a minimum protection level.
    * @param pairingKindsSupported The different pairing kinds supported by this DeviceInformation object.
    * @param minProtectionLevel The minimum protection level this DeviceInformation object requires in order to pair.
    * @return The result of the pairing action.
    */
  def pairAsync(pairingKindsSupported: DevicePairingKinds, minProtectionLevel: DevicePairingProtectionLevel): IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
  /**
    * Attempts to pair a device using a minimum protection level and custom settings.
    * @param pairingKindsSupported The different pairing kinds supported by this DeviceInformation object.
    * @param minProtectionLevel The minimum protection level this DeviceInformation object requires in order to pair.
    * @param devicePairingSettings The custom device pairing settings.
    * @return The result of the pairing action.
    */
  def pairAsync(
    pairingKindsSupported: DevicePairingKinds,
    minProtectionLevel: DevicePairingProtectionLevel,
    devicePairingSettings: IDevicePairingSettings
  ): IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pairingrequested(
    `type`: pairingrequested,
    listener: TypedEventHandler[DeviceInformationCustomPairing, DevicePairingRequestedEventArgs]
  ): Unit = js.native
}
