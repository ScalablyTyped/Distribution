package typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs

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
  sealed trait landscape extends ApplicationViewOrientation
  
  /** The window is in portrait orientation, with the display height greater than the width. */
  @js.native
  sealed trait portrait extends ApplicationViewOrientation
  
  /* 0 */ val landscape: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation.landscape with Double = js.native
  /* 1 */ val portrait: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.ApplicationViewOrientation.portrait with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationViewOrientation with Double] = js.native
}

