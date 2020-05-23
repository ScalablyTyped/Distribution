package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.statusupdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the barcode scanner device. */
@js.native
trait BarcodeScanner extends js.Object {
  /** Gets the capabilities of the specified barcode scanner. */
  var capabilities: BarcodeScannerCapabilities = js.native
  /** Gets the DeviceInformation.Id of the barcode scanner. */
  var deviceId: String = js.native
  /** Occurs when the barcode scanner detects an operation status change. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: TypedEventHandler[BarcodeScanner, BarcodeScannerStatusUpdatedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(
    `type`: statusupdated,
    listener: TypedEventHandler[BarcodeScanner, BarcodeScannerStatusUpdatedEventArgs]
  ): Unit = js.native
  /**
    * Tests the state of the barcode scanner.
    * @param level The specified health check level.
    * @return A text description of the test result. Returns an error if the specified check level is not supported by the device.
    */
  def checkHealthAsync(level: UnifiedPosHealthCheckLevel): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Attempts to get an exclusive access to the barcode scanner.
    * @return When the method completes, it returns a ClaimedBarcodeScanner .
    */
  def claimScannerAsync(): IPromiseWithIAsyncOperation[ClaimedBarcodeScanner] = js.native
  /**
    * Gets the list of profiles supported by the barcode scanner.
    * @return As array of strings representing the supported profiles. Returns an empty list if the scanner does not support profiles.
    */
  def getSupportedProfiles(): IVectorView[String] = js.native
  /**
    * Gets the symbologies supported by the claimed barcode scanner.
    * @return When the method completes successfully, it returns a list of values that represent the symbologies supported by the device.
    */
  def getSupportedSymbologiesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Determines whether the profile is supported.
    * @param profile Barcode scanner profile.
    * @return True if the barcode scanner supports the profile; otherwise false.
    */
  def isProfileSupported(profile: String): Boolean = js.native
  /**
    * Determines whether the specified symbology is supported by the barcode scanner.
    * @param barcodeSymbology The specific barcode symbology.
    * @return True if the device supports the specified symbology; otherwise, false.
    */
  def isSymbologySupportedAsync(barcodeSymbology: Double): IPromiseWithIAsyncOperation[Boolean] = js.native
  /** Occurs when the barcode scanner detects an operation status change. */
  def onstatusupdated(ev: BarcodeScannerStatusUpdatedEventArgs with WinRTEvent[BarcodeScanner]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statusupdated(
    `type`: statusupdated,
    listener: TypedEventHandler[BarcodeScanner, BarcodeScannerStatusUpdatedEventArgs]
  ): Unit = js.native
  /**
    * Retrieves the requested statistics from the barcode scanner.
    * @param statisticsCategories The list of statistics to retrieve.
    * @return IBuffer representing the requested statistics.
    */
  def retrieveStatisticsAsync(statisticsCategories: IIterable[String]): IPromiseWithIAsyncOperation[IBuffer] = js.native
}

