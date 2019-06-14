package typings
package winrtDashUwpLib.WindowsNs.UINs.CoreNs

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
  sealed trait collapsed
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AppViewBackButtonVisibility
  
  /** The back button is shown. */
  @js.native
  sealed trait visible
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AppViewBackButtonVisibility
  
  /* 1 */ val collapsed: collapsed with scala.Double = js.native
  /* 0 */ val visible: visible with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.CoreNs.AppViewBackButtonVisibility with scala.Double
  ] = js.native
}

