package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Media.MediaProperties.MediaPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the photo confirmation settings on a capture device. */
trait PhotoConfirmationControl extends js.Object {
  /** Gets or sets a value indicating whether photo confirmation is enabled. */
  var enabled: Boolean
  /** Gets or sets the desired pixel format for photo confirmation frames. */
  var pixelFormat: MediaPixelFormat
  /** Gets a value indicating whether photo confirmation is supported by the capture device. */
  var supported: Boolean
}

object PhotoConfirmationControl {
  @scala.inline
  def apply(enabled: Boolean, pixelFormat: MediaPixelFormat, supported: Boolean): PhotoConfirmationControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], pixelFormat = pixelFormat.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoConfirmationControl]
  }
}

