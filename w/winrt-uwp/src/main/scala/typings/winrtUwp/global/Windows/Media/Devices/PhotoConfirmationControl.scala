package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Media.MediaProperties.MediaPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the photo confirmation settings on a capture device. */
@JSGlobal("Windows.Media.Devices.PhotoConfirmationControl")
@js.native
abstract class PhotoConfirmationControl ()
  extends typings.winrtUwp.Windows.Media.Devices.PhotoConfirmationControl {
  /** Gets or sets a value indicating whether photo confirmation is enabled. */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /** Gets or sets the desired pixel format for photo confirmation frames. */
  /* CompleteClass */
  override var pixelFormat: MediaPixelFormat = js.native
  /** Gets a value indicating whether photo confirmation is supported by the capture device. */
  /* CompleteClass */
  override var supported: Boolean = js.native
}

