package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSetServerQueryLogin extends js.Object {
  var client_login_password: String
}

object ClientSetServerQueryLogin {
  @scala.inline
  def apply(client_login_password: String): ClientSetServerQueryLogin = {
    val __obj = js.Dynamic.literal(client_login_password = client_login_password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientSetServerQueryLogin]
  }
}

