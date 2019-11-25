package typings.tgfancy.tgfancyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedUser extends ResolvedChat {
  var first_name: String
  var last_name: js.UndefOr[String] = js.undefined
}

object ResolvedUser {
  @scala.inline
  def apply(
    first_name: String,
    id: Double | String,
    `type`: String,
    username: String,
    when: String,
    last_name: String = null
  ): ResolvedUser = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedUser]
  }
}

