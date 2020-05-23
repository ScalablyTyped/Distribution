package typings.winrtUwp.Windows.UI.Popups

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
  
}

