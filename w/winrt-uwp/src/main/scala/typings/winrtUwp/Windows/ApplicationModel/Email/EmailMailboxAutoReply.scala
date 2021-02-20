package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an auto-reply message set on a mailbox. */
@js.native
trait EmailMailboxAutoReply extends StObject {
  
  /** Gets or sets a Boolean value that indicates if the auto-reply message is enabled. */
  var isEnabled: Boolean = js.native
  
  /** Gets or sets the auto-reply response text. */
  var response: String = js.native
}
object EmailMailboxAutoReply {
  
  @scala.inline
  def apply(isEnabled: Boolean, response: String): EmailMailboxAutoReply = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMailboxAutoReply]
  }
  
  @scala.inline
  implicit class EmailMailboxAutoReplyMutableBuilder[Self <: EmailMailboxAutoReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
