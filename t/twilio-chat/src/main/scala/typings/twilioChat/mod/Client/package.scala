package typings.twilioChat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Client {
  type ConnectionState = typings.twilioNotifications.clientMod.ConnectionState
  /* Rewritten from type alias, can be one of: 
    - typings.twilioChat.twilioChatStrings.trace
    - typings.twilioChat.twilioChatStrings.debug
    - typings.twilioChat.twilioChatStrings.info
    - typings.twilioChat.twilioChatStrings.warn
    - typings.twilioChat.twilioChatStrings.error
    - typings.twilioChat.twilioChatStrings.silent
    - scala.Null
  */
  type LogLevel = typings.twilioChat.mod.Client._LogLevel | scala.Null
  type NotificationsChannelType = typings.twilioNotifications.connectorMod.ChannelType
}
