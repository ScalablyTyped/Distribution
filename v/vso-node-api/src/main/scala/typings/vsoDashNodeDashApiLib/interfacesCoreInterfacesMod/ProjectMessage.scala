package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectMessage extends js.Object {
  var project: ProjectInfo
  var projectChangeType: ProjectChangeType
  var shouldInvalidateSystemStore: scala.Boolean
}

object ProjectMessage {
  @scala.inline
  def apply(
    project: ProjectInfo,
    projectChangeType: ProjectChangeType,
    shouldInvalidateSystemStore: scala.Boolean
  ): ProjectMessage = {
    val __obj = js.Dynamic.literal(project = project, projectChangeType = projectChangeType, shouldInvalidateSystemStore = shouldInvalidateSystemStore)
  
    __obj.asInstanceOf[ProjectMessage]
  }
}

