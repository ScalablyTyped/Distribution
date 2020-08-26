package typings.websql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// synchronous database API error
@js.native
trait SQLException extends js.Object {
   // = 7;
  var code: Double = js.native
  var message: DOMString = js.native
}

object SQLException {
  @scala.inline
  def apply(code: Double, message: DOMString): SQLException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLException]
  }
  @scala.inline
  implicit class SQLExceptionOps[Self <: SQLException] (val x: Self) extends AnyVal {
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
    def setMessage(value: DOMString): Self = this.set("message", value.asInstanceOf[js.Any])
  }
  
}

