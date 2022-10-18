package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.anon.Uri
import typings.vscodeLanguageserver.libCommonTextDocumentsMod.TextDocumentsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "NotebookDocuments")
@js.native
open class NotebookDocuments[T /* <: Uri */] protected ()
  extends typings.vscodeLanguageserver.libCommonNotebookMod.NotebookDocuments[T] {
  def this(configurationOrTextDocuments: typings.vscodeLanguageserver.libCommonTextDocumentsMod.TextDocuments[T]) = this()
  def this(configurationOrTextDocuments: TextDocumentsConfiguration[T]) = this()
}
