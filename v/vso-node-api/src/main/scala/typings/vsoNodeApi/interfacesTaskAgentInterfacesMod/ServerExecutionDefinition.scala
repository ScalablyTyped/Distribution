package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerExecutionDefinition extends StObject {
  
  var events: JobEventsConfig
}
object ServerExecutionDefinition {
  
  inline def apply(events: JobEventsConfig): ServerExecutionDefinition = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerExecutionDefinition]
  }
  
  extension [Self <: ServerExecutionDefinition](x: Self) {
    
    inline def setEvents(value: JobEventsConfig): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
  }
}
