package typings.winrtUwp.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the visual feedback settings for pointer input. */
@JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
@js.native
abstract class PointerVisualizationSettings () extends js.Object {
  /** Gets or sets a value that indicates whether visual feedback is enabled for pen/stylus input when the barrel button is pressed. */
  var isBarrelButtonFeedbackEnabled: Boolean = js.native
  /** Gets or sets a value that indicates whether visual feedback is enabled when a pointer contact is detected. */
  var isContactFeedbackEnabled: Boolean = js.native
}

/* static members */
@JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
@js.native
object PointerVisualizationSettings extends js.Object {
  /**
    * Gets a PointerVisualizationSettings object associated with the current app.
    * @return The PointerVisualizationSettings object associated with the current app.
    */
  def getForCurrentView(): PointerVisualizationSettings = js.native
}

