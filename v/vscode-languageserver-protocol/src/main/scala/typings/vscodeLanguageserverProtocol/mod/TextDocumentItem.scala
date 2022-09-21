package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextDocumentItem {
  
  @JSImport("vscode-languageserver-protocol", "TextDocumentItem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TextDocumentItem literal.
    * @param uri The document's uri.
    * @param languageId The document's language identifier.
    * @param version The document's version number.
    * @param text The document's text.
    */
  inline def create(
    uri: typings.vscodeLanguageserverTypes.mod.DocumentUri,
    languageId: String,
    version: typings.vscodeLanguageserverTypes.mod.integer,
    text: String
  ): typings.vscodeLanguageserverTypes.mod.TextDocumentItem = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any], version.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.TextDocumentItem]
  
  /**
    * Checks whether the given literal conforms to the [TextDocumentItem](#TextDocumentItem) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentItem */ Boolean]
}
