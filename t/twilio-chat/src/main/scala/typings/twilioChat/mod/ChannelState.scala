package typings.twilioChat.mod

import typings.twilioChat.twilioChatStrings.active
import typings.twilioChat.twilioChatStrings.closed
import typings.twilioChat.twilioChatStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The conversational state of the channel.
  */
trait ChannelState extends StObject {
  
  /**
    * The current state.
    */
  var current: active | inactive | closed
  
  /**
    * Date at which the latest channel state update happened.
    */
  var dateUpdated: js.Date
}
object ChannelState {
  
  inline def apply(current: active | inactive | closed, dateUpdated: js.Date): ChannelState = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelState] (val x: Self) extends AnyVal {
    
    inline def setCurrent(value: active | inactive | closed): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
  }
}
