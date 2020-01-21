package typings.winrtUwp.Windows.System

import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.UI.Popups.Placement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies options for user interface elements such as the application picker that can be invoked by this API. */
@JSGlobal("Windows.System.LauncherUIOptions")
@js.native
abstract class LauncherUIOptions () extends js.Object {
  /** Gets or sets the point on the screen where the user opened a file or URI. */
  var invocationPoint: Point = js.native
  /** Gets or sets the preferred placement of the Open With and Warning dialog boxes when starting a default app. */
  var preferredPlacement: Placement = js.native
  /** Gets or sets the selection rectangle on the screen where the user opened a file or URI. */
  var selectionRect: Rect = js.native
}

