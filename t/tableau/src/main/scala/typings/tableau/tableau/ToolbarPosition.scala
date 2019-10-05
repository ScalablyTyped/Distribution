package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarPosition extends js.Object

@JSGlobal("tableau.ToolbarPosition")
@js.native
object ToolbarPosition extends js.Object {
  /** Positions the toolbar along the bottom of the visualization. */
  @js.native
  sealed trait BOTTOM extends ToolbarPosition
  
  /** Positions the toolbar along the top of the visualization. */
  @js.native
  sealed trait TOP extends ToolbarPosition
  
  /* "bottom" */ val BOTTOM: typings.tableau.tableau.ToolbarPosition.BOTTOM with String = js.native
  /* "top" */ val TOP: typings.tableau.tableau.ToolbarPosition.TOP with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarPosition with String] = js.native
}

