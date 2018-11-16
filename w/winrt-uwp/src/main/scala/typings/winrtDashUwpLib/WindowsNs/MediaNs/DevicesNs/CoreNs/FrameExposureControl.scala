package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the exposure time settings for a frame in a variable photo sequence. */
@JSGlobal("Windows.Media.Devices.Core.FrameExposureControl")
@js.native
abstract class FrameExposureControl () extends js.Object {
  /** Gets or sets a value indicating whether auto exposure is enabled for a frame in a variable photo sequence. */
  var auto: scala.Boolean = js.native
  /** Gets or sets the exposure time for a frame in a variable photo sequence. */
  var value: scala.Double = js.native
}

