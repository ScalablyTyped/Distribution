package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentIdentifier extends StObject {
  
  /**
    * The text document's uri.
    */
  var uri: DocumentUri
}
object TextDocumentIdentifier {
  
  @scala.inline
  def apply(uri: DocumentUri): TextDocumentIdentifier = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentIdentifier]
  }
  
  @JSImport("vscode-languageserver-types", "TextDocumentIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TextDocumentIdentifier literal.
    * @param uri The document's uri.
    */
  @scala.inline
  def create(uri: DocumentUri): TextDocumentIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[TextDocumentIdentifier]
  
  /**
    * Checks whether the given literal conforms to the [TextDocumentIdentifier](#TextDocumentIdentifier) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentIdentifier */ Boolean]
  
  @scala.inline
  implicit class TextDocumentIdentifierMutableBuilder[Self <: TextDocumentIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
