package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

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
    val __obj = js.Dynamic.literal(changeType = changeType, newDefinition = newDefinition, originalDefinition = originalDefinition)
  
    __obj.asInstanceOf[BuildDefinitionChangingEvent]
  }
}

