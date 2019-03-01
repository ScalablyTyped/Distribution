package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRefUpdate extends js.Object {
  var isLocked: scala.Boolean
  var name: java.lang.String
  var newObjectId: java.lang.String
  var oldObjectId: java.lang.String
  var repositoryId: java.lang.String
}

object GitRefUpdate {
  @scala.inline
  def apply(
    isLocked: scala.Boolean,
    name: java.lang.String,
    newObjectId: java.lang.String,
    oldObjectId: java.lang.String,
    repositoryId: java.lang.String
  ): GitRefUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isLocked")(isLocked)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("newObjectId")(newObjectId)
    __obj.updateDynamic("oldObjectId")(oldObjectId)
    __obj.updateDynamic("repositoryId")(repositoryId)
    __obj.asInstanceOf[GitRefUpdate]
  }
}

