package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineTeamStatus extends StObject {
  
  var message: String
  
  var `type`: TimelineTeamStatusCode
}
object TimelineTeamStatus {
  
  inline def apply(message: String, `type`: TimelineTeamStatusCode): TimelineTeamStatus = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineTeamStatus]
  }
  
  extension [Self <: TimelineTeamStatus](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: TimelineTeamStatusCode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
