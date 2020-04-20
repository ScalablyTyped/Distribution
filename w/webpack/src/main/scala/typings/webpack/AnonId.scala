package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: Double | String
  var identifier: String
  var name: String
  var profile: js.Any
}

object AnonId {
  @scala.inline
  def apply(id: Double | String, identifier: String, name: String, profile: js.Any): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

