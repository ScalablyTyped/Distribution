package typings
package twilioDashChatLib.twilioDashChatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ClientNs {
  type ConnectionState = twilioDashNotificationsLib.libClientMod.ConnectionState
  /* Rewritten from type alias, can be one of: 
    - twilioDashChatLib.twilioDashChatLibStrings.trace
    - twilioDashChatLib.twilioDashChatLibStrings.debug
    - twilioDashChatLib.twilioDashChatLibStrings.info
    - twilioDashChatLib.twilioDashChatLibStrings.warn
    - twilioDashChatLib.twilioDashChatLibStrings.error
    - twilioDashChatLib.twilioDashChatLibStrings.silent
    - scala.Null
  */
  type LogLevel = _LogLevel | scala.Null
  type NotificationsChannelType = twilioDashNotificationsLib.libConnectorMod.ChannelType
}
