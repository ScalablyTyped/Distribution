package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.watsonDeveloperCloud.v1GeneratedMod.CreateEventConstants.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `createEvent` operation. */
trait CreateEventParams extends StObject {
  
  /** Query event data object. */
  var data: EventData
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** The event type to be created. */
  var `type`: Type | String
}
object CreateEventParams {
  
  inline def apply(data: EventData, `type`: Type | String): CreateEventParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventParams]
  }
  
  extension [Self <: CreateEventParams](x: Self) {
    
    inline def setData(value: EventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setType(value: Type | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
