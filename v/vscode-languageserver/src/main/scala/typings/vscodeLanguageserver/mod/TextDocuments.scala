package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.anon.Uri
import typings.vscodeLanguageserver.libCommonTextDocumentsMod.TextDocumentsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "TextDocuments")
@js.native
open class TextDocuments[T /* <: Uri */] protected ()
  extends typings.vscodeLanguageserver.libCommonTextDocumentsMod.TextDocuments[T] {
  /**
    * Create a new text document manager.
    */
  def this(configuration: TextDocumentsConfiguration[T]) = this()
}
