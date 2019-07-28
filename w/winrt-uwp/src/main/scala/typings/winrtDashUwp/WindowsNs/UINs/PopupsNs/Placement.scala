package typings.winrtDashUwp.WindowsNs.UINs.PopupsNs

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
  sealed trait above extends Placement
  
  /** Place the context menu below the selection rectangle. */
  @js.native
  sealed trait below extends Placement
  
  /** Place the context menu above the selection rectangle. */
  @js.native
  sealed trait default extends Placement
  
  /** Place the context menu to the left of the selection rectangle. */
  @js.native
  sealed trait left extends Placement
  
  /** Place the context menu to the right of the selection rectangle. */
  @js.native
  sealed trait right extends Placement
  
  /* 1 */ val above: typings.winrtDashUwp.WindowsNs.UINs.PopupsNs.Placement.above with Double = js.native
  /* 2 */ val below: typings.winrtDashUwp.WindowsNs.UINs.PopupsNs.Placement.below with Double = js.native
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.UINs.PopupsNs.Placement.default with Double = js.native
  /* 3 */ val left: typings.winrtDashUwp.WindowsNs.UINs.PopupsNs.Placement.left with Double = js.native
  /* 4 */ val right: typings.winrtDashUwp.WindowsNs.UINs.PopupsNs.Placement.right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Placement with Double] = js.native
}

