package typings.superagent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deadline extends js.Object {
  var deadline: js.UndefOr[Double] = js.native
  var response: js.UndefOr[Double] = js.native
}

object Deadline {
  @scala.inline
  def apply(): Deadline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deadline]
  }
  @scala.inline
  implicit class DeadlineOps[Self <: Deadline] (val x: Self) extends AnyVal {
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
    def setDeadline(value: Double): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeadline: Self = this.set("deadline", js.undefined)
    @scala.inline
    def setResponse(value: Double): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

