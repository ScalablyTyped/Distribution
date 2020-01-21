package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverTypes.mod.CreateFileOptions
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "CreateFile")
@js.native
object CreateFile extends js.Object {
  def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.CreateFile = js.native
  def create(uri: DocumentUri, options: CreateFileOptions): typings.vscodeLanguageserverTypes.mod.CreateFile = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.CreateFile */ Boolean = js.native
}

