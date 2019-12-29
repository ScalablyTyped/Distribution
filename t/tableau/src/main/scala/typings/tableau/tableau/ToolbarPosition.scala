package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarPosition with String] = js.native
  /* "bottom" */ @js.native
  object BOTTOM extends TopLevel[BOTTOM with String]
  
  /* "top" */ @js.native
  object TOP extends TopLevel[TOP with String]
  
}

