package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

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
  sealed trait cancelled extends ChatMessageStatus
  
  /** Declined */
  @js.native
  sealed trait declined extends ChatMessageStatus
  
  /** Deleted */
  @js.native
  sealed trait deleted extends ChatMessageStatus
  
  /** Draft */
  @js.native
  sealed trait draft extends ChatMessageStatus
  
  /** Recalled */
  @js.native
  sealed trait recalled extends ChatMessageStatus
  
  /** Receive download failed */
  @js.native
  sealed trait receiveDownloadFailed extends ChatMessageStatus
  
  /** Received download needed */
  @js.native
  sealed trait receiveDownloadNeeded extends ChatMessageStatus
  
  /** Receive downloading */
  @js.native
  sealed trait receiveDownloading extends ChatMessageStatus
  
  /** Receive retry needed */
  @js.native
  sealed trait receiveRetryNeeded extends ChatMessageStatus
  
  /** Received */
  @js.native
  sealed trait received extends ChatMessageStatus
  
  /** Send failed */
  @js.native
  sealed trait sendFailed extends ChatMessageStatus
  
  /** Send retry needed */
  @js.native
  sealed trait sendRetryNeeded extends ChatMessageStatus
  
  /** Sending */
  @js.native
  sealed trait sending extends ChatMessageStatus
  
  /** Sent */
  @js.native
  sealed trait sent extends ChatMessageStatus
  
  /* 11 */ val cancelled: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.cancelled with Double = js.native
  /* 10 */ val declined: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.declined with Double = js.native
  /* 9 */ val deleted: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.deleted with Double = js.native
  /* 0 */ val draft: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.draft with Double = js.native
  /* 12 */ val recalled: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.recalled with Double = js.native
  /* 7 */ val receiveDownloadFailed: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.receiveDownloadFailed with Double = js.native
  /* 6 */ val receiveDownloadNeeded: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.receiveDownloadNeeded with Double = js.native
  /* 8 */ val receiveDownloading: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.receiveDownloading with Double = js.native
  /* 13 */ val receiveRetryNeeded: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.receiveRetryNeeded with Double = js.native
  /* 5 */ val received: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.received with Double = js.native
  /* 4 */ val sendFailed: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.sendFailed with Double = js.native
  /* 3 */ val sendRetryNeeded: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.sendRetryNeeded with Double = js.native
  /* 1 */ val sending: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.sending with Double = js.native
  /* 2 */ val sent: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs.ChatMessageStatus.sent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageStatus with Double] = js.native
}

