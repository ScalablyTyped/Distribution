package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotColorProviderMod.DocumentColorParams
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.ColorInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "DocumentColorRequest")
@js.native
object DocumentColorRequest extends js.Object {
  val `type`: RequestType[DocumentColorParams, js.Array[ColorInformation], Unit, TextDocumentRegistrationOptions] = js.native
}

