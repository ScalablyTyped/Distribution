package typings.winrt.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
@js.native
class PointerVisualizationSettings () extends IPointerVisualizationSettings {
  /* CompleteClass */
  override var isBarrelButtonFeedbackEnabled: Boolean = js.native
  /* CompleteClass */
  override var isContactFeedbackEnabled: Boolean = js.native
}

/* static members */
@JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
@js.native
object PointerVisualizationSettings extends js.Object {
  def getForCurrentView(): PointerVisualizationSettings = js.native
}

