package typings.waitDashForDashExpect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var pass: Boolean
  def message(): String
}

object Anon_Message {
  @scala.inline
  def apply(message: () => String, pass: Boolean): Anon_Message = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction0(message), pass = pass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Message]
  }
}

