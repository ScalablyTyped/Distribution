package typings.webdriverio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attempts extends js.Object {
  var attempts: Double = js.native
  var limit: Double = js.native
}

object Attempts {
  @scala.inline
  def apply(attempts: Double, limit: Double): Attempts = {
    val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempts]
  }
  @scala.inline
  implicit class AttemptsOps[Self <: Attempts] (val x: Self) extends AnyVal {
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
    def setAttempts(value: Double): Self = this.set("attempts", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
  }
  
}

