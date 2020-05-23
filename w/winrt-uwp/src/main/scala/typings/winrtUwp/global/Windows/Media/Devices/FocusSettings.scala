package typings.winrtUwp.global.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents settings for a FocusControl object. */
@JSGlobal("Windows.Media.Devices.FocusSettings")
@js.native
/** Initializes a new instance of the FocusSettings class. */
class FocusSettings ()
  extends typings.winrtUwp.Windows.Media.Devices.FocusSettings {
  /** Gets or sets a value indicating the auto focus range setting. */
  /* CompleteClass */
  override var autoFocusRange: typings.winrtUwp.Windows.Media.Devices.AutoFocusRange = js.native
  /** Gets or sets a value that indicates to the driver if it should disable determining a focus position when the focus search fails. */
  /* CompleteClass */
  override var disableDriverFallback: Boolean = js.native
  /** Gets or sets a value indicating the manual focus distance setting. */
  /* CompleteClass */
  override var distance: typings.winrtUwp.Windows.Media.Devices.ManualFocusDistance = js.native
  /** Gets or sets a value indicating the focus mode setting. */
  /* CompleteClass */
  override var mode: typings.winrtUwp.Windows.Media.Devices.FocusMode = js.native
  /** Gets or sets the focus value setting. */
  /* CompleteClass */
  override var value: Double = js.native
  /** Gets or sets a value indicating whether the capture device should wait for focus before capturing. */
  /* CompleteClass */
  override var waitForFocus: Boolean = js.native
}

