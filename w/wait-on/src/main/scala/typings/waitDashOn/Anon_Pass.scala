package typings.waitDashOn

import typings.waitDashOn.waitDashOnMod.WaitOnAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pass extends WaitOnAuth {
  /**
    * Alias of password
    */
  var pass: String
  /**
    * Alias of username
    */
  var user: String
}

object Anon_Pass {
  @scala.inline
  def apply(pass: String, user: String): Anon_Pass = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Pass]
  }
}

