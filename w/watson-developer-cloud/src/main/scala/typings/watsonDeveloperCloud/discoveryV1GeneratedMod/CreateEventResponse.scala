package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

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
  
  inline def apply(): CreateEventResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEventResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEventResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: EventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
