package typings.twilioChat

import typings.twilioChat.channelMod.Channel.NotificationLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-chat/lib/synclistdescriptor", JSImport.Namespace)
@js.native
object synclistdescriptorMod extends js.Object {
  
  @js.native
  class SyncListDescriptor protected () extends js.Object {
    /**
      * @param {Object} sync list descriptor data object
      * @private
      */
    def this(descriptor: js.Any) = this()
    
    val channel: String = js.native
    
    val channel_sid: String = js.native
    
    val descriptor: js.Object = js.native
    
    val lastConsumedMessageIndex: Double = js.native
    
    val messages: String = js.native
    
    val notificationLevel: NotificationLevel = js.native
    
    val roster: String = js.native
    
    val status: String = js.native
  }
}
