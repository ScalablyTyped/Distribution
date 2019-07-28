package typings.winrt.WindowsNs.SystemNs

import typings.winrt.WindowsNs.FoundationNs.Point
import typings.winrt.WindowsNs.FoundationNs.Rect
import typings.winrt.WindowsNs.UINs.PopupsNs.Placement
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

