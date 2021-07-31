package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerExecutionDefinition extends StObject {
  
  var events: JobEventsConfig
}
object ServerExecutionDefinition {
  
  @scala.inline
  def apply(events: JobEventsConfig): ServerExecutionDefinition = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerExecutionDefinition]
  }
  
  @scala.inline
  implicit class ServerExecutionDefinitionMutableBuilder[Self <: ServerExecutionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: JobEventsConfig): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
  }
}
