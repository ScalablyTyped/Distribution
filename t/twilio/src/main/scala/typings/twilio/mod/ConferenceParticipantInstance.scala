package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConferenceParticipantInstance
  extends StObject
     with InstanceResource {
  
  def kick(args: js.Any): Promise[js.Any]
  def kick(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def kick(callback: RequestCallback): Promise[js.Any]
  @JSName("kick")
  var kick_Original: RestMethod
}
object ConferenceParticipantInstance {
  
  inline def apply(delete: RestMethod, get: RestMethod, kick: RestMethod, post: RestMethod, update: RestMethod): ConferenceParticipantInstance = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], kick = kick.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceParticipantInstance]
  }
  
  extension [Self <: ConferenceParticipantInstance](x: Self) {
    
    inline def setKick(value: RestMethod): Self = StObject.set(x, "kick", value.asInstanceOf[js.Any])
  }
}
