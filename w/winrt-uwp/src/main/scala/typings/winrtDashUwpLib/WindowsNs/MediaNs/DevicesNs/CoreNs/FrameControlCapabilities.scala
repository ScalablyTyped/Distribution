package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the variable photo sequence capabilities of the capture device. */
@JSGlobal("Windows.Media.Devices.Core.FrameControlCapabilities")
@js.native
abstract class FrameControlCapabilities () extends js.Object {
  /** Gets the exposure capabilities of the capture device for variable photo sequences. */
  var exposure: FrameExposureCapabilities = js.native
  /** Gets the exposure compensation capabilities of the capture device for variable photo sequences. */
  var exposureCompensation: FrameExposureCompensationCapabilities = js.native
  /** Gets the flash capabilities of the capture device for variable photo sequences. */
  var flash: FrameFlashCapabilities = js.native
  /** Gets the focus capabilities of the capture device for variable photo sequences. */
  var focus: FrameFocusCapabilities = js.native
  /** Gets the ISO speed capabilities of the capture device for variable photo sequences. */
  var isoSpeed: FrameIsoSpeedCapabilities = js.native
  /** Gets whether the capture device supports photo confirmation for variable photo sequences. */
  var photoConfirmationSupported: scala.Boolean = js.native
}

