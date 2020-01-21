package typings.winrtUwp.Windows.Devices.Scanners

import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Graphics.Printing.PrintMediaSize
import typings.winrtUwp.Windows.Graphics.Printing.PrintOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the Feeder scan source of the scanner. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerFeederConfiguration")
@js.native
abstract class ImageScannerFeederConfiguration () extends js.Object {
  /** Gets the actual horizontal and vertical scan resolution for the scanner's Feeder, in DPI. */
  var actualResolution: ImageScannerResolution = js.native
  /** Gets or sets the automatic crop mode. */
  var autoCroppingMode: ImageScannerAutoCroppingMode = js.native
  /** Gets or sets the page size automatic detection feature for the scanner's Feeder. */
  var autoDetectPageSize: Boolean = js.native
  /** Gets or sets the current brightness level for capturing image data from the scanner's Feeder. At the beginning of a new scan session, this property is set to the DefaultBrightness property. */
  var brightness: Double = js.native
  /** Gets the step size at which the brightness levels of the data source can be increased or decreased between the minimum and maximum values. */
  var brightnessStep: Double = js.native
  /** Returns True if the device can automatically detect at scan time the size of the document pages scanned through the Feeder; otherwise returns False. */
  var canAutoDetectPageSize: Boolean = js.native
  /** Gets whether the scanner device is capable of scanning ahead from its Feeder. */
  var canScanAhead: Boolean = js.native
  /** Gets whether the scanner's Feeder is capable of duplex scanning (scanning both document page sides, front and back). When scanning in duplex mode the same scan settings (such as color mode and scan resolution) are applied to scan both page sides. */
  var canScanDuplex: Boolean = js.native
  /** Gets or sets the color mode for the scanner's Feeder. */
  var colorMode: ImageScannerColorMode = js.native
  /** Sets or gets the current contrast level for capturing image data from the scanner's Feeder. At the beginning of a new scan session this property is set to the DefaultContrast property. */
  var contrast: Double = js.native
  /** Gets the step size at which the contrast levels of the data source can increase or decrease between the minimum and maximum values. */
  var contrastStep: Double = js.native
  /** Gets the default brightness level for the scanner's Feeder. */
  var defaultBrightness: Double = js.native
  /** Gets the default color mode for the scanner's Feeder. */
  var defaultColorMode: ImageScannerColorMode = js.native
  /** Gets the default contrast level for the scanner's Feeder. */
  var defaultContrast: Double = js.native
  /** Gets the default file format for the scanner's Feeder at the beginning of a new scan session. */
  var defaultFormat: ImageScannerFormat = js.native
  /** Gets or sets the horizontal and vertical scan resolution for the scanner's Feeder that the app requests, in DPI. */
  var desiredResolution: ImageScannerResolution = js.native
  /** Indicates whether the scanner's Feeder can scan both document page sides. */
  var duplex: Boolean = js.native
  /** Gets or sets the current file transfer format for image data acquisition from the scanner's Feeder to the client app. */
  var format: ImageScannerFormat = js.native
  /** Gets the maximum brightness level supported by the scanner's Feeder. */
  var maxBrightness: Double = js.native
  /** Gets the maximum contrast level supported by the scanner's Feeder. */
  var maxContrast: Double = js.native
  /** Gets or sets the maximum number of pages-not images, the app can scan in one scan job, before the scanner stops. */
  var maxNumberOfPages: Double = js.native
  /** Gets the maximum horizontal and vertical scan resolution of the scanner's Feeder in DPI. */
  var maxResolution: ImageScannerResolution = js.native
  /** Gets the maximum scan area dimensions in inches. The maximum scan width is the widest a document can be in order for the scanner's Feeder to scan it. */
  var maxScanArea: Size = js.native
  /** Gets the minimum brightness level supported by the scanner's Feeder. */
  var minBrightness: Double = js.native
  /** Gets the minimum contrast level supported by the scanner's Feeder. */
  var minContrast: Double = js.native
  /** Gets the minimum horizontal and vertical scan resolution of the scanner's Feeder in DPI. */
  var minResolution: ImageScannerResolution = js.native
  /** Gets the minimum scan area in inches. The minimum scan area is the smallest size a document can have in order for a Feeder to scan it. */
  var minScanArea: Size = js.native
  /** Gets the optical horizontal and vertical scan resolution of the scanner's Feeder in DPI. */
  var opticalResolution: ImageScannerResolution = js.native
  /** Gets or sets the currently selected page orientation that tells how to place the documents in the scanner's Feeder input tray. */
  var pageOrientation: PrintOrientation = js.native
  /** Gets or sets the currently selected page size to scan from the Feeder. */
  var pageSize: PrintMediaSize = js.native
  /** Gets the dimensions (width and height) and orientation of the selected page size, in mil units (1/1000"). */
  var pageSizeDimensions: Size = js.native
  /** Indicates whether or not to scan ahead. */
  var scanAhead: Boolean = js.native
  /** Gets or sets the origin coordinates (horizontal and vertical) and dimensions (width and height) of the selected scan area, in inches. This property is ignored when the AutoCroppingMode property is not Disabled. */
  var selectedScanRegion: Rect = js.native
  /**
    * Returns whether the scanner's Feeder supports the specified ImageScannerAutoCroppingMode .
    * @param value The auto crop mode of the image to scan.
    * @return Indicates whether the device supports value mode.
    */
  def isAutoCroppingModeSupported(value: ImageScannerAutoCroppingMode): Boolean = js.native
  /**
    * Returns whether the scanner's Feeder can scan and transfer images in the specified color mode.
    * @param value The color mode.
    * @return Indicates whether the scanner can scan images in value mode.
    */
  def isColorModeSupported(value: ImageScannerColorMode): Boolean = js.native
  /**
    * Determines whether the scanner's Feeder supports the specified file format or not.
    * @param value The file type.
    * @return Indicates whether the specified file type is supported.
    */
  def isFormatSupported(value: ImageScannerFormat): Boolean = js.native
  /**
    * Returns whether the Feeder can scan documents in the specified page size and orientation.
    * @param pageSize The page size.
    * @param pageOrientation The page orientation.
    * @return Indicates the scanner can scan with pageSize and pageOrientation values.
    */
  def isPageSizeSupported(pageSize: PrintMediaSize, pageOrientation: PrintOrientation): Boolean = js.native
}

