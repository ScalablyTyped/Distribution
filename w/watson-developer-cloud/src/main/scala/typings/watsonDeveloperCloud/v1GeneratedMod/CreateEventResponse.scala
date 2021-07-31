package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object defining the event being created. */
trait CreateEventResponse extends StObject {
  
  /** Query event data object. */
  var data: js.UndefOr[EventData] = js.undefined
  
  /** The event type that was created. */
  var `type`: js.UndefOr[String] = js.undefined
}
object CreateEventResponse {
  
  @scala.inline
  def apply(): CreateEventResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventResponse]
  }
  
  @scala.inline
  implicit class CreateEventResponseMutableBuilder[Self <: CreateEventResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: EventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
