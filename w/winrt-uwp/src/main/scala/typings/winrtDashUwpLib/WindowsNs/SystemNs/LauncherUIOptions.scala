package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies options for user interface elements such as the application picker that can be invoked by this API. */
@JSGlobal("Windows.System.LauncherUIOptions")
@js.native
abstract class LauncherUIOptions () extends js.Object {
  /** Gets or sets the point on the screen where the user opened a file or URI. */
  var invocationPoint: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /** Gets or sets the preferred placement of the Open With and Warning dialog boxes when starting a default app. */
  var preferredPlacement: winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement = js.native
  /** Gets or sets the selection rectangle on the screen where the user opened a file or URI. */
  var selectionRect: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
}

