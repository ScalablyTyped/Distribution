package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoomMember extends StObject {
  
  var id: Double
  
  var joinDate: js.UndefOr[Double] = js.undefined
  
  var owner: js.UndefOr[Boolean] = js.undefined
}
object RoomMember {
  
  inline def apply(id: Double): RoomMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoomMember] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJoinDate(value: Double): Self = StObject.set(x, "joinDate", value.asInstanceOf[js.Any])
    
    inline def setJoinDateUndefined: Self = StObject.set(x, "joinDate", js.undefined)
    
    inline def setOwner(value: Boolean): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
