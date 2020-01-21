package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.protocolMod.InitializeParams
import typings.vscodeLanguageserverProtocol.protocolMod.InitializeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "InitializeRequest")
@js.native
object InitializeRequest extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.RequestType[
    InitializeParams, 
    InitializeResult, 
    typings.vscodeLanguageserverProtocol.protocolMod.InitializeError, 
    Unit
  ] = js.native
}

