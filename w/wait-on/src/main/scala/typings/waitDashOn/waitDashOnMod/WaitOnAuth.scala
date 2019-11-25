package typings.waitDashOn.waitDashOnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.waitDashOn.Anon_Password
  - typings.waitDashOn.Anon_Pass
*/
trait WaitOnAuth extends js.Object

object WaitOnAuth {
  @scala.inline
  def Anon_Password(password: String, username: String): WaitOnAuth = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaitOnAuth]
  }
  @scala.inline
  def Anon_Pass(pass: String, user: String): WaitOnAuth = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaitOnAuth]
  }
}

