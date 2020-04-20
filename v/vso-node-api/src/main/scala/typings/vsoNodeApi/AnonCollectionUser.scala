package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollectionUser extends js.Object {
  var collection_User: Double
  var project_Team: Double
}

object AnonCollectionUser {
  @scala.inline
  def apply(collection_User: Double, project_Team: Double): AnonCollectionUser = {
    val __obj = js.Dynamic.literal(collection_User = collection_User.asInstanceOf[js.Any], project_Team = project_Team.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollectionUser]
  }
}

