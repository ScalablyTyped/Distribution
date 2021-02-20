package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Chat room
  */
@js.native
trait ChatRoom extends StObject {
  
  /**
    * Chat room id
    */
  var id: String = js.native
  
  /**
    * Chat room password
    */
  var pass: String = js.native
}
object ChatRoom {
  
  @scala.inline
  def apply(id: String, pass: String): ChatRoom = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatRoom]
  }
  
  @scala.inline
  implicit class ChatRoomMutableBuilder[Self <: ChatRoom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
  }
}
