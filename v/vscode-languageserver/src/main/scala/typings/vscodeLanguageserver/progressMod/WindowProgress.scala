package typings.vscodeLanguageserver.progressMod

import typings.vscodeJsonrpc.mod.ProgressToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowProgress extends js.Object {
  def attachWorkDoneProgress(): WorkDoneProgress = js.native
  def attachWorkDoneProgress(token: ProgressToken): WorkDoneProgress = js.native
  def createWorkDoneProgress(): js.Promise[WorkDoneProgress] = js.native
}

