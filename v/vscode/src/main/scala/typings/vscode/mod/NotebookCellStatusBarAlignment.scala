package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotebookCellStatusBarAlignment extends StObject
@JSImport("vscode", "NotebookCellStatusBarAlignment")
@js.native
object NotebookCellStatusBarAlignment extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NotebookCellStatusBarAlignment & Double] = js.native
  
  /**
  		 * Aligned to the left side.
  		 */
  @js.native
  sealed trait Left
    extends StObject
       with NotebookCellStatusBarAlignment
  /* 1 */ val Left: typings.vscode.mod.NotebookCellStatusBarAlignment.Left & Double = js.native
  
  /**
  		 * Aligned to the right side.
  		 */
  @js.native
  sealed trait Right
    extends StObject
       with NotebookCellStatusBarAlignment
  /* 2 */ val Right: typings.vscode.mod.NotebookCellStatusBarAlignment.Right & Double = js.native
}
