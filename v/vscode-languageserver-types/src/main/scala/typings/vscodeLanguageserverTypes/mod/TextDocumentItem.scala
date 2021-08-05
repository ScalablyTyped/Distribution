package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentItem extends StObject {
  
  /**
    * The text document's language identifier
    */
  var languageId: String
  
  /**
    * The content of the opened text document.
    */
  var text: String
  
  /**
    * The text document's uri.
    */
  var uri: DocumentUri
  
  /**
    * The version number of this document (it will increase after each
    * change, including undo/redo).
    */
  var version: Double
}
object TextDocumentItem {
  
  inline def apply(languageId: String, text: String, uri: DocumentUri, version: Double): TextDocumentItem = {
    val __obj = js.Dynamic.literal(languageId = languageId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentItem]
  }
  
  @JSImport("vscode-languageserver-types", "TextDocumentItem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TextDocumentItem literal.
    * @param uri The document's uri.
    * @param languageId The document's language identifier.
    * @param version The document's version number.
    * @param text The document's text.
    */
  inline def create(uri: DocumentUri, languageId: String, version: Double, text: String): TextDocumentItem = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any], version.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[TextDocumentItem]
  
  /**
    * Checks whether the given literal conforms to the [TextDocumentItem](#TextDocumentItem) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentItem */ Boolean]
  
  extension [Self <: TextDocumentItem](x: Self) {
    
    inline def setLanguageId(value: String): Self = StObject.set(x, "languageId", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
