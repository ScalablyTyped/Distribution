package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotebookCellKind extends StObject
@JSImport("vscode", "NotebookCellKind")
@js.native
object NotebookCellKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotebookCellKind & Double] = js.native
  
  /**
  		 * A code-cell is source that can be {@link NotebookController executed} and that
  		 * produces {@link NotebookCellOutput output}.
  		 */
  @js.native
  sealed trait Code
    extends StObject
       with NotebookCellKind
  /* 2 */ val Code: typings.vscode.mod.NotebookCellKind.Code & Double = js.native
  
  /**
  		 * A markup-cell is formatted source that is used for display.
  		 */
  @js.native
  sealed trait Markup
    extends StObject
       with NotebookCellKind
  /* 1 */ val Markup: typings.vscode.mod.NotebookCellKind.Markup & Double = js.native
}
