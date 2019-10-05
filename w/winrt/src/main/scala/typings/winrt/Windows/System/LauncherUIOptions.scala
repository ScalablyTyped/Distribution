package typings.winrt.Windows.System

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.UI.Popups.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.LauncherUIOptions")
@js.native
class LauncherUIOptions () extends ILauncherUIOptions {
  /* CompleteClass */
  override var invocationPoint: Point = js.native
  /* CompleteClass */
  override var preferredPlacement: Placement = js.native
  /* CompleteClass */
  override var selectionRect: Rect = js.native
}

