package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the focus capabilities of the capture device for frames in a variable photo sequences. */
@JSGlobal("Windows.Media.Devices.Core.FrameFocusCapabilities")
@js.native
abstract class FrameFocusCapabilities () extends js.Object {
  /** Gets the maximum focus length supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
  var max: scala.Double = js.native
  /** Gets the minimum focus length supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
  var min: scala.Double = js.native
  /** Gets the smallest focus increment supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
  var step: scala.Double = js.native
  /** Gets a value that indicates if the capture device supports the focus control for frames in a variable photo sequence. */
  var supported: scala.Boolean = js.native
}

