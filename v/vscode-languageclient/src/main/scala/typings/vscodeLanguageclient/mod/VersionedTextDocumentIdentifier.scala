package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VersionedTextDocumentIdentifier {
  
  /**
    * Creates a new VersionedTextDocumentIdentifier literal.
    * @param uri The document's uri.
    * @param uri The document's text.
    */
  @JSImport("vscode-languageclient", "VersionedTextDocumentIdentifier.create")
  @js.native
  def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier = js.native
  @JSImport("vscode-languageclient", "VersionedTextDocumentIdentifier.create")
  @js.native
  def create(uri: DocumentUri, version: Double): typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier = js.native
  
  /**
    * Checks whether the given literal conforms to the [VersionedTextDocumentIdentifier](#VersionedTextDocumentIdentifier) interface.
    */
  @JSImport("vscode-languageclient", "VersionedTextDocumentIdentifier.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.VersionedTextDocumentIdentifier */ Boolean = js.native
}
