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
  
  val above: above with java.lang.String = js.native
  val below: below with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.PopupsNs.Placement with java.lang.String] = js.native
}

