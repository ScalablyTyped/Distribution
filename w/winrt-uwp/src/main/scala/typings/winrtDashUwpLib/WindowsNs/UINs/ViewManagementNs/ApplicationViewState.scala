package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewState extends js.Object

/** Specifies the set of app view state changes that can be handled. */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewState")
@js.native
object ApplicationViewState extends js.Object {
  /** The current app's view has been reduced to a partial screen view as the result of another app snapping. */
  @js.native
  sealed trait filled
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState
  
  /** The current app's view is in full-screen (has no snapped app adjacent to it), and has changed to landscape orientation. */
  @js.native
  sealed trait fullScreenLandscape
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState
  
  /** The current app's view is in full-screen (has no snapped app adjacent to it), and has changed to portrait orientation. */
  @js.native
  sealed trait fullScreenPortrait
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState
  
  /** The current app's view has been snapped. */
  @js.native
  sealed trait snapped
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState
  
  /* 1 */ val filled: filled with scala.Double = js.native
  /* 0 */ val fullScreenLandscape: fullScreenLandscape with scala.Double = js.native
  /* 3 */ val fullScreenPortrait: fullScreenPortrait with scala.Double = js.native
  /* 2 */ val snapped: snapped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState with scala.Double
  ] = js.native
}

