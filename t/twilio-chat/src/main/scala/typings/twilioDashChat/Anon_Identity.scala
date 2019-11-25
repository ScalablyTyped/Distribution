package typings.twilioDashChat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identity extends js.Object {
  var identity: String
  var user: String
}

object Anon_Identity {
  @scala.inline
  def apply(identity: String, user: String): Anon_Identity = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Identity]
  }
}

