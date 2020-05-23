package typings.twilioChat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  var identity: String
  var user: String
}

object Identity {
  @scala.inline
  def apply(identity: String, user: String): Identity = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}

