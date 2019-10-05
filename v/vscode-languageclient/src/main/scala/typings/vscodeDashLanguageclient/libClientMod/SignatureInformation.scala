package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ParameterInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "SignatureInformation")
@js.native
object SignatureInformation extends js.Object {
  def create(label: String): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SignatureInformation = js.native
  def create(label: String, documentation: String, parameters: ParameterInformation*): typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SignatureInformation = js.native
}

