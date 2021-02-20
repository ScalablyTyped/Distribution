package typings.symphonyApiClientNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presenceClientMod {
  
  @JSImport("symphony-api-client-node/PresenceClient", "STATUS_AVAILABLE")
  @js.native
  val STATUS_AVAILABLE: String = js.native
  
  @JSImport("symphony-api-client-node/PresenceClient", "STATUS_AWAY")
  @js.native
  val STATUS_AWAY: String = js.native
  
  @JSImport("symphony-api-client-node/PresenceClient", "STATUS_BE_RIGHT_BACK")
  @js.native
  val STATUS_BE_RIGHT_BACK: String = js.native
  
  @JSImport("symphony-api-client-node/PresenceClient", "STATUS_BUSY")
  @js.native
  val STATUS_BUSY: String = js.native
  
  @JSImport("symphony-api-client-node/PresenceClient", "STATUS_IN_A_MEETING")
  @js.native
  val STATUS_IN_A_MEETING: String = js.native
  
  @JSImport("symphony-api-client-node/PresenceClient", "STATUS_OFF_WORK")
  @js.native
  val STATUS_OFF_WORK: String = js.native
  
  @JSImport("symphony-api-client-node/PresenceClient", "STATUS_ON_THE_PHONE")
  @js.native
  val STATUS_ON_THE_PHONE: String = js.native
  
  @JSImport("symphony-api-client-node/PresenceClient", "STATUS_OUT_OF_OFFICE")
  @js.native
  val STATUS_OUT_OF_OFFICE: String = js.native
  
  @JSImport("symphony-api-client-node/PresenceClient", "getUserPresence")
  @js.native
  def getUserPresence(userId: Double, local: Boolean): Unit = js.native
  
  @JSImport("symphony-api-client-node/PresenceClient", "registerInterestExtUser")
  @js.native
  def registerInterestExtUser(userIds: js.Array[Double]): Unit = js.native
  
  @JSImport("symphony-api-client-node/PresenceClient", "setPresence")
  @js.native
  def setPresence(status: String): js.Promise[UserPresenceResponse] = js.native
  
  @js.native
  trait UserPresenceResponse extends StObject {
    
    var category: String = js.native
    
    var timestamp: Double = js.native
    
    var userId: Double = js.native
  }
  object UserPresenceResponse {
    
    @scala.inline
    def apply(category: String, timestamp: Double, userId: Double): UserPresenceResponse = {
      val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserPresenceResponse]
    }
    
    @scala.inline
    implicit class UserPresenceResponseMutableBuilder[Self <: UserPresenceResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
