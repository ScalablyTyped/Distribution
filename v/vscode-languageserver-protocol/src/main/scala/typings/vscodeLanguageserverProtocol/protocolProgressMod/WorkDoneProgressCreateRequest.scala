package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.progress", "WorkDoneProgressCreateRequest")
@js.native
object WorkDoneProgressCreateRequest extends js.Object {
  val `type`: ProtocolRequestType[WorkDoneProgressCreateParams, Unit, scala.Nothing, Unit, Unit] = js.native
  type HandlerSignature = RequestHandler[WorkDoneProgressCreateParams, Unit, Unit]
}

