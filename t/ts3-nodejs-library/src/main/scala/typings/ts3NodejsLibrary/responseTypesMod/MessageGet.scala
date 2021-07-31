package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageGet
  extends StObject
     with ResponseEntry {
  
  var cluid: String
  
  var message: String
  
  var msgid: String
  
  var subject: String
  
  var timestamp: Double
}
object MessageGet {
  
  @scala.inline
  def apply(cluid: String, message: String, msgid: String, subject: String, timestamp: Double): MessageGet = {
    val __obj = js.Dynamic.literal(cluid = cluid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], msgid = msgid.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageGet]
  }
  
  @scala.inline
  implicit class MessageGetMutableBuilder[Self <: MessageGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluid(value: String): Self = StObject.set(x, "cluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsgid(value: String): Self = StObject.set(x, "msgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
