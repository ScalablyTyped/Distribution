package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionChangedEvent extends js.Object {
  
  var changeType: AuditAction = js.native
  
  var definition: BuildDefinition = js.native
}
object BuildDefinitionChangedEvent {
  
  @scala.inline
  def apply(changeType: AuditAction, definition: BuildDefinition): BuildDefinitionChangedEvent = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionChangedEvent]
  }
  
  @scala.inline
  implicit class BuildDefinitionChangedEventOps[Self <: BuildDefinitionChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeType(value: AuditAction): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: BuildDefinition): Self = this.set("definition", value.asInstanceOf[js.Any])
  }
}
