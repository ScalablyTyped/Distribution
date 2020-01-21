package typings.winrtUwp.Windows.Devices.Scanners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the auto-configured scan source of the scanner. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerAutoConfiguration")
@js.native
abstract class ImageScannerAutoConfiguration () extends js.Object {
  /** The default file format for the scan source at the beginning of a new scan session. */
  var defaultFormat: ImageScannerFormat = js.native
  /** Gets or sets the current file transfer format for image data acquisition from the device to the client app. */
  var format: ImageScannerFormat = js.native
  /**
    * Determines if the input scanner supports the specified file format.
    * @param value The file type.
    * @return True if the specified file type is supported; otherwise False.
    */
  def isFormatSupported(value: ImageScannerFormat): Boolean = js.native
}

