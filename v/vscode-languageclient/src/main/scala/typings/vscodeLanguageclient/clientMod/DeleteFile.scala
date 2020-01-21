package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverTypes.mod.DeleteFileOptions
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DeleteFile")
@js.native
object DeleteFile extends js.Object {
  def create(uri: DocumentUri): typings.vscodeLanguageserverTypes.mod.DeleteFile = js.native
  def create(uri: DocumentUri, options: DeleteFileOptions): typings.vscodeLanguageserverTypes.mod.DeleteFile = js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DeleteFile */ Boolean = js.native
}

