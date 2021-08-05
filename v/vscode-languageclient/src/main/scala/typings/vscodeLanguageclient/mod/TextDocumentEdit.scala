package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextDocumentEdit {
  
  @JSImport("vscode-languageclient", "TextDocumentEdit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new `TextDocumentEdit`
    */
  inline def create(
    textDocument: typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier,
    edits: js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit]
  ): typings.vscodeLanguageserverTypes.mod.TextDocumentEdit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(textDocument.asInstanceOf[js.Any], edits.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.TextDocumentEdit]
  
  inline def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean]
}
