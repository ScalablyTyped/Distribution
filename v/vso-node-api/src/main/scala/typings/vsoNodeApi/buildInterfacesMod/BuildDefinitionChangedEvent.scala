package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildDefinitionChangedEvent extends StObject {
  
  var changeType: AuditAction
  
  var definition: BuildDefinition
}
object BuildDefinitionChangedEvent {
  
  inline def apply(changeType: AuditAction, definition: BuildDefinition): BuildDefinitionChangedEvent = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionChangedEvent]
  }
  
  extension [Self <: BuildDefinitionChangedEvent](x: Self) {
    
    inline def setChangeType(value: AuditAction): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: BuildDefinition): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
  }
}
