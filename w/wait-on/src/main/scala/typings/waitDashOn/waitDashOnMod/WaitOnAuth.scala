package typings.waitDashOn.waitDashOnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitOnAuth extends js.Object {
  /**
    * Alias of password
    */
  var pass: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  /**
    * Alias of username
    */
  var user: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object WaitOnAuth {
  @scala.inline
  def apply(pass: String = null, password: String = null, user: String = null, username: String = null): WaitOnAuth = {
    val __obj = js.Dynamic.literal()
    if (pass != null) __obj.updateDynamic("pass")(pass)
    if (password != null) __obj.updateDynamic("password")(password)
    if (user != null) __obj.updateDynamic("user")(user)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[WaitOnAuth]
  }
}

