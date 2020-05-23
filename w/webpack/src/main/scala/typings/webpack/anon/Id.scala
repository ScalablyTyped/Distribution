package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: Double | String
  var identifier: String
  var name: String
  var profile: js.Any
}

object Id {
  @scala.inline
  def apply(id: Double | String, identifier: String, name: String, profile: js.Any): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

