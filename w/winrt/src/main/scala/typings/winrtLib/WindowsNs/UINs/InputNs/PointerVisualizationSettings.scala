package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
@js.native
class PointerVisualizationSettings () extends IPointerVisualizationSettings {
  /* CompleteClass */
  override var isBarrelButtonFeedbackEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var isContactFeedbackEnabled: scala.Boolean = js.native
}

/* static members */
@JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
@js.native
object PointerVisualizationSettings extends js.Object {
  def getForCurrentView(): winrtLib.WindowsNs.UINs.InputNs.PointerVisualizationSettings = js.native
}

