package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequestingUser extends js.Object {
  var requestingUser: Double
  var serviceAccount: Double
}

object AnonRequestingUser {
  @scala.inline
  def apply(requestingUser: Double, serviceAccount: Double): AnonRequestingUser = {
    val __obj = js.Dynamic.literal(requestingUser = requestingUser.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequestingUser]
  }
}

