package typings.vscodeLanguageserver.progressMod

import typings.vscodeJsonrpc.mod.ProgressToken
import typings.vscodeLanguageserverProtocol.mod.ProgressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressContext extends js.Object {
  def sendProgress[P](`type`: ProgressType[P], token: ProgressToken, value: P): Unit = js.native
}

object ProgressContext {
  @scala.inline
  def apply(sendProgress: (ProgressType[js.Any], ProgressToken, js.Any) => Unit): ProgressContext = {
    val __obj = js.Dynamic.literal(sendProgress = js.Any.fromFunction3(sendProgress))
    __obj.asInstanceOf[ProgressContext]
  }
  @scala.inline
  implicit class ProgressContextOps[Self <: ProgressContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSendProgress(value: (ProgressType[js.Any], ProgressToken, js.Any) => Unit): Self = this.set("sendProgress", js.Any.fromFunction3(value))
  }
  
}

