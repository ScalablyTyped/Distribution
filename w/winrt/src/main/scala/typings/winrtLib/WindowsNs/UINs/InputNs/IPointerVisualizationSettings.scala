package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerVisualizationSettings extends js.Object {
  var isBarrelButtonFeedbackEnabled: scala.Boolean
  var isContactFeedbackEnabled: scala.Boolean
}

object IPointerVisualizationSettings {
  @scala.inline
  def apply(isBarrelButtonFeedbackEnabled: scala.Boolean, isContactFeedbackEnabled: scala.Boolean): IPointerVisualizationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isBarrelButtonFeedbackEnabled")(isBarrelButtonFeedbackEnabled)
    __obj.updateDynamic("isContactFeedbackEnabled")(isContactFeedbackEnabled)
    __obj.asInstanceOf[IPointerVisualizationSettings]
  }
}

