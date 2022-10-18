package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineIterationStatus extends StObject {
  
  var message: String
  
  var `type`: TimelineIterationStatusCode
}
object TimelineIterationStatus {
  
  inline def apply(message: String, `type`: TimelineIterationStatusCode): TimelineIterationStatus = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineIterationStatus]
  }
  
  extension [Self <: TimelineIterationStatus](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: TimelineIterationStatusCode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
