package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendJobResponse extends StObject {
  
  var events: JobEventsConfig = js.native
  
  var variables: StringDictionary[String] = js.native
}
object SendJobResponse {
  
  @scala.inline
  def apply(events: JobEventsConfig, variables: StringDictionary[String]): SendJobResponse = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendJobResponse]
  }
  
  @scala.inline
  implicit class SendJobResponseMutableBuilder[Self <: SendJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: JobEventsConfig): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(value: StringDictionary[String]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
