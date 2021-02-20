package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextDocumentEdit {
  
  /**
    * Creates a new `TextDocumentEdit`
    */
  @JSImport("vscode-languageclient/lib/client", "TextDocumentEdit.create")
  @js.native
  def create(
    textDocument: typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier,
    edits: js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit]
  ): typings.vscodeLanguageserverTypes.mod.TextDocumentEdit = js.native
  
  @JSImport("vscode-languageclient/lib/client", "TextDocumentEdit.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocumentEdit */ Boolean = js.native
}
