package typings.winrtUwp.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the visual feedback settings for pointer input. */
trait PointerVisualizationSettings extends js.Object {
  /** Gets or sets a value that indicates whether visual feedback is enabled for pen/stylus input when the barrel button is pressed. */
  var isBarrelButtonFeedbackEnabled: Boolean
  /** Gets or sets a value that indicates whether visual feedback is enabled when a pointer contact is detected. */
  var isContactFeedbackEnabled: Boolean
}

object PointerVisualizationSettings {
  @scala.inline
  def apply(isBarrelButtonFeedbackEnabled: Boolean, isContactFeedbackEnabled: Boolean): PointerVisualizationSettings = {
    val __obj = js.Dynamic.literal(isBarrelButtonFeedbackEnabled = isBarrelButtonFeedbackEnabled.asInstanceOf[js.Any], isContactFeedbackEnabled = isContactFeedbackEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerVisualizationSettings]
  }
}

