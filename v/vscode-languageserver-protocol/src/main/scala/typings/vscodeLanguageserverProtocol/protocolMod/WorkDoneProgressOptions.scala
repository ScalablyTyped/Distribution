package typings.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkDoneProgressOptions extends js.Object {
  var workDoneProgress: js.UndefOr[Boolean] = js.undefined
}

@JSImport("vscode-languageserver-protocol/lib/protocol", "WorkDoneProgressOptions")
@js.native
object WorkDoneProgressOptions extends js.Object {
  def hasWorkDoneProgress(value: js.Any): /* is vscode-languageserver-protocol.anon.WorkDoneProgress */ Boolean = js.native
  def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.WorkDoneProgressOptions */ Boolean = js.native
}

