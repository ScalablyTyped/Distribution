package typings.symphonyApiClientNode

import typings.symphonyApiClientNode.connectionsClientMod.Connection
import typings.symphonyApiClientNode.messagesClientMod.Message
import typings.symphonyApiClientNode.streamsClientMod.UserId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oboclientMod {
  
  @JSImport("symphony-api-client-node/OBOClient", "MESSAGEML_FORMAT")
  @js.native
  val MESSAGEML_FORMAT: String = js.native
  
  @JSImport("symphony-api-client-node/OBOClient", "PRESENTATIONML_FORMAT")
  @js.native
  val PRESENTATIONML_FORMAT: String = js.native
  
  @JSImport("symphony-api-client-node/OBOClient", "oboGetAllConnections")
  @js.native
  def oboGetAllConnections(status: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node/OBOClient", "oboGetConnection")
  @js.native
  def oboGetConnection(userId: String): js.Promise[Connection] = js.native
  
  @JSImport("symphony-api-client-node/OBOClient", "oboGetUserIMStreamId")
  @js.native
  def oboGetUserIMStreamId(userToken: String, userIds: js.Array[Double]): js.Promise[UserId] = js.native
  
  @JSImport("symphony-api-client-node/OBOClient", "oboSendMessage")
  @js.native
  def oboSendMessage(userToken: String, conversationId: String, message: String, data: js.Any, format: String): js.Promise[Message] = js.native
  
  @js.native
  trait OboUser extends StObject {
    
    var displayName: String = js.native
    
    var email: String = js.native
    
    var firstName: String = js.native
    
    var lastName: String = js.native
    
    var userId: String = js.native
    
    var username: String = js.native
  }
  object OboUser {
    
    @scala.inline
    def apply(
      displayName: String,
      email: String,
      firstName: String,
      lastName: String,
      userId: String,
      username: String
    ): OboUser = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[OboUser]
    }
    
    @scala.inline
    implicit class OboUserMutableBuilder[Self <: OboUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
