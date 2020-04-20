package typings.waitOn

import typings.waitOn.mod.WaitOnAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPass extends WaitOnAuth {
  /**
    * Alias of password
    */
  var pass: String
  /**
    * Alias of username
    */
  var user: String
}

object AnonPass {
  @scala.inline
  def apply(pass: String, user: String): AnonPass = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPass]
  }
}

