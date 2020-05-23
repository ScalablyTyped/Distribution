package typings.winrt.global.Windows.UI.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
@js.native
class PointerVisualizationSettings ()
  extends typings.winrt.Windows.UI.Input.PointerVisualizationSettings {
  /* CompleteClass */
  override var isBarrelButtonFeedbackEnabled: Boolean = js.native
  /* CompleteClass */
  override var isContactFeedbackEnabled: Boolean = js.native
}

/* static members */
@JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
@js.native
object PointerVisualizationSettings extends js.Object {
  def getForCurrentView(): typings.winrt.Windows.UI.Input.PointerVisualizationSettings = js.native
}

