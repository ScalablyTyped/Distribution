package typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectMessage extends js.Object {
  var project: ProjectInfo
  var projectChangeType: ProjectChangeType
  var shouldInvalidateSystemStore: Boolean
}

object ProjectMessage {
  @scala.inline
  def apply(project: ProjectInfo, projectChangeType: ProjectChangeType, shouldInvalidateSystemStore: Boolean): ProjectMessage = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], projectChangeType = projectChangeType.asInstanceOf[js.Any], shouldInvalidateSystemStore = shouldInvalidateSystemStore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectMessage]
  }
}

