package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionChangingEvent extends js.Object {
  var changeType: AuditAction
  var newDefinition: BuildDefinition
  var originalDefinition: BuildDefinition
}

object BuildDefinitionChangingEvent {
  @scala.inline
  def apply(changeType: AuditAction, newDefinition: BuildDefinition, originalDefinition: BuildDefinition): BuildDefinitionChangingEvent = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], newDefinition = newDefinition.asInstanceOf[js.Any], originalDefinition = originalDefinition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BuildDefinitionChangingEvent]
  }
}

