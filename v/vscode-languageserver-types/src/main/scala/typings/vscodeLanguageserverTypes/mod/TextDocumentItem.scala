package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentItem extends StObject {
  
  /**
    * The text document's language identifier
    */
  var languageId: String = js.native
  
  /**
    * The content of the opened text document.
    */
  var text: String = js.native
  
  /**
    * The text document's uri.
    */
  var uri: DocumentUri = js.native
  
  /**
    * The version number of this document (it will increase after each
    * change, including undo/redo).
    */
  var version: Double = js.native
}
object TextDocumentItem {
  
  @scala.inline
  def apply(languageId: String, text: String, uri: DocumentUri, version: Double): TextDocumentItem = {
    val __obj = js.Dynamic.literal(languageId = languageId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentItem]
  }
  
  /**
    * Creates a new TextDocumentItem literal.
    * @param uri The document's uri.
    * @param languageId The document's language identifier.
    * @param version The document's version number.
    * @param text The document's text.
    */
  @JSImport("vscode-languageserver-types", "TextDocumentItem.create")
  @js.native
  def create(uri: DocumentUri, languageId: String, version: Double, text: String): TextDocumentItem = js.native
  
  /**
    * Checks whether the given literal conforms to the [TextDocumentItem](#TextDocumentItem) interface.
    */
  @JSImport("vscode-languageserver-types", "TextDocumentItem.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentItem */ Boolean = js.native
  
  @scala.inline
  implicit class TextDocumentItemMutableBuilder[Self <: TextDocumentItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageId(value: String): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
