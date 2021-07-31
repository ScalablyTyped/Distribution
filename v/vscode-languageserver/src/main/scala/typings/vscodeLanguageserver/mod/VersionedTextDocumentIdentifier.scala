package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VersionedTextDocumentIdentifier {
  
  @JSImport("vscode-languageserver", "VersionedTextDocumentIdentifier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new VersionedTextDocumentIdentifier literal.
    * @param uri The document's uri.
    * @param uri The document's text.
    */
  @scala.inline
  def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier]
  @scala.inline
  def create(uri: DocumentUri, version: Double): typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(uri.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeLanguageserverTypes.mod.VersionedTextDocumentIdentifier]
  
  /**
    * Checks whether the given literal conforms to the [VersionedTextDocumentIdentifier](#VersionedTextDocumentIdentifier) interface.
    */
  @scala.inline
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.VersionedTextDocumentIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.VersionedTextDocumentIdentifier */ Boolean]
}
