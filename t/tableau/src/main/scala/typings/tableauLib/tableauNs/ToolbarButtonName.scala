package typings
package tableauLib.tableauNs

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
  sealed trait REDO
    extends tableauLib.tableauNs.ToolbarButtonName
  
  /** Specifies the Undo button in the toolbar. */
  @js.native
  sealed trait UNDO
    extends tableauLib.tableauNs.ToolbarButtonName
  
  /* "redo" */ val REDO: REDO with java.lang.String = js.native
  /* "undo" */ val UNDO: UNDO with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.ToolbarButtonName with java.lang.String] = js.native
}

