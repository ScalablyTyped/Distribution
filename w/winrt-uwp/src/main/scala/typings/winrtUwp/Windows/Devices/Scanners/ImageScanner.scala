package typings.winrtUwp.Windows.Devices.Scanners

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.StorageFolder
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the properties of images to scan. */
@js.native
trait ImageScanner extends js.Object {
  /** Gets and sets the scan settings of the auto-configured scan unit, like the file format, including compression to deliver the scanned data in. This property is ignored if the scanner is not capable of auto-configuration. */
  var autoConfiguration: ImageScannerAutoConfiguration = js.native
  /** Gets the default scan source chosen for this scanner device. */
  var defaultScanSource: ImageScannerScanSource = js.native
  /** Gets the PnP device identifier of this scanner device. */
  var deviceId: String = js.native
  /** Gets or sets the scan settings of the Feeder scan unit, like page size, orientation, and scan resolution. */
  var feederConfiguration: ImageScannerFeederConfiguration = js.native
  /** Gets and sets the scan settings of the Flatbed scan unit, like scan resolution and color mode. */
  var flatbedConfiguration: ImageScannerFlatbedConfiguration = js.native
  /**
    * Determines if the specified scan source supports scan preview.
    * @param scanSource The scan source.
    * @return Returns True if the specified scan source supports preview; otherwise False.
    */
  def isPreviewSupported(scanSource: ImageScannerScanSource): Boolean = js.native
  /**
    * Determines if the specified scan source is available on the scanner.
    * @param value The scan source.
    * @return True if the scan source, Flatbed or Feeder, is available; otherwise False.
    */
  def isScanSourceSupported(value: ImageScannerScanSource): Boolean = js.native
  /**
    * Starts a scan job with the specified scan source and writes one or multiple images to one multi-page file like TIFF, XPS, and PDF; or one or multiple single-page files like DIB, PNG, JPG, and TIFF to the specified folder location. Returns the progress of the scan.
    * @param scanSource The image scan source.
    * @param storageFolder The target folder location of the scanned file.
    * @return The list of scanned image files from ImageScannerScanResult and the progress of the WIA scan job from UInt32, which indicates how many files were transferred to the target folder.
    */
  def scanFilesToFolderAsync(scanSource: ImageScannerScanSource, storageFolder: StorageFolder): IPromiseWithIAsyncOperationWithProgress[ImageScannerScanResult, Double] = js.native
  /**
    * Scans one image from the specified scan source and applies the lowest scan resolution with the selected image file format.
    * @param scanSource The image scan source.
    * @param targetStream The scanned image file.
    * @return The progress of the scan and the scanned file format.
    */
  def scanPreviewToStreamAsync(scanSource: ImageScannerScanSource, targetStream: IRandomAccessStream): IPromiseWithIAsyncOperation[ImageScannerPreviewResult] = js.native
}

object ImageScanner {
  @scala.inline
  def apply(
    autoConfiguration: ImageScannerAutoConfiguration,
    defaultScanSource: ImageScannerScanSource,
    deviceId: String,
    feederConfiguration: ImageScannerFeederConfiguration,
    flatbedConfiguration: ImageScannerFlatbedConfiguration,
    isPreviewSupported: ImageScannerScanSource => Boolean,
    isScanSourceSupported: ImageScannerScanSource => Boolean,
    scanFilesToFolderAsync: (ImageScannerScanSource, StorageFolder) => IPromiseWithIAsyncOperationWithProgress[ImageScannerScanResult, Double],
    scanPreviewToStreamAsync: (ImageScannerScanSource, IRandomAccessStream) => IPromiseWithIAsyncOperation[ImageScannerPreviewResult]
  ): ImageScanner = {
    val __obj = js.Dynamic.literal(autoConfiguration = autoConfiguration.asInstanceOf[js.Any], defaultScanSource = defaultScanSource.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], feederConfiguration = feederConfiguration.asInstanceOf[js.Any], flatbedConfiguration = flatbedConfiguration.asInstanceOf[js.Any], isPreviewSupported = js.Any.fromFunction1(isPreviewSupported), isScanSourceSupported = js.Any.fromFunction1(isScanSourceSupported), scanFilesToFolderAsync = js.Any.fromFunction2(scanFilesToFolderAsync), scanPreviewToStreamAsync = js.Any.fromFunction2(scanPreviewToStreamAsync))
    __obj.asInstanceOf[ImageScanner]
  }
  @scala.inline
  implicit class ImageScannerOps[Self <: ImageScanner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoConfiguration(value: ImageScannerAutoConfiguration): Self = this.set("autoConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultScanSource(value: ImageScannerScanSource): Self = this.set("defaultScanSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeederConfiguration(value: ImageScannerFeederConfiguration): Self = this.set("feederConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlatbedConfiguration(value: ImageScannerFlatbedConfiguration): Self = this.set("flatbedConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPreviewSupported(value: ImageScannerScanSource => Boolean): Self = this.set("isPreviewSupported", js.Any.fromFunction1(value))
    @scala.inline
    def setIsScanSourceSupported(value: ImageScannerScanSource => Boolean): Self = this.set("isScanSourceSupported", js.Any.fromFunction1(value))
    @scala.inline
    def setScanFilesToFolderAsync(
      value: (ImageScannerScanSource, StorageFolder) => IPromiseWithIAsyncOperationWithProgress[ImageScannerScanResult, Double]
    ): Self = this.set("scanFilesToFolderAsync", js.Any.fromFunction2(value))
    @scala.inline
    def setScanPreviewToStreamAsync(
      value: (ImageScannerScanSource, IRandomAccessStream) => IPromiseWithIAsyncOperation[ImageScannerPreviewResult]
    ): Self = this.set("scanPreviewToStreamAsync", js.Any.fromFunction2(value))
  }
  
}

