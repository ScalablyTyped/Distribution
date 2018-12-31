package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the properties of images to scan. */
@JSGlobal("Windows.Devices.Scanners.ImageScanner")
@js.native
abstract class ImageScanner () extends js.Object {
  /** Gets and sets the scan settings of the auto-configured scan unit, like the file format, including compression to deliver the scanned data in. This property is ignored if the scanner is not capable of auto-configuration. */
  var autoConfiguration: ImageScannerAutoConfiguration = js.native
  /** Gets the default scan source chosen for this scanner device. */
  var defaultScanSource: ImageScannerScanSource = js.native
  /** Gets the PnP device identifier of this scanner device. */
  var deviceId: java.lang.String = js.native
  /** Gets or sets the scan settings of the Feeder scan unit, like page size, orientation, and scan resolution. */
  var feederConfiguration: ImageScannerFeederConfiguration = js.native
  /** Gets and sets the scan settings of the Flatbed scan unit, like scan resolution and color mode. */
  var flatbedConfiguration: ImageScannerFlatbedConfiguration = js.native
  /**
    * Determines if the specified scan source supports scan preview.
    * @param scanSource The scan source.
    * @return Returns True if the specified scan source supports preview; otherwise False.
    */
  def isPreviewSupported(scanSource: ImageScannerScanSource): scala.Boolean = js.native
  /**
    * Determines if the specified scan source is available on the scanner.
    * @param value The scan source.
    * @return True if the scan source, Flatbed or Feeder, is available; otherwise False.
    */
  def isScanSourceSupported(value: ImageScannerScanSource): scala.Boolean = js.native
  /**
    * Starts a scan job with the specified scan source and writes one or multiple images to one multi-page file like TIFF, XPS, and PDF; or one or multiple single-page files like DIB, PNG, JPG, and TIFF to the specified folder location. Returns the progress of the scan.
    * @param scanSource The image scan source.
    * @param storageFolder The target folder location of the scanned file.
    * @return The list of scanned image files from ImageScannerScanResult and the progress of the WIA scan job from UInt32, which indicates how many files were transferred to the target folder.
    */
  def scanFilesToFolderAsync(
    scanSource: ImageScannerScanSource,
    storageFolder: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[ImageScannerScanResult, scala.Double] = js.native
  /**
    * Scans one image from the specified scan source and applies the lowest scan resolution with the selected image file format.
    * @param scanSource The image scan source.
    * @param targetStream The scanned image file.
    * @return The progress of the scan and the scanned file format.
    */
  def scanPreviewToStreamAsync(
    scanSource: ImageScannerScanSource,
    targetStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ImageScannerPreviewResult] = js.native
}

/** Represents the properties of images to scan. */
@JSGlobal("Windows.Devices.Scanners.ImageScanner")
@js.native
object ImageScanner extends js.Object {
  /**
    * Creates an instance of a ImageScanner object based on a scanners device information ID. This method is required for broker device enumeration.
    * @param deviceId The device information ID. See DeviceInformation.Id property.
    * @return The ImageScanner object.
    */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs.ImageScanner] = js.native
  /**
    * Returns the class selection string that apps can use to enumerate scanner devices. This method is required for the brokered device enumeration.
    * @return The class selection.
    */
  def getDeviceSelector(): java.lang.String = js.native
}

