package typings.styletronReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackInfo extends js.Object {
  var message: String = js.native
  var stack: js.UndefOr[String] = js.native
  var stacktrace: js.Any = js.native
}

object StackInfo {
  @scala.inline
  def apply(message: String, stacktrace: js.Any): StackInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stacktrace = stacktrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackInfo]
  }
  @scala.inline
  implicit class StackInfoOps[Self <: StackInfo] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStacktrace(value: js.Any): Self = this.set("stacktrace", value.asInstanceOf[js.Any])
    @scala.inline
    def setStack(value: String): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

