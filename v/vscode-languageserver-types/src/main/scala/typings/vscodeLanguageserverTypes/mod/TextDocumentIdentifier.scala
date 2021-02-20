package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDocumentIdentifier extends StObject {
  
  /**
    * The text document's uri.
    */
  var uri: DocumentUri = js.native
}
object TextDocumentIdentifier {
  
  @scala.inline
  def apply(uri: DocumentUri): TextDocumentIdentifier = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentIdentifier]
  }
  
  /**
    * Creates a new TextDocumentIdentifier literal.
    * @param uri The document's uri.
    */
  @JSImport("vscode-languageserver-types", "TextDocumentIdentifier.create")
  @js.native
  def create(uri: DocumentUri): TextDocumentIdentifier = js.native
  
  /**
    * Checks whether the given literal conforms to the [TextDocumentIdentifier](#TextDocumentIdentifier) interface.
    */
  @JSImport("vscode-languageserver-types", "TextDocumentIdentifier.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentIdentifier */ Boolean = js.native
  
  @scala.inline
  implicit class TextDocumentIdentifierMutableBuilder[Self <: TextDocumentIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
