package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationViewOrientation extends js.Object

/** Defines the set of display orientation modes for a window (app view). */
@JSGlobal("Windows.UI.ViewManagement.ApplicationViewOrientation")
@js.native
object ApplicationViewOrientation extends js.Object {
  /** The window is in landscape orientation, with the display width greater than the height. */
  @js.native
  sealed trait landscape
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation
  
  /** The window is in portrait orientation, with the display height greater than the width. */
  @js.native
  sealed trait portrait
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation
  
  /* 0 */ val landscape: landscape with scala.Double = js.native
  /* 1 */ val portrait: portrait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation with scala.Double
  ] = js.native
}

