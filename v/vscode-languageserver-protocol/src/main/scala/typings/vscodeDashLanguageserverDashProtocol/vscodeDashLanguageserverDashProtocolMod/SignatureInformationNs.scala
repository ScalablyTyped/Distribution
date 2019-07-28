package typings.vscodeDashLanguageserverDashProtocol.vscodeDashLanguageserverDashProtocolMod

import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ParameterInformation
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.SignatureInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "SignatureInformation")
@js.native
object SignatureInformationNs extends js.Object {
  def create(label: String): SignatureInformation = js.native
  def create(label: String, documentation: String, parameters: ParameterInformation*): SignatureInformation = js.native
}

