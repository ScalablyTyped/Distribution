package typings.vscodeLanguageserver.progressMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressContext extends js.Object {
  def sendProgress[P](`type`: ProgressType[P], token: ProgressToken, value: P): Unit
}

object ProgressContext {
  @scala.inline
  def apply(sendProgress: (ProgressType[js.Any], ProgressToken, js.Any) => Unit): ProgressContext = {
    val __obj = js.Dynamic.literal(sendProgress = js.Any.fromFunction3(sendProgress))
    __obj.asInstanceOf[ProgressContext]
  }
}

