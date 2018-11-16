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
  
  val filled: filled with java.lang.String = js.native
  val fullScreenLandscape: fullScreenLandscape with java.lang.String = js.native
  val fullScreenPortrait: fullScreenPortrait with java.lang.String = js.native
  val snapped: snapped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewState with java.lang.String
  ] = js.native
}

