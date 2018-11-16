package typings
package tableauLib.tableauNs

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
  sealed trait BOTTOM
    extends tableauLib.tableauNs.ToolbarPosition
  
  /** Positions the toolbar along the top of the visualization. */
  @js.native
  sealed trait TOP
    extends tableauLib.tableauNs.ToolbarPosition
  
  /* "bottom" */ val BOTTOM: BOTTOM with java.lang.String = js.native
  /* "top" */ val TOP: TOP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[tableauLib.tableauNs.ToolbarPosition with java.lang.String] = js.native
}

