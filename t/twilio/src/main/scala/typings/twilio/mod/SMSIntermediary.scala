package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SMSIntermediary extends StObject {
  
  var messages: SMSMessageResource
  
  var shortCodes: SMSShortCodeResource
}
object SMSIntermediary {
  
  @scala.inline
  def apply(messages: SMSMessageResource, shortCodes: SMSShortCodeResource): SMSIntermediary = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], shortCodes = shortCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSIntermediary]
  }
  
  @scala.inline
  implicit class SMSIntermediaryMutableBuilder[Self <: SMSIntermediary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: SMSMessageResource): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortCodes(value: SMSShortCodeResource): Self = StObject.set(x, "shortCodes", value.asInstanceOf[js.Any])
  }
}
