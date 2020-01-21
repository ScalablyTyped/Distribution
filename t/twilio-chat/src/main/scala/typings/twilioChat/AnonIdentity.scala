package typings.twilioChat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdentity extends js.Object {
  var identity: String
  var user: String
}

object AnonIdentity {
  @scala.inline
  def apply(identity: String, user: String): AnonIdentity = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdentity]
  }
}

