package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Chat room info
  */
@js.native
trait ChatRoomInfo extends StObject {
  
  /**
    * Creation date
    */
  var creationdate: String = js.native
  
  /**
    * Room description
    */
  var description: String = js.native
  
  /**
    * Number of chat room participants
    */
  var occupants: Double = js.native
  
  /**
    * Room's name / subject
    */
  var subject: String = js.native
}
object ChatRoomInfo {
  
  @scala.inline
  def apply(creationdate: String, description: String, occupants: Double, subject: String): ChatRoomInfo = {
    val __obj = js.Dynamic.literal(creationdate = creationdate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], occupants = occupants.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoomInfo]
  }
  
  @scala.inline
  implicit class ChatRoomInfoMutableBuilder[Self <: ChatRoomInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationdate(value: String): Self = StObject.set(x, "creationdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupants(value: Double): Self = StObject.set(x, "occupants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
