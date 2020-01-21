package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "DocumentLink")
@js.native
object DocumentLink extends js.Object {
  /**
    * Creates a new DocumentLink literal.
    */
  def create(range: typings.vscodeLanguageserverTypes.mod.Range): typings.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  def create(range: typings.vscodeLanguageserverTypes.mod.Range, target: String): typings.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  def create(range: typings.vscodeLanguageserverTypes.mod.Range, target: String, data: js.Any): typings.vscodeLanguageserverTypes.mod.DocumentLink = js.native
  /**
    * Checks whether the given literal conforms to the [DocumentLink](#DocumentLink) interface.
    */
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean = js.native
}

