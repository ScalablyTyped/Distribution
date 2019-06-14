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
  
  /* 11 */ val cancelled: cancelled with scala.Double = js.native
  /* 10 */ val declined: declined with scala.Double = js.native
  /* 9 */ val deleted: deleted with scala.Double = js.native
  /* 0 */ val draft: draft with scala.Double = js.native
  /* 12 */ val recalled: recalled with scala.Double = js.native
  /* 7 */ val receiveDownloadFailed: receiveDownloadFailed with scala.Double = js.native
  /* 6 */ val receiveDownloadNeeded: receiveDownloadNeeded with scala.Double = js.native
  /* 8 */ val receiveDownloading: receiveDownloading with scala.Double = js.native
  /* 13 */ val receiveRetryNeeded: receiveRetryNeeded with scala.Double = js.native
  /* 5 */ val received: received with scala.Double = js.native
  /* 4 */ val sendFailed: sendFailed with scala.Double = js.native
  /* 3 */ val sendRetryNeeded: sendRetryNeeded with scala.Double = js.native
  /* 1 */ val sending: sending with scala.Double = js.native
  /* 2 */ val sent: sent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus with scala.Double
  ] = js.native
}

