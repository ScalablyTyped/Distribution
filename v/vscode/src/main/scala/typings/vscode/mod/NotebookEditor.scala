package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookEditor extends StObject {
  
  /**
    * The {@link NotebookDocument notebook document} associated with this notebook editor.
    */
  val notebook: NotebookDocument = js.native
  
  /**
    * Scroll as indicated by `revealType` in order to reveal the given range.
    *
    * @param range A range.
    * @param revealType The scrolling strategy for revealing `range`.
    */
  def revealRange(range: NotebookRange): Unit = js.native
  def revealRange(range: NotebookRange, revealType: NotebookEditorRevealType): Unit = js.native
  
  /**
    * The primary selection in this notebook editor.
    */
  var selection: NotebookRange = js.native
  
  /**
    * All selections in this notebook editor.
    *
    * The primary selection (or focused range) is `selections[0]`. When the document has no cells, the primary selection is empty `{ start: 0, end: 0 }`;
    */
  var selections: js.Array[NotebookRange] = js.native
  
  /**
    * The column in which this editor shows.
    */
  val viewColumn: js.UndefOr[ViewColumn] = js.native
  
  /**
    * The current visible ranges in the editor (vertically).
    */
  val visibleRanges: js.Array[NotebookRange] = js.native
}
