package typings.tableau.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarButtonName extends js.Object

@JSGlobal("tableau.ToolbarButtonName")
@js.native
object ToolbarButtonName extends js.Object {
  /** Specifies the Redo button in the toolbar. */
  @js.native
  sealed trait REDO extends ToolbarButtonName
  
  /** Specifies the Undo button in the toolbar. */
  @js.native
  sealed trait UNDO extends ToolbarButtonName
  
  /* "redo" */ val REDO: typings.tableau.tableauNs.ToolbarButtonName.REDO with String = js.native
  /* "undo" */ val UNDO: typings.tableau.tableauNs.ToolbarButtonName.UNDO with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarButtonName with String] = js.native
}

