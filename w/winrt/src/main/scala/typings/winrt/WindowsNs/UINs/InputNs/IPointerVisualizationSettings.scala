package typings.winrt.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerVisualizationSettings extends js.Object {
  var isBarrelButtonFeedbackEnabled: Boolean
  var isContactFeedbackEnabled: Boolean
}

object IPointerVisualizationSettings {
  @scala.inline
  def apply(isBarrelButtonFeedbackEnabled: Boolean, isContactFeedbackEnabled: Boolean): IPointerVisualizationSettings = {
    val __obj = js.Dynamic.literal(isBarrelButtonFeedbackEnabled = isBarrelButtonFeedbackEnabled, isContactFeedbackEnabled = isContactFeedbackEnabled)
  
    __obj.asInstanceOf[IPointerVisualizationSettings]
  }
}

