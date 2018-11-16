package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatMessageStatus extends js.Object

/** Specifies the current status of a chat message such as draft, sent, or received. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageStatus")
@js.native
object ChatMessageStatus extends js.Object {
  /** Cancelled */
  @js.native
  sealed trait cancelled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Declined */
  @js.native
  sealed trait declined
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Deleted */
  @js.native
  sealed trait deleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Draft */
  @js.native
  sealed trait draft
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Recalled */
  @js.native
  sealed trait recalled
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Receive download failed */
  @js.native
  sealed trait receiveDownloadFailed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Received download needed */
  @js.native
  sealed trait receiveDownloadNeeded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Receive downloading */
  @js.native
  sealed trait receiveDownloading
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Receive retry needed */
  @js.native
  sealed trait receiveRetryNeeded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Received */
  @js.native
  sealed trait received
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Send failed */
  @js.native
  sealed trait sendFailed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Send retry needed */
  @js.native
  sealed trait sendRetryNeeded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Sending */
  @js.native
  sealed trait sending
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  /** Sent */
  @js.native
  sealed trait sent
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus
  
  val cancelled: cancelled with java.lang.String = js.native
  val declined: declined with java.lang.String = js.native
  val deleted: deleted with java.lang.String = js.native
  val draft: draft with java.lang.String = js.native
  val recalled: recalled with java.lang.String = js.native
  val receiveDownloadFailed: receiveDownloadFailed with java.lang.String = js.native
  val receiveDownloadNeeded: receiveDownloadNeeded with java.lang.String = js.native
  val receiveDownloading: receiveDownloading with java.lang.String = js.native
  val receiveRetryNeeded: receiveRetryNeeded with java.lang.String = js.native
  val received: received with java.lang.String = js.native
  val sendFailed: sendFailed with java.lang.String = js.native
  val sendRetryNeeded: sendRetryNeeded with java.lang.String = js.native
  val sending: sending with java.lang.String = js.native
  val sent: sent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus with java.lang.String
  ] = js.native
}

