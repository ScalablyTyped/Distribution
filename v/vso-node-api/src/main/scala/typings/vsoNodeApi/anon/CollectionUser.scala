package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionUser extends js.Object {
  var collection_User: scala.Double
  var project_Team: scala.Double
}

object CollectionUser {
  @scala.inline
  def apply(collection_User: scala.Double, project_Team: scala.Double): CollectionUser = {
    val __obj = js.Dynamic.literal(collection_User = collection_User.asInstanceOf[js.Any], project_Team = project_Team.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionUser]
  }
}

