package typings.tgfancy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedChat extends js.Object {
  var id: Double | String
  var `type`: String
  var username: String
  var when: String
}

object ResolvedChat {
  @scala.inline
  def apply(id: Double | String, `type`: String, username: String, when: String): ResolvedChat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedChat]
  }
}

