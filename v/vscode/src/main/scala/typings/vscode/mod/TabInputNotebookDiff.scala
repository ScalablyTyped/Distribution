package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TabInputNotebookDiff")
@js.native
open class TabInputNotebookDiff protected () extends StObject {
  /**
    * Constructs a notebook diff tab input.
    * @param original The uri of the original unmodified notebook.
    * @param modified The uri of the modified notebook.
    * @param notebookType The type of notebook. Maps to {@linkcode NotebookDocument.notebookType NotebookDocuments's notebookType}
    */
  def this(original: Uri, modified: Uri, notebookType: String) = this()
  
  /**
    * The uri of the modified notebook.
    */
  val modified: Uri = js.native
  
  /**
    * The type of notebook. Maps to {@linkcode NotebookDocument.notebookType NotebookDocuments's notebookType}
    */
  val notebookType: String = js.native
  
  /**
    * The uri of the original notebook.
    */
  val original: Uri = js.native
}
