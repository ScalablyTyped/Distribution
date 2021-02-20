package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextDocumentIdentifier {
  
  /**
    * Creates a new TextDocumentIdentifier literal.
    * @param uri The document's uri.
    */
  @JSImport("vscode-languageclient/lib/client", "TextDocumentIdentifier.create")
  @js.native
  def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier = js.native
  
  /**
    * Checks whether the given literal conforms to the [TextDocumentIdentifier](#TextDocumentIdentifier) interface.
    */
  @JSImport("vscode-languageclient/lib/client", "TextDocumentIdentifier.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentIdentifier */ Boolean = js.native
}
