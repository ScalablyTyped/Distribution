package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType
import typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod.CodeLens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "CodeLensRequest")
@js.native
object CodeLensRequestNs extends js.Object {
  val `type`: RequestType[CodeLensParams, js.Array[CodeLens] | Null, Unit, CodeLensRegistrationOptions] = js.native
}

