package typings.winrtDashUwp.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppViewBackButtonVisibility extends js.Object

/** Defines constants that specify whether the back button is shown in the system UI. */
@JSGlobal("Windows.UI.Core.AppViewBackButtonVisibility")
@js.native
object AppViewBackButtonVisibility extends js.Object {
  /** The back button is not shown and space is not reserved for it in the layout. */
  @js.native
  sealed trait collapsed extends AppViewBackButtonVisibility
  
  /** The back button is shown. */
  @js.native
  sealed trait visible extends AppViewBackButtonVisibility
  
  /* 1 */ val collapsed: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AppViewBackButtonVisibility.collapsed with Double = js.native
  /* 0 */ val visible: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AppViewBackButtonVisibility.visible with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppViewBackButtonVisibility with Double] = js.native
}

