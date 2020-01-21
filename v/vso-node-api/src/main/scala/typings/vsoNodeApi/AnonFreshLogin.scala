package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFreshLogin extends js.Object {
  var freshLogin: Double
  var login: Double
  var noOption: Double
  var selectAccount: Double
}

object AnonFreshLogin {
  @scala.inline
  def apply(freshLogin: Double, login: Double, noOption: Double, selectAccount: Double): AnonFreshLogin = {
    val __obj = js.Dynamic.literal(freshLogin = freshLogin.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], noOption = noOption.asInstanceOf[js.Any], selectAccount = selectAccount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFreshLogin]
  }
}

