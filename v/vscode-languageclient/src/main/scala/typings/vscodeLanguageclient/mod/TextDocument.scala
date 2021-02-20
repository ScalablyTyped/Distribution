package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextDocument {
  
  @JSImport("vscode-languageclient", "TextDocument.applyEdits")
  @js.native
  def applyEdits(
    document: typings.vscodeLanguageserverTypes.mod.TextDocument,
    edits: js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit]
  ): String = js.native
  
  /**
    * Creates a new ITextDocument literal from the given uri and content.
    * @param uri The document's uri.
    * @param languageId  The document's language Id.
    * @param content The document's content.
    */
  @JSImport("vscode-languageclient", "TextDocument.create")
  @js.native
  def create(uri: DocumentUri, languageId: String, version: Double, content: String): typings.vscodeLanguageserverTypes.mod.TextDocument = js.native
  
  /**
    * Checks whether the given literal conforms to the [ITextDocument](#ITextDocument) interface.
    */
  @JSImport("vscode-languageclient", "TextDocument.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.TextDocument */ Boolean = js.native
}
