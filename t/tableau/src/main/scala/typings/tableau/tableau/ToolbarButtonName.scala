package typings.tableau.tableau

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
  
}

