package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the ISO speed settings for a frame in a variable photo sequence. */
@JSGlobal("Windows.Media.Devices.Core.FrameIsoSpeedControl")
@js.native
abstract class FrameIsoSpeedControl () extends js.Object {
  /** Gets or sets a value indicating whether ISO speed is automatically set for a frame in a variable photo sequence. */
  var auto: Boolean = js.native
  /** Gets or sets the ISO speed for a frame in a variable photo sequence. */
  var value: Double = js.native
}

