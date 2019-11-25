package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RequestingUser extends js.Object {
  var requestingUser: Double
  var serviceAccount: Double
}

object Anon_RequestingUser {
  @scala.inline
  def apply(requestingUser: Double, serviceAccount: Double): Anon_RequestingUser = {
    val __obj = js.Dynamic.literal(requestingUser = requestingUser.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_RequestingUser]
  }
}

