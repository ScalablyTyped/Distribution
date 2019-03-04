package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionChangedEvent extends js.Object {
  var changeType: AuditAction
  var definition: BuildDefinition
}

object BuildDefinitionChangedEvent {
  @scala.inline
  def apply(changeType: AuditAction, definition: BuildDefinition): BuildDefinitionChangedEvent = {
    val __obj = js.Dynamic.literal(changeType = changeType, definition = definition)
  
    __obj.asInstanceOf[BuildDefinitionChangedEvent]
  }
}

