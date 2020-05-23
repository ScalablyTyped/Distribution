package typings.winrtUwp.Windows.Devices.Scanners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the auto-configured scan source of the scanner. */
trait ImageScannerAutoConfiguration extends js.Object {
  /** The default file format for the scan source at the beginning of a new scan session. */
  var defaultFormat: ImageScannerFormat
  /** Gets or sets the current file transfer format for image data acquisition from the device to the client app. */
  var format: ImageScannerFormat
  /**
    * Determines if the input scanner supports the specified file format.
    * @param value The file type.
    * @return True if the specified file type is supported; otherwise False.
    */
  def isFormatSupported(value: ImageScannerFormat): Boolean
}

object ImageScannerAutoConfiguration {
  @scala.inline
  def apply(
    defaultFormat: ImageScannerFormat,
    format: ImageScannerFormat,
    isFormatSupported: ImageScannerFormat => Boolean
  ): ImageScannerAutoConfiguration = {
    val __obj = js.Dynamic.literal(defaultFormat = defaultFormat.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], isFormatSupported = js.Any.fromFunction1(isFormatSupported))
    __obj.asInstanceOf[ImageScannerAutoConfiguration]
  }
}

