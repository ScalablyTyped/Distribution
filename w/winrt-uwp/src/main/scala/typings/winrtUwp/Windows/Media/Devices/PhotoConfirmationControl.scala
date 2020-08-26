package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Media.MediaProperties.MediaPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the photo confirmation settings on a capture device. */
@js.native
trait PhotoConfirmationControl extends js.Object {
  /** Gets or sets a value indicating whether photo confirmation is enabled. */
  var enabled: Boolean = js.native
  /** Gets or sets the desired pixel format for photo confirmation frames. */
  var pixelFormat: MediaPixelFormat = js.native
  /** Gets a value indicating whether photo confirmation is supported by the capture device. */
  var supported: Boolean = js.native
}

object PhotoConfirmationControl {
  @scala.inline
  def apply(enabled: Boolean, pixelFormat: MediaPixelFormat, supported: Boolean): PhotoConfirmationControl = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], pixelFormat = pixelFormat.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoConfirmationControl]
  }
  @scala.inline
  implicit class PhotoConfirmationControlOps[Self <: PhotoConfirmationControl] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelFormat(value: MediaPixelFormat): Self = this.set("pixelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: Boolean): Self = this.set("supported", value.asInstanceOf[js.Any])
  }
  
}

