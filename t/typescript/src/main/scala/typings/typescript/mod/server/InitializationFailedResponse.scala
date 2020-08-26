package typings.typescript.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializationFailedResponse extends TypingInstallerResponse {
  @JSName("kind")
  val kind_InitializationFailedResponse: EventInitializationFailed = js.native
  val message: String = js.native
}

object InitializationFailedResponse {
  @scala.inline
  def apply(kind: EventInitializationFailed, message: String): InitializationFailedResponse = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializationFailedResponse]
  }
  @scala.inline
  implicit class InitializationFailedResponseOps[Self <: InitializationFailedResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: EventInitializationFailed): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

