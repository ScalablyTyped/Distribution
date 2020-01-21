package typings.waitOn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.waitOn.AnonPassword
  - typings.waitOn.AnonPass
*/
trait WaitOnAuth extends js.Object

object WaitOnAuth {
  @scala.inline
  def AnonPassword(password: String, username: String): WaitOnAuth = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaitOnAuth]
  }
  @scala.inline
  def AnonPass(pass: String, user: String): WaitOnAuth = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaitOnAuth]
  }
}

