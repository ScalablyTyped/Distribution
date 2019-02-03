package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the barcode scanner device. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScanner")
@js.native
abstract class BarcodeScanner () extends js.Object {
  /** Gets the capabilities of the specified barcode scanner. */
  var capabilities: BarcodeScannerCapabilities = js.native
  /** Gets the DeviceInformation.Id of the barcode scanner. */
  var deviceId: java.lang.String = js.native
  /** Occurs when the barcode scanner detects an operation status change. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BarcodeScanner, BarcodeScannerStatusUpdatedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statusupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BarcodeScanner, BarcodeScannerStatusUpdatedEventArgs]
  ): scala.Unit = js.native
  /**
    * Tests the state of the barcode scanner.
    * @param level The specified health check level.
    * @return A text description of the test result. Returns an error if the specified check level is not supported by the device.
    */
  def checkHealthAsync(level: UnifiedPosHealthCheckLevel): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
    * Attempts to get an exclusive access to the barcode scanner.
    * @return When the method completes, it returns a ClaimedBarcodeScanner .
    */
  def claimScannerAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ClaimedBarcodeScanner] = js.native
  /**
    * Gets the list of profiles supported by the barcode scanner.
    * @return As array of strings representing the supported profiles. Returns an empty list if the scanner does not support profiles.
    */
  def getSupportedProfiles(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /**
    * Gets the symbologies supported by the claimed barcode scanner.
    * @return When the method completes successfully, it returns a list of values that represent the symbologies supported by the device.
    */
  def getSupportedSymbologiesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Determines whether the profile is supported.
    * @param profile Barcode scanner profile.
    * @return True if the barcode scanner supports the profile; otherwise false.
    */
  def isProfileSupported(profile: java.lang.String): scala.Boolean = js.native
  /**
    * Determines whether the specified symbology is supported by the barcode scanner.
    * @param barcodeSymbology The specific barcode symbology.
    * @return True if the device supports the specified symbology; otherwise, false.
    */
  def isSymbologySupportedAsync(barcodeSymbology: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /** Occurs when the barcode scanner detects an operation status change. */
  def onstatusupdated(ev: BarcodeScannerStatusUpdatedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[BarcodeScanner]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statusupdated(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statusupdated,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[BarcodeScanner, BarcodeScannerStatusUpdatedEventArgs]
  ): scala.Unit = js.native
  /**
    * Retrieves the requested statistics from the barcode scanner.
    * @param statisticsCategories The list of statistics to retrieve.
    * @return IBuffer representing the requested statistics.
    */
  def retrieveStatisticsAsync(
    statisticsCategories: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
}

/* static members */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScanner")
@js.native
object BarcodeScanner extends js.Object {
  /**
    * Creates BarcodeScanner object from the DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific barcode scanner, which can be retrieved from the DeviceId property.
    * @return The barcode scanner specified by the unique device identifier. Returns a null object in the following cases:
    */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.BarcodeScanner] = js.native
  /**
    * Returns the first available barcode scanner.
    * @return The first available barcode scanner. Returns a null object in the following cases:
    */
  def getDefaultAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.BarcodeScanner] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available barcode scanners.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available barcode scanners.
    */
  def getDeviceSelector(): java.lang.String = js.native
}

