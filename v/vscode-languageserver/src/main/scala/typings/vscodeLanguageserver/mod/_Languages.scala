package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.progressMod.ResultProgress
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Languages extends js.Object {
  var connection: IConnection
  def attachPartialResultProgress[PR](`type`: typings.vscodeLanguageserverProtocol.mod.ProgressType[PR], params: PartialResultParams): js.UndefOr[ResultProgress[PR]]
  def attachWorkDoneProgress(params: WorkDoneProgressParams): typings.vscodeLanguageserver.progressMod.WorkDoneProgress
}

object _Languages {
  @scala.inline
  def apply(
    attachPartialResultProgress: (typings.vscodeLanguageserverProtocol.mod.ProgressType[js.Any], PartialResultParams) => js.UndefOr[ResultProgress[js.Any]],
    attachWorkDoneProgress: WorkDoneProgressParams => typings.vscodeLanguageserver.progressMod.WorkDoneProgress,
    connection: IConnection
  ): _Languages = {
    val __obj = js.Dynamic.literal(attachPartialResultProgress = js.Any.fromFunction2(attachPartialResultProgress), attachWorkDoneProgress = js.Any.fromFunction1(attachWorkDoneProgress), connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Languages]
  }
}

