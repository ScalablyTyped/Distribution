package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.InitializeResult
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.protocolMod._InitializeParams
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod.WorkspaceFoldersInitializeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "InitializeRequest")
@js.native
object InitializeRequest extends js.Object {
  val `type`: ProtocolRequestType[
    _InitializeParams with WorkspaceFoldersInitializeParams with WorkDoneProgressParams, 
    InitializeResult[js.Any], 
    scala.Nothing, 
    typings.vscodeLanguageserverProtocol.protocolMod.InitializeError, 
    Unit
  ] = js.native
}

