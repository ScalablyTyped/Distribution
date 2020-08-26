package typings.uws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reason extends js.Object {
  var code: Double = js.native
  var reason: String = js.native
  var target: this.type = js.native
  var wasClean: Boolean = js.native
}

object Reason {
  @scala.inline
  def apply(code: Double, reason: String, target: Reason, wasClean: Boolean): Reason = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], wasClean = wasClean.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  @scala.inline
  implicit class ReasonOps[Self <: Reason] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Reason): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setWasClean(value: Boolean): Self = this.set("wasClean", value.asInstanceOf[js.Any])
  }
  
}

