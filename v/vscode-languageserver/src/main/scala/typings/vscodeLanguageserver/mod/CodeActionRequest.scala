package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashcodeAction
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.CodeActionParams
import typings.vscodeLanguageserverProtocol.protocolMod.CodeActionRegistrationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "CodeActionRequest")
@js.native
object CodeActionRequest extends js.Object {
  val method: textDocumentSlashcodeAction = js.native
  /** @deprecated Use CodeActionRequest.type */
  val resultType: typings.vscodeJsonrpc.mod.ProgressType[
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Command | typings.vscodeLanguageserverTypes.mod.CodeAction
    ]
  ] = js.native
  val `type`: ProtocolRequestType[
    CodeActionParams, 
    (js.Array[
      typings.vscodeLanguageserverTypes.mod.Command | typings.vscodeLanguageserverTypes.mod.CodeAction
    ]) | Null, 
    js.Array[
      typings.vscodeLanguageserverTypes.mod.Command | typings.vscodeLanguageserverTypes.mod.CodeAction
    ], 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}

