package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatMessageChangeType extends js.Object

/** Specifies the type of change made to a chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChangeType")
@js.native
object ChatMessageChangeType extends js.Object {
  /** Change tracking lost. */
  @js.native
  sealed trait changeTrackingLost
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageChangeType
  
  /** Message created. */
  @js.native
  sealed trait messageCreated
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageChangeType
  
  /** Message deleted. */
  @js.native
  sealed trait messageDeleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageChangeType
  
  /** Message modified. */
  @js.native
  sealed trait messageModified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageChangeType
  
  val changeTrackingLost: changeTrackingLost with java.lang.String = js.native
  val messageCreated: messageCreated with java.lang.String = js.native
  val messageDeleted: messageDeleted with java.lang.String = js.native
  val messageModified: messageModified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageChangeType with java.lang.String
  ] = js.native
}

