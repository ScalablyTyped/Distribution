package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "DocumentDropEdit")
@js.native
open class DocumentDropEdit protected () extends StObject {
  /**
    * @param insertText The text or snippet to insert at the drop location.
    */
  def this(insertText: String) = this()
  def this(insertText: SnippetString) = this()
  
  /**
    * An optional additional edit to apply on drop.
    */
  var additionalEdit: js.UndefOr[WorkspaceEdit] = js.native
  
  /**
    * The text or snippet to insert at the drop location.
    */
  var insertText: String | SnippetString = js.native
}
