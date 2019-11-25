package typings.tgfancy.tgfancyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedGroupOrChannel extends ResolvedChat {
  var title: String
}

object ResolvedGroupOrChannel {
  @scala.inline
  def apply(id: Double | String, title: String, `type`: String, username: String, when: String): ResolvedGroupOrChannel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedGroupOrChannel]
  }
}

