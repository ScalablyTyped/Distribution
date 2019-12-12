package typings.tableau.tableau

import org.scalablytyped.runtime.TopLevel
import typings.tableau.tableau.ToolbarButtonName.REDO
import typings.tableau.tableau.ToolbarButtonName.UNDO
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ToolbarButtonName with String] = js.native
  /* "redo" */ @js.native
  object REDO extends TopLevel[REDO with String]
  
  /* "undo" */ @js.native
  object UNDO extends TopLevel[UNDO with String]
  
}

