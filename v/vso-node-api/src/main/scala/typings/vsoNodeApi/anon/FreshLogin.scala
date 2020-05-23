package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FreshLogin extends js.Object {
  var freshLogin: scala.Double
  var login: scala.Double
  var noOption: scala.Double
  var selectAccount: scala.Double
}

object FreshLogin {
  @scala.inline
  def apply(freshLogin: scala.Double, login: scala.Double, noOption: scala.Double, selectAccount: scala.Double): FreshLogin = {
    val __obj = js.Dynamic.literal(freshLogin = freshLogin.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], noOption = noOption.asInstanceOf[js.Any], selectAccount = selectAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreshLogin]
  }
}

