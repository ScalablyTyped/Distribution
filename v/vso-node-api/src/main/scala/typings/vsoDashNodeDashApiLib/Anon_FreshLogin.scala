package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FreshLogin extends js.Object {
  var freshLogin: scala.Double
  var login: scala.Double
  var noOption: scala.Double
  var selectAccount: scala.Double
}

object Anon_FreshLogin {
  @scala.inline
  def apply(freshLogin: scala.Double, login: scala.Double, noOption: scala.Double, selectAccount: scala.Double): Anon_FreshLogin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("freshLogin")(freshLogin)
    __obj.updateDynamic("login")(login)
    __obj.updateDynamic("noOption")(noOption)
    __obj.updateDynamic("selectAccount")(selectAccount)
    __obj.asInstanceOf[Anon_FreshLogin]
  }
}

