package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointerVisualizationSettings extends IPointerVisualizationSettings

object PointerVisualizationSettings {
  @scala.inline
  def apply(isBarrelButtonFeedbackEnabled: Boolean, isContactFeedbackEnabled: Boolean): PointerVisualizationSettings = {
    val __obj = js.Dynamic.literal(isBarrelButtonFeedbackEnabled = isBarrelButtonFeedbackEnabled.asInstanceOf[js.Any], isContactFeedbackEnabled = isContactFeedbackEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerVisualizationSettings]
  }
}

