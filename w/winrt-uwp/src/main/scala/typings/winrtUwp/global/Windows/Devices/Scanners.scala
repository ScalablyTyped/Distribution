package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode
import typings.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode
import typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat
import typings.winrtUwp.Windows.Devices.Scanners.ImageScannerResolution
import typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Graphics.Printing.PrintMediaSize
import typings.winrtUwp.Windows.Graphics.Printing.PrintOrientation
import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.StorageFolder
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the classes, interfaces, structures and other components that are built on top of the Windows Image Acquisition (WIA) COM APIs to provide scan functionality for Windows Store apps and desktop apps. */
@JSGlobal("Windows.Devices.Scanners")
@js.native
object Scanners extends js.Object {
  /** Represents the properties of images to scan. */
  @js.native
  abstract class ImageScanner ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScanner {
    /** Gets and sets the scan settings of the auto-configured scan unit, like the file format, including compression to deliver the scanned data in. This property is ignored if the scanner is not capable of auto-configuration. */
    /* CompleteClass */
    override var autoConfiguration: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoConfiguration = js.native
    /** Gets the default scan source chosen for this scanner device. */
    /* CompleteClass */
    override var defaultScanSource: ImageScannerScanSource = js.native
    /** Gets the PnP device identifier of this scanner device. */
    /* CompleteClass */
    override var deviceId: String = js.native
    /** Gets or sets the scan settings of the Feeder scan unit, like page size, orientation, and scan resolution. */
    /* CompleteClass */
    override var feederConfiguration: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFeederConfiguration = js.native
    /** Gets and sets the scan settings of the Flatbed scan unit, like scan resolution and color mode. */
    /* CompleteClass */
    override var flatbedConfiguration: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFlatbedConfiguration = js.native
    /**
      * Determines if the specified scan source supports scan preview.
      * @param scanSource The scan source.
      * @return Returns True if the specified scan source supports preview; otherwise False.
      */
    /* CompleteClass */
    override def isPreviewSupported(scanSource: ImageScannerScanSource): Boolean = js.native
    /**
      * Determines if the specified scan source is available on the scanner.
      * @param value The scan source.
      * @return True if the scan source, Flatbed or Feeder, is available; otherwise False.
      */
    /* CompleteClass */
    override def isScanSourceSupported(value: ImageScannerScanSource): Boolean = js.native
    /**
      * Starts a scan job with the specified scan source and writes one or multiple images to one multi-page file like TIFF, XPS, and PDF; or one or multiple single-page files like DIB, PNG, JPG, and TIFF to the specified folder location. Returns the progress of the scan.
      * @param scanSource The image scan source.
      * @param storageFolder The target folder location of the scanned file.
      * @return The list of scanned image files from ImageScannerScanResult and the progress of the WIA scan job from UInt32, which indicates how many files were transferred to the target folder.
      */
    /* CompleteClass */
    override def scanFilesToFolderAsync(scanSource: ImageScannerScanSource, storageFolder: StorageFolder): IPromiseWithIAsyncOperationWithProgress[typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanResult, Double] = js.native
    /**
      * Scans one image from the specified scan source and applies the lowest scan resolution with the selected image file format.
      * @param scanSource The image scan source.
      * @param targetStream The scanned image file.
      * @return The progress of the scan and the scanned file format.
      */
    /* CompleteClass */
    override def scanPreviewToStreamAsync(scanSource: ImageScannerScanSource, targetStream: IRandomAccessStream): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Scanners.ImageScannerPreviewResult] = js.native
  }
  
  /** Represents the auto-configured scan source of the scanner. */
  @js.native
  abstract class ImageScannerAutoConfiguration ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoConfiguration {
    /** The default file format for the scan source at the beginning of a new scan session. */
    /* CompleteClass */
    override var defaultFormat: ImageScannerFormat = js.native
    /** Gets or sets the current file transfer format for image data acquisition from the device to the client app. */
    /* CompleteClass */
    override var format: ImageScannerFormat = js.native
    /**
      * Determines if the input scanner supports the specified file format.
      * @param value The file type.
      * @return True if the specified file type is supported; otherwise False.
      */
    /* CompleteClass */
    override def isFormatSupported(value: ImageScannerFormat): Boolean = js.native
  }
  
  /** Represents the Feeder scan source of the scanner. */
  @js.native
  abstract class ImageScannerFeederConfiguration ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFeederConfiguration {
    /** Gets the actual horizontal and vertical scan resolution for the scanner's Feeder, in DPI. */
    /* CompleteClass */
    override var actualResolution: ImageScannerResolution = js.native
    /** Gets or sets the automatic crop mode. */
    /* CompleteClass */
    override var autoCroppingMode: ImageScannerAutoCroppingMode = js.native
    /** Gets or sets the page size automatic detection feature for the scanner's Feeder. */
    /* CompleteClass */
    override var autoDetectPageSize: Boolean = js.native
    /** Gets or sets the current brightness level for capturing image data from the scanner's Feeder. At the beginning of a new scan session, this property is set to the DefaultBrightness property. */
    /* CompleteClass */
    override var brightness: Double = js.native
    /** Gets the step size at which the brightness levels of the data source can be increased or decreased between the minimum and maximum values. */
    /* CompleteClass */
    override var brightnessStep: Double = js.native
    /** Returns True if the device can automatically detect at scan time the size of the document pages scanned through the Feeder; otherwise returns False. */
    /* CompleteClass */
    override var canAutoDetectPageSize: Boolean = js.native
    /** Gets whether the scanner device is capable of scanning ahead from its Feeder. */
    /* CompleteClass */
    override var canScanAhead: Boolean = js.native
    /** Gets whether the scanner's Feeder is capable of duplex scanning (scanning both document page sides, front and back). When scanning in duplex mode the same scan settings (such as color mode and scan resolution) are applied to scan both page sides. */
    /* CompleteClass */
    override var canScanDuplex: Boolean = js.native
    /** Gets or sets the color mode for the scanner's Feeder. */
    /* CompleteClass */
    override var colorMode: ImageScannerColorMode = js.native
    /** Sets or gets the current contrast level for capturing image data from the scanner's Feeder. At the beginning of a new scan session this property is set to the DefaultContrast property. */
    /* CompleteClass */
    override var contrast: Double = js.native
    /** Gets the step size at which the contrast levels of the data source can increase or decrease between the minimum and maximum values. */
    /* CompleteClass */
    override var contrastStep: Double = js.native
    /** Gets the default brightness level for the scanner's Feeder. */
    /* CompleteClass */
    override var defaultBrightness: Double = js.native
    /** Gets the default color mode for the scanner's Feeder. */
    /* CompleteClass */
    override var defaultColorMode: ImageScannerColorMode = js.native
    /** Gets the default contrast level for the scanner's Feeder. */
    /* CompleteClass */
    override var defaultContrast: Double = js.native
    /** Gets the default file format for the scanner's Feeder at the beginning of a new scan session. */
    /* CompleteClass */
    override var defaultFormat: ImageScannerFormat = js.native
    /** Gets or sets the horizontal and vertical scan resolution for the scanner's Feeder that the app requests, in DPI. */
    /* CompleteClass */
    override var desiredResolution: ImageScannerResolution = js.native
    /** Indicates whether the scanner's Feeder can scan both document page sides. */
    /* CompleteClass */
    override var duplex: Boolean = js.native
    /** Gets or sets the current file transfer format for image data acquisition from the scanner's Feeder to the client app. */
    /* CompleteClass */
    override var format: ImageScannerFormat = js.native
    /** Gets the maximum brightness level supported by the scanner's Feeder. */
    /* CompleteClass */
    override var maxBrightness: Double = js.native
    /** Gets the maximum contrast level supported by the scanner's Feeder. */
    /* CompleteClass */
    override var maxContrast: Double = js.native
    /** Gets or sets the maximum number of pages-not images, the app can scan in one scan job, before the scanner stops. */
    /* CompleteClass */
    override var maxNumberOfPages: Double = js.native
    /** Gets the maximum horizontal and vertical scan resolution of the scanner's Feeder in DPI. */
    /* CompleteClass */
    override var maxResolution: ImageScannerResolution = js.native
    /** Gets the maximum scan area dimensions in inches. The maximum scan width is the widest a document can be in order for the scanner's Feeder to scan it. */
    /* CompleteClass */
    override var maxScanArea: Size = js.native
    /** Gets the minimum brightness level supported by the scanner's Feeder. */
    /* CompleteClass */
    override var minBrightness: Double = js.native
    /** Gets the minimum contrast level supported by the scanner's Feeder. */
    /* CompleteClass */
    override var minContrast: Double = js.native
    /** Gets the minimum horizontal and vertical scan resolution of the scanner's Feeder in DPI. */
    /* CompleteClass */
    override var minResolution: ImageScannerResolution = js.native
    /** Gets the minimum scan area in inches. The minimum scan area is the smallest size a document can have in order for a Feeder to scan it. */
    /* CompleteClass */
    override var minScanArea: Size = js.native
    /** Gets the optical horizontal and vertical scan resolution of the scanner's Feeder in DPI. */
    /* CompleteClass */
    override var opticalResolution: ImageScannerResolution = js.native
    /** Gets or sets the currently selected page orientation that tells how to place the documents in the scanner's Feeder input tray. */
    /* CompleteClass */
    override var pageOrientation: PrintOrientation = js.native
    /** Gets or sets the currently selected page size to scan from the Feeder. */
    /* CompleteClass */
    override var pageSize: PrintMediaSize = js.native
    /** Gets the dimensions (width and height) and orientation of the selected page size, in mil units (1/1000"). */
    /* CompleteClass */
    override var pageSizeDimensions: Size = js.native
    /** Indicates whether or not to scan ahead. */
    /* CompleteClass */
    override var scanAhead: Boolean = js.native
    /** Gets or sets the origin coordinates (horizontal and vertical) and dimensions (width and height) of the selected scan area, in inches. This property is ignored when the AutoCroppingMode property is not Disabled. */
    /* CompleteClass */
    override var selectedScanRegion: Rect = js.native
    /**
      * Returns whether the scanner's Feeder supports the specified ImageScannerAutoCroppingMode .
      * @param value The auto crop mode of the image to scan.
      * @return Indicates whether the device supports value mode.
      */
    /* CompleteClass */
    override def isAutoCroppingModeSupported(value: ImageScannerAutoCroppingMode): Boolean = js.native
    /**
      * Returns whether the scanner's Feeder can scan and transfer images in the specified color mode.
      * @param value The color mode.
      * @return Indicates whether the scanner can scan images in value mode.
      */
    /* CompleteClass */
    override def isColorModeSupported(value: ImageScannerColorMode): Boolean = js.native
    /**
      * Determines whether the scanner's Feeder supports the specified file format or not.
      * @param value The file type.
      * @return Indicates whether the specified file type is supported.
      */
    /* CompleteClass */
    override def isFormatSupported(value: ImageScannerFormat): Boolean = js.native
    /**
      * Returns whether the Feeder can scan documents in the specified page size and orientation.
      * @param pageSize The page size.
      * @param pageOrientation The page orientation.
      * @return Indicates the scanner can scan with pageSize and pageOrientation values.
      */
    /* CompleteClass */
    override def isPageSizeSupported(pageSize: PrintMediaSize, pageOrientation: PrintOrientation): Boolean = js.native
  }
  
  /** Represents the Flatbed scan source of the scanner. */
  @js.native
  abstract class ImageScannerFlatbedConfiguration ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFlatbedConfiguration {
    /** Gets the actual horizontal and vertical scan resolution for the Flatbed scanner, in DPI. */
    /* CompleteClass */
    override var actualResolution: ImageScannerResolution = js.native
    /** Gets or sets the automatic crop mode. */
    /* CompleteClass */
    override var autoCroppingMode: ImageScannerAutoCroppingMode = js.native
    /** Gets or sets the current brightness level for capturing image data from the scanner's Flatbed. At the beginning of a new scan session, this property is set to the DefaultBrightness property. */
    /* CompleteClass */
    override var brightness: Double = js.native
    /** Gets the step size at which the brightness levels of the data source can be increased or decreased between the minimum and maximum values. */
    /* CompleteClass */
    override var brightnessStep: Double = js.native
    /** Gets or sets the color mode for the Flatbed scanner. */
    /* CompleteClass */
    override var colorMode: ImageScannerColorMode = js.native
    /** Sets or gets the current contrast level for capturing image data from the scan source. At the beginning of a new scan session this property is set to the DefaultContrast property. */
    /* CompleteClass */
    override var contrast: Double = js.native
    /** Gets the step size at which the contrast levels of the data source can increase or decrease between the minimum and maximum values. */
    /* CompleteClass */
    override var contrastStep: Double = js.native
    /** Gets the default brightness level for the scanner's Flatbed. */
    /* CompleteClass */
    override var defaultBrightness: Double = js.native
    /** Gets the default color mode for the scanner's Flatbed. */
    /* CompleteClass */
    override var defaultColorMode: ImageScannerColorMode = js.native
    /** Gets the default contrast level for the scanner's Flatbed. */
    /* CompleteClass */
    override var defaultContrast: Double = js.native
    /** Gets the default file format for the scanner's Flatbed at the beginning of a new scan session. */
    /* CompleteClass */
    override var defaultFormat: ImageScannerFormat = js.native
    /** Gets or sets the horizontal and vertical scan resolution for the scanner's Flatbed that the app requests, in DPI. */
    /* CompleteClass */
    override var desiredResolution: ImageScannerResolution = js.native
    /** Gets or sets the current file transfer format for image data acquisition from the scanner's Flatbed to the client app. */
    /* CompleteClass */
    override var format: ImageScannerFormat = js.native
    /** Gets the maximum brightness level supported by the scanner's Flatbed. */
    /* CompleteClass */
    override var maxBrightness: Double = js.native
    /** Gets the maximum contrast level supported by the scanner's Flatbed. */
    /* CompleteClass */
    override var maxContrast: Double = js.native
    /** Gets the maximum horizontal and vertical scan resolution of the scanner's Flatbed in DPI. */
    /* CompleteClass */
    override var maxResolution: ImageScannerResolution = js.native
    /** Gets the maximum scan area dimensions in inches. The maximum scan width is the widest a document can be in order for the scanner's Flatbed to scan it. */
    /* CompleteClass */
    override var maxScanArea: Size = js.native
    /** Gets the minimum brightness level supported by the scanner's Flatbed. */
    /* CompleteClass */
    override var minBrightness: Double = js.native
    /** Gets the minimum contrast level supported by the scanner's Flatbed. */
    /* CompleteClass */
    override var minContrast: Double = js.native
    /** Gets the minimum horizontal and vertical scan resolution of the scanner's Flatbed in DPI. */
    /* CompleteClass */
    override var minResolution: ImageScannerResolution = js.native
    /** Gets the minimum scan area in inches. The minimum scan area is the smallest size a document can have in order for a Flatbed to scan it. */
    /* CompleteClass */
    override var minScanArea: Size = js.native
    /** Gets the optical scan resolution of the Flatbed scanner in DPI. */
    /* CompleteClass */
    override var opticalResolution: ImageScannerResolution = js.native
    /** Gets or sets the origin coordinates (horizontal and vertical) and dimensions (width and height) of the selected scan area, in inches. This property is ignored when the AutoCroppingMode property is not Disabled. */
    /* CompleteClass */
    override var selectedScanRegion: Rect = js.native
    /**
      * Returns whether the scanner's Flatbed supports the specified ImageScannerAutoCroppingMode .
      * @param value The auto crop mode of the image to scan.
      * @return Indicates whether the device supports value mode.
      */
    /* CompleteClass */
    override def isAutoCroppingModeSupported(value: ImageScannerAutoCroppingMode): Boolean = js.native
    /**
      * Returns whether the scanner's Flatbed can scan and transfer images in the specified color mode.
      * @param value The color mode.
      * @return Indicates whether the scanner can scan images in value mode.
      */
    /* CompleteClass */
    override def isColorModeSupported(value: ImageScannerColorMode): Boolean = js.native
    /**
      * Determines whether the scanner's Flatbed supports the specified file format or not.
      * @param value The file type.
      * @return Indicates whether the specified file type is supported.
      */
    /* CompleteClass */
    override def isFormatSupported(value: ImageScannerFormat): Boolean = js.native
  }
  
  /** Represents the result of a preview scan job. */
  @js.native
  abstract class ImageScannerPreviewResult ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScannerPreviewResult {
    /** Gets the format of the data for the scan preview. After preview this property is restored to the value before preview. */
    /* CompleteClass */
    override var format: ImageScannerFormat = js.native
    /** Gets whether the scan preview was successful. */
    /* CompleteClass */
    override var succeeded: Boolean = js.native
  }
  
  /** Represents the result of a scan job. */
  @js.native
  abstract class ImageScannerScanResult ()
    extends typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanResult {
    /** Gets the list of scanned image files that was produced by the completed scan job. */
    /* CompleteClass */
    override var scannedFiles: IVectorView[StorageFile] = js.native
  }
  
  /* static members */
  @js.native
  object ImageScanner extends js.Object {
    /**
      * Creates an instance of a ImageScanner object based on a scanners device information ID. This method is required for broker device enumeration.
      * @param deviceId The device information ID. See DeviceInformation.Id property.
      * @return The ImageScanner object.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Scanners.ImageScanner] = js.native
    /**
      * Returns the class selection string that apps can use to enumerate scanner devices. This method is required for the brokered device enumeration.
      * @return The class selection.
      */
    def getDeviceSelector(): String = js.native
  }
  
  /** Specifies the automatic crop mode of the scanning device. */
  @js.native
  object ImageScannerAutoCroppingMode extends js.Object {
    /* 0 */ val disabled: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.disabled with Double = js.native
    /* 2 */ val multipleRegion: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.multipleRegion with Double = js.native
    /* 1 */ val singleRegion: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode.singleRegion with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.Scanners.ImageScannerAutoCroppingMode with Double
      ] = js.native
  }
  
  /** Specifies the color modes for the scan source. */
  @js.native
  object ImageScannerColorMode extends js.Object {
    /* 3 */ val autoColor: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.autoColor with Double = js.native
    /* 0 */ val color: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.color with Double = js.native
    /* 1 */ val grayscale: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.grayscale with Double = js.native
    /* 2 */ val monochrome: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode.monochrome with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Scanners.ImageScannerColorMode with Double] = js.native
  }
  
  /** The type of files to scan to. */
  @js.native
  object ImageScannerFormat extends js.Object {
    /* 2 */ val deviceIndependentBitmap: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.deviceIndependentBitmap with Double = js.native
    /* 0 */ val jpeg: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.jpeg with Double = js.native
    /* 5 */ val openXps: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.openXps with Double = js.native
    /* 6 */ val pdf: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.pdf with Double = js.native
    /* 1 */ val png: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.png with Double = js.native
    /* 3 */ val tiff: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.tiff with Double = js.native
    /* 4 */ val xps: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat.xps with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Scanners.ImageScannerFormat with Double] = js.native
  }
  
  /** The types of scan source for the scanning device. */
  @js.native
  object ImageScannerScanSource extends js.Object {
    /* 3 */ val autoConfigured: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.autoConfigured with Double = js.native
    /* 0 */ val default: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.default with Double = js.native
    /* 2 */ val feeder: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.feeder with Double = js.native
    /* 1 */ val flatbed: typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource.flatbed with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Scanners.ImageScannerScanSource with Double] = js.native
  }
  
}

