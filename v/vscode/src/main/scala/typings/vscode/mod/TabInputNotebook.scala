package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "TabInputNotebook")
@js.native
open class TabInputNotebook protected () extends StObject {
  /**
  		 * Constructs a new tab input for a notebook.
  		 * @param uri The uri of the notebook.
  		 * @param notebookType The type of notebook. Maps to {@linkcode NotebookDocument.notebookType NotebookDocuments's notebookType}
  		 */
  def this(uri: Uri, notebookType: String) = this()
  
  /**
  		 * The type of notebook. Maps to {@linkcode NotebookDocument.notebookType NotebookDocuments's notebookType}
  		 */
  val notebookType: String = js.native
  
  /**
  		 * The uri that the tab is representing.
  		 */
  val uri: Uri = js.native
}
