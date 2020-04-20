package typings.vsoNodeApi.buildInterfacesMod

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
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionChangedEvent]
  }
}

