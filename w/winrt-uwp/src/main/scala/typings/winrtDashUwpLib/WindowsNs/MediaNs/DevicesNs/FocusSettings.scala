package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents settings for a FocusControl object. */
@JSGlobal("Windows.Media.Devices.FocusSettings")
@js.native
/** Initializes a new instance of the FocusSettings class. */
class FocusSettings () extends js.Object {
  /** Gets or sets a value indicating the auto focus range setting. */
  var autoFocusRange: AutoFocusRange = js.native
  /** Gets or sets a value that indicates to the driver if it should disable determining a focus position when the focus search fails. */
  var disableDriverFallback: scala.Boolean = js.native
  /** Gets or sets a value indicating the manual focus distance setting. */
  var distance: ManualFocusDistance = js.native
  /** Gets or sets a value indicating the focus mode setting. */
  var mode: FocusMode = js.native
  /** Gets or sets the focus value setting. */
  var value: scala.Double = js.native
  /** Gets or sets a value indicating whether the capture device should wait for focus before capturing. */
  var waitForFocus: scala.Boolean = js.native
}

