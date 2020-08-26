package typings.vastClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timeout extends js.Object {
  var timeout: Double = js.native
  var withCredentials: Boolean = js.native
}

object Timeout {
  @scala.inline
  def apply(timeout: Double, withCredentials: Boolean): Timeout = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
  @scala.inline
  implicit class TimeoutOps[Self <: Timeout] (val x: Self) extends AnyVal {
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
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
  }
  
}

