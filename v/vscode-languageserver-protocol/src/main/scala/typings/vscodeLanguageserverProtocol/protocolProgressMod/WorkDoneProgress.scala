package typings.vscodeLanguageserverProtocol.protocolProgressMod

import typings.vscodeJsonrpc.mod.ProgressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.progress", "WorkDoneProgress")
@js.native
object WorkDoneProgress extends js.Object {
  val `type`: ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
}

