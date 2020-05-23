package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestingUser extends js.Object {
  var requestingUser: scala.Double
  var serviceAccount: scala.Double
}

object RequestingUser {
  @scala.inline
  def apply(requestingUser: scala.Double, serviceAccount: scala.Double): RequestingUser = {
    val __obj = js.Dynamic.literal(requestingUser = requestingUser.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestingUser]
  }
}

