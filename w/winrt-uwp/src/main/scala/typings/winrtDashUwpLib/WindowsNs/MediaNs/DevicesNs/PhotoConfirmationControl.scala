package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the photo confirmation settings on a capture device. */
@JSGlobal("Windows.Media.Devices.PhotoConfirmationControl")
@js.native
abstract class PhotoConfirmationControl () extends js.Object {
  /** Gets or sets a value indicating whether photo confirmation is enabled. */
  var enabled: scala.Boolean = js.native
  /** Gets or sets the desired pixel format for photo confirmation frames. */
  var pixelFormat: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaPixelFormat = js.native
  /** Gets a value indicating whether photo confirmation is supported by the capture device. */
  var supported: scala.Boolean = js.native
}

