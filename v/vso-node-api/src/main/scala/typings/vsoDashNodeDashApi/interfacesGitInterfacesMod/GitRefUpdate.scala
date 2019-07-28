package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
    val __obj = js.Dynamic.literal(isLocked = isLocked, name = name, newObjectId = newObjectId, oldObjectId = oldObjectId, repositoryId = repositoryId)
  
    __obj.asInstanceOf[GitRefUpdate]
  }
}

