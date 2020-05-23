package typings.waitOn.anon

import typings.waitOn.mod.WaitOnAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pass extends WaitOnAuth {
  /**
    * Alias of password
    */
  var pass: String
  /**
    * Alias of username
    */
  var user: String
}

object Pass {
  @scala.inline
  def apply(pass: String, user: String): Pass = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pass]
  }
}

