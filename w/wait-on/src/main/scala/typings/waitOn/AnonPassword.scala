package typings.waitOn

import typings.waitOn.mod.WaitOnAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassword extends WaitOnAuth {
  var password: String
  var username: String
}

object AnonPassword {
  @scala.inline
  def apply(password: String, username: String): AnonPassword = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPassword]
  }
}

