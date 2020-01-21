package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information and enables pairing for a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationPairing")
@js.native
abstract class DeviceInformationPairing () extends js.Object {
  /** Gets a value that indicates whether the device can be paired. */
  var canPair: Boolean = js.native
  /** Gets the DeviceInformationCustomPairing object necessary for custom pairing. */
  var custom: DeviceInformationCustomPairing = js.native
  /** Gets a value that indicates whether the device is currently paired. */
  var isPaired: Boolean = js.native
  /** Gets the level of protection used to pair the device. */
  var protectionLevel: DevicePairingProtectionLevel = js.native
  /**
    * Attempts to pair the device.
    * @return The result of the pairing action.
    */
  def pairAsync(): IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
  /**
    * Attempts to pair the device using a provided level of protection.
    * @param minProtectionLevel The required level of protection to use for the pairing action.
    * @return The result of the pairing action.
    */
  def pairAsync(minProtectionLevel: DevicePairingProtectionLevel): IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
  /**
    * Attempts to pair a device object with a specified protection level and custom settings.
    * @param minProtectionLevel The required level of protection to use for the pairing action.
    * @param devicePairingSettings The custom device pairing settings.
    * @return The result of the pairing action.
    */
  def pairAsync(minProtectionLevel: DevicePairingProtectionLevel, devicePairingSettings: IDevicePairingSettings): IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
  /**
    * Attempts to unpair the device.
    * @return The result of the unpairing action.
    */
  def unpairAsync(): IPromiseWithIAsyncOperation[DeviceUnpairingResult] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationPairing")
@js.native
object DeviceInformationPairing extends js.Object {
  /**
    * Attempts to pair for all inbound pairing requests
    * @param pairingKindsSupported The pairing kinds this device supports.
    * @return Whether or not the attempt was successful.
    */
  def tryRegisterForAllInboundPairingRequests(pairingKindsSupported: DevicePairingKinds): Boolean = js.native
}

