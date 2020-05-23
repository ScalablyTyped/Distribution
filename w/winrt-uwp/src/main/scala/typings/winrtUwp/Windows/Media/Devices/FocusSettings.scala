package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents settings for a FocusControl object. */
trait FocusSettings extends js.Object {
  /** Gets or sets a value indicating the auto focus range setting. */
  var autoFocusRange: AutoFocusRange
  /** Gets or sets a value that indicates to the driver if it should disable determining a focus position when the focus search fails. */
  var disableDriverFallback: Boolean
  /** Gets or sets a value indicating the manual focus distance setting. */
  var distance: ManualFocusDistance
  /** Gets or sets a value indicating the focus mode setting. */
  var mode: FocusMode
  /** Gets or sets the focus value setting. */
  var value: Double
  /** Gets or sets a value indicating whether the capture device should wait for focus before capturing. */
  var waitForFocus: Boolean
}

object FocusSettings {
  @scala.inline
  def apply(
    autoFocusRange: AutoFocusRange,
    disableDriverFallback: Boolean,
    distance: ManualFocusDistance,
    mode: FocusMode,
    value: Double,
    waitForFocus: Boolean
  ): FocusSettings = {
    val __obj = js.Dynamic.literal(autoFocusRange = autoFocusRange.asInstanceOf[js.Any], disableDriverFallback = disableDriverFallback.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], waitForFocus = waitForFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusSettings]
  }
}

