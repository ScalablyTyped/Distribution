package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextDocumentIdentifier {
  
  @JSImport("vscode-languageserver", "TextDocumentIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TextDocumentIdentifier literal.
    * @param uri The document's uri.
    */
  inline def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier]
  
  /**
    * Checks whether the given literal conforms to the [TextDocumentIdentifier](#TextDocumentIdentifier) interface.
    */
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentIdentifier */ Boolean]
}
