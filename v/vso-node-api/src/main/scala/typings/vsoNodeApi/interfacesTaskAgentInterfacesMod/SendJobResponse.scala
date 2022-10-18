package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendJobResponse extends StObject {
  
  var events: JobEventsConfig
  
  var variables: StringDictionary[String]
}
object SendJobResponse {
  
  inline def apply(events: JobEventsConfig, variables: StringDictionary[String]): SendJobResponse = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendJobResponse]
  }
  
  extension [Self <: SendJobResponse](x: Self) {
    
    inline def setEvents(value: JobEventsConfig): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
