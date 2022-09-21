package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of the channel, relative to the client: whether
  * the channel has been `joined` or the client is
  * `notParticipating` in the channel or has been `invited` to
  * the channel.
  */
/* Rewritten from type alias, can be one of: 
  - typings.twilioChat.twilioChatStrings.unknown
  - typings.twilioChat.twilioChatStrings.notParticipating
  - typings.twilioChat.twilioChatStrings.invited
  - typings.twilioChat.twilioChatStrings.joined
*/
trait ChannelStatus extends StObject
object ChannelStatus {
  
  inline def invited: typings.twilioChat.twilioChatStrings.invited = "invited".asInstanceOf[typings.twilioChat.twilioChatStrings.invited]
  
  inline def joined: typings.twilioChat.twilioChatStrings.joined = "joined".asInstanceOf[typings.twilioChat.twilioChatStrings.joined]
  
  inline def notParticipating: typings.twilioChat.twilioChatStrings.notParticipating = "notParticipating".asInstanceOf[typings.twilioChat.twilioChatStrings.notParticipating]
  
  inline def unknown: typings.twilioChat.twilioChatStrings.unknown = "unknown".asInstanceOf[typings.twilioChat.twilioChatStrings.unknown]
}
