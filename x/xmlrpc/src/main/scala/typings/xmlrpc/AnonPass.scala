package typings.xmlrpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPass extends js.Object {
  var pass: String
  var user: String
}

object AnonPass {
  @scala.inline
  def apply(pass: String, user: String): AnonPass = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPass]
  }
}

