package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomSystemInfo extends StObject {
  
  var active: Boolean
  
  var createdByUserId: Double
  
  var creationDate: Double
  
  var id: String
}
object RoomSystemInfo {
  
  inline def apply(active: Boolean, createdByUserId: Double, creationDate: Double, id: String): RoomSystemInfo = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], createdByUserId = createdByUserId.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomSystemInfo]
  }
  
  extension [Self <: RoomSystemInfo](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUserId(value: Double): Self = StObject.set(x, "createdByUserId", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
