package typings
package winrtDashUwpLib.WindowsNs.UINs.PopupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Placement extends js.Object

/** Specifies where the context menu should be positioned relative to the selection rectangle. */
@JSGlobal("Windows.UI.Popups.Placement")
@js.native
object Placement extends js.Object {
  /** Place the context menu above the selection rectangle. */
  @js.native
  sealed trait above
    extends winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  
  /** Place the context menu below the selection rectangle. */
  @js.native
  sealed trait below
    extends winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  
  /** Place the context menu above the selection rectangle. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  
  /** Place the context menu to the left of the selection rectangle. */
  @js.native
  sealed trait left
    extends winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  
  /** Place the context menu to the right of the selection rectangle. */
  @js.native
  sealed trait right
    extends winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement
  
  /* 1 */ val above: above with scala.Double = js.native
  /* 2 */ val below: below with scala.Double = js.native
  /* 0 */ val default: default with scala.Double = js.native
  /* 3 */ val left: left with scala.Double = js.native
  /* 4 */ val right: right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement with scala.Double] = js.native
}

