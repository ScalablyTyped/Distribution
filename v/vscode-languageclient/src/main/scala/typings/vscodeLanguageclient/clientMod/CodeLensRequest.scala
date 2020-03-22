package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.CodeLensParams
import typings.vscodeLanguageserverProtocol.protocolMod.CodeLensRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "CodeLensRequest")
@js.native
object CodeLensRequest extends js.Object {
  /** @deprecated Use CodeLensRequest.type */
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens]] = js.native
  val `type`: ProtocolRequestType[
    CodeLensParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.CodeLens], 
    Unit, 
    CodeLensRegistrationOptions
  ] = js.native
}

