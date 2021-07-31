package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Message received from history
  */
trait IMHistoryMessage extends StObject {
  
  /**
    * Message body
    */
  var body: String
  
  /**
    * User id - author of the message
    */
  var from: String
  
  /**
    * Message id
    */
  var id: String
  
  /**
    * Message creation time
    */
  var time: String
}
object IMHistoryMessage {
  
  @scala.inline
  def apply(body: String, from: String, id: String, time: String): IMHistoryMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMHistoryMessage]
  }
  
  @scala.inline
  implicit class IMHistoryMessageMutableBuilder[Self <: IMHistoryMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
