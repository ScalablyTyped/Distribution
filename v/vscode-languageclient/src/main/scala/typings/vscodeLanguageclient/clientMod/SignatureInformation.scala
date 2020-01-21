package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "SignatureInformation")
@js.native
object SignatureInformation extends js.Object {
  def create(label: String): typings.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
  def create(
    label: String,
    documentation: String,
    parameters: typings.vscodeLanguageserverTypes.mod.ParameterInformation*
  ): typings.vscodeLanguageserverTypes.mod.SignatureInformation = js.native
}

