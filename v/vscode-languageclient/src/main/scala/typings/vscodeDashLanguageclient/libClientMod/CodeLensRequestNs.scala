package typings.vscodeDashLanguageclient.libClientMod

import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.CodeLensParams
import typings.vscodeDashLanguageserverDashProtocol.libProtocolMod.CodeLensRegistrationOptions
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CodeLensRequest")
@js.native
object CodeLensRequestNs extends js.Object {
  val `type`: typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType[CodeLensParams, js.Array[CodeLens] | Null, Unit, CodeLensRegistrationOptions] = js.native
}

