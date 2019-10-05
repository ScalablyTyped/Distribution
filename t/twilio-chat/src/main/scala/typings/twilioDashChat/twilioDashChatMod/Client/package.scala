package typings.twilioDashChat.twilioDashChatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Client {
  import typings.twilioDashNotifications.libConnectorMod.ChannelType

  type ConnectionState = typings.twilioDashNotifications.libClientMod.ConnectionState
  /* Rewritten from type alias, can be one of: 
    - typings.twilioDashChat.twilioDashChatStrings.trace
    - typings.twilioDashChat.twilioDashChatStrings.debug
    - typings.twilioDashChat.twilioDashChatStrings.info
    - typings.twilioDashChat.twilioDashChatStrings.warn
    - typings.twilioDashChat.twilioDashChatStrings.error
    - typings.twilioDashChat.twilioDashChatStrings.silent
    - scala.Null
  */
  type LogLevel = _LogLevel | Null
  type NotificationsChannelType = ChannelType
}
