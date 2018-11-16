package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom pairing for a DeviceInformation object. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationCustomPairing")
@js.native
abstract class DeviceInformationCustomPairing () extends js.Object {
  /** Raised when a pairing action is requested. */
  @JSName("onpairingrequested")
  var onpairingrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceInformationCustomPairing, DevicePairingRequestedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pairingrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.pairingrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceInformationCustomPairing, DevicePairingRequestedEventArgs]
  ): scala.Unit = js.native
  /** Raised when a pairing action is requested. */
  def onpairingrequested(
    ev: DevicePairingRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[DeviceInformationCustomPairing]
  ): scala.Unit = js.native
  /**
                   * Attempts to pair the device.
                   * @param pairingKindsSupported The different pairing kinds supported by this DeviceInformation object.
                   * @return The result of the pairing action.
                   */
  def pairAsync(pairingKindsSupported: DevicePairingKinds): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
  /**
                   * Attempts to pair a device using a minimum protection level.
                   * @param pairingKindsSupported The different pairing kinds supported by this DeviceInformation object.
                   * @param minProtectionLevel The minimum protection level this DeviceInformation object requires in order to pair.
                   * @return The result of the pairing action.
                   */
  def pairAsync(pairingKindsSupported: DevicePairingKinds, minProtectionLevel: DevicePairingProtectionLevel): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
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
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DevicePairingResult] = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pairingrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.pairingrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[DeviceInformationCustomPairing, DevicePairingRequestedEventArgs]
  ): scala.Unit = js.native
}

