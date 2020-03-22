package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressBegin
import typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressEnd
import typings.vscodeLanguageserverProtocol.protocolProgressMod.WorkDoneProgressReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "WorkDoneProgress")
@js.native
object WorkDoneProgress extends js.Object {
  val `type`: typings.vscodeJsonrpc.mod.ProgressType[WorkDoneProgressBegin | WorkDoneProgressReport | WorkDoneProgressEnd] = js.native
}

