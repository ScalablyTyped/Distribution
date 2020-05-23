package typings.xmlrpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pass extends js.Object {
  var pass: String
  var user: String
}

object Pass {
  @scala.inline
  def apply(pass: String, user: String): Pass = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pass]
  }
}

