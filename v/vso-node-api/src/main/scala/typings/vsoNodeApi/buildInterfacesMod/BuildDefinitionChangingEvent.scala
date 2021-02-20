package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionChangingEvent extends StObject {
  
  var changeType: AuditAction = js.native
  
  var newDefinition: BuildDefinition = js.native
  
  var originalDefinition: BuildDefinition = js.native
}
object BuildDefinitionChangingEvent {
  
  @scala.inline
  def apply(changeType: AuditAction, newDefinition: BuildDefinition, originalDefinition: BuildDefinition): BuildDefinitionChangingEvent = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], newDefinition = newDefinition.asInstanceOf[js.Any], originalDefinition = originalDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionChangingEvent]
  }
  
  @scala.inline
  implicit class BuildDefinitionChangingEventMutableBuilder[Self <: BuildDefinitionChangingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: AuditAction): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDefinition(value: BuildDefinition): Self = StObject.set(x, "newDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalDefinition(value: BuildDefinition): Self = StObject.set(x, "originalDefinition", value.asInstanceOf[js.Any])
  }
}
