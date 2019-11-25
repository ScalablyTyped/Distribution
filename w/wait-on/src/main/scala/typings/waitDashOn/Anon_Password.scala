package typings.waitDashOn

import typings.waitDashOn.waitDashOnMod.WaitOnAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Password extends WaitOnAuth {
  var password: String
  var username: String
}

object Anon_Password {
  @scala.inline
  def apply(password: String, username: String): Anon_Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Password]
  }
}

