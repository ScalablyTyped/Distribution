package typings.vscodeLanguageclient.clientMod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashreferences
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.ReferenceParams
import typings.vscodeLanguageserverProtocol.protocolMod.ReferenceRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient/lib/client", "ReferencesRequest")
@js.native
object ReferencesRequest extends js.Object {
  val method: textDocumentSlashreferences = js.native
  /** @deprecated Use ReferencesRequest.type */
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[js.Array[typings.vscodeLanguageserverTypes.mod.Location]] = js.native
  val `type`: ProtocolRequestType[
    ReferenceParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.Location] | Null, 
    js.Array[typings.vscodeLanguageserverTypes.mod.Location], 
    Unit, 
    ReferenceRegistrationOptions
  ] = js.native
}

