package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRefUpdate extends js.Object {
  var isLocked: Boolean
  var name: String
  var newObjectId: String
  var oldObjectId: String
  var repositoryId: String
}

object GitRefUpdate {
  @scala.inline
  def apply(isLocked: Boolean, name: String, newObjectId: String, oldObjectId: String, repositoryId: String): GitRefUpdate = {
    val __obj = js.Dynamic.literal(isLocked = isLocked.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newObjectId = newObjectId.asInstanceOf[js.Any], oldObjectId = oldObjectId.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitRefUpdate]
  }
}

