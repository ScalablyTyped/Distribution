package typings
package waitDashOnLib.waitDashOnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitOnAuth extends js.Object {
  /**
    * Alias of password
    */
  var pass: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Alias of username
    */
  var user: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object WaitOnAuth {
  @scala.inline
  def apply(
    pass: java.lang.String = null,
    password: java.lang.String = null,
    user: java.lang.String = null,
    username: java.lang.String = null
  ): WaitOnAuth = {
    val __obj = js.Dynamic.literal()
    if (pass != null) __obj.updateDynamic("pass")(pass)
    if (password != null) __obj.updateDynamic("password")(password)
    if (user != null) __obj.updateDynamic("user")(user)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[WaitOnAuth]
  }
}

