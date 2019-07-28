package typings.winrtDashUwp.WindowsNs.DevicesNs.ScannersNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Rect
import typings.winrtDashUwp.WindowsNs.FoundationNs.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the Flatbed scan source of the scanner. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerFlatbedConfiguration")
@js.native
abstract class ImageScannerFlatbedConfiguration () extends js.Object {
  /** Gets the actual horizontal and vertical scan resolution for the Flatbed scanner, in DPI. */
  var actualResolution: ImageScannerResolution = js.native
  /** Gets or sets the automatic crop mode. */
  var autoCroppingMode: ImageScannerAutoCroppingMode = js.native
  /** Gets or sets the current brightness level for capturing image data from the scanner's Flatbed. At the beginning of a new scan session, this property is set to the DefaultBrightness property. */
  var brightness: Double = js.native
  /** Gets the step size at which the brightness levels of the data source can be increased or decreased between the minimum and maximum values. */
  var brightnessStep: Double = js.native
  /** Gets or sets the color mode for the Flatbed scanner. */
  var colorMode: ImageScannerColorMode = js.native
  /** Sets or gets the current contrast level for capturing image data from the scan source. At the beginning of a new scan session this property is set to the DefaultContrast property. */
  var contrast: Double = js.native
  /** Gets the step size at which the contrast levels of the data source can increase or decrease between the minimum and maximum values. */
  var contrastStep: Double = js.native
  /** Gets the default brightness level for the scanner's Flatbed. */
  var defaultBrightness: Double = js.native
  /** Gets the default color mode for the scanner's Flatbed. */
  var defaultColorMode: ImageScannerColorMode = js.native
  /** Gets the default contrast level for the scanner's Flatbed. */
  var defaultContrast: Double = js.native
  /** Gets the default file format for the scanner's Flatbed at the beginning of a new scan session. */
  var defaultFormat: ImageScannerFormat = js.native
  /** Gets or sets the horizontal and vertical scan resolution for the scanner's Flatbed that the app requests, in DPI. */
  var desiredResolution: ImageScannerResolution = js.native
  /** Gets or sets the current file transfer format for image data acquisition from the scanner's Flatbed to the client app. */
  var format: ImageScannerFormat = js.native
  /** Gets the maximum brightness level supported by the scanner's Flatbed. */
  var maxBrightness: Double = js.native
  /** Gets the maximum contrast level supported by the scanner's Flatbed. */
  var maxContrast: Double = js.native
  /** Gets the maximum horizontal and vertical scan resolution of the scanner's Flatbed in DPI. */
  var maxResolution: ImageScannerResolution = js.native
  /** Gets the maximum scan area dimensions in inches. The maximum scan width is the widest a document can be in order for the scanner's Flatbed to scan it. */
  var maxScanArea: Size = js.native
  /** Gets the minimum brightness level supported by the scanner's Flatbed. */
  var minBrightness: Double = js.native
  /** Gets the minimum contrast level supported by the scanner's Flatbed. */
  var minContrast: Double = js.native
  /** Gets the minimum horizontal and vertical scan resolution of the scanner's Flatbed in DPI. */
  var minResolution: ImageScannerResolution = js.native
  /** Gets the minimum scan area in inches. The minimum scan area is the smallest size a document can have in order for a Flatbed to scan it. */
  var minScanArea: Size = js.native
  /** Gets the optical scan resolution of the Flatbed scanner in DPI. */
  var opticalResolution: ImageScannerResolution = js.native
  /** Gets or sets the origin coordinates (horizontal and vertical) and dimensions (width and height) of the selected scan area, in inches. This property is ignored when the AutoCroppingMode property is not Disabled. */
  var selectedScanRegion: Rect = js.native
  /**
    * Returns whether the scanner's Flatbed supports the specified ImageScannerAutoCroppingMode .
    * @param value The auto crop mode of the image to scan.
    * @return Indicates whether the device supports value mode.
    */
  def isAutoCroppingModeSupported(value: ImageScannerAutoCroppingMode): Boolean = js.native
  /**
    * Returns whether the scanner's Flatbed can scan and transfer images in the specified color mode.
    * @param value The color mode.
    * @return Indicates whether the scanner can scan images in value mode.
    */
  def isColorModeSupported(value: ImageScannerColorMode): Boolean = js.native
  /**
    * Determines whether the scanner's Flatbed supports the specified file format or not.
    * @param value The file type.
    * @return Indicates whether the specified file type is supported.
    */
  def isFormatSupported(value: ImageScannerFormat): Boolean = js.native
}

