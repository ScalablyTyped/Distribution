package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChatMessageStatus with Double] = js.native
  /* 11 */ @js.native
  object cancelled extends TopLevel[cancelled with Double]
  
  /* 10 */ @js.native
  object declined extends TopLevel[declined with Double]
  
  /* 9 */ @js.native
  object deleted extends TopLevel[deleted with Double]
  
  /* 0 */ @js.native
  object draft extends TopLevel[draft with Double]
  
  /* 12 */ @js.native
  object recalled extends TopLevel[recalled with Double]
  
  /* 7 */ @js.native
  object receiveDownloadFailed extends TopLevel[receiveDownloadFailed with Double]
  
  /* 6 */ @js.native
  object receiveDownloadNeeded extends TopLevel[receiveDownloadNeeded with Double]
  
  /* 8 */ @js.native
  object receiveDownloading extends TopLevel[receiveDownloading with Double]
  
  /* 13 */ @js.native
  object receiveRetryNeeded extends TopLevel[receiveRetryNeeded with Double]
  
  /* 5 */ @js.native
  object received extends TopLevel[received with Double]
  
  /* 4 */ @js.native
  object sendFailed extends TopLevel[sendFailed with Double]
  
  /* 3 */ @js.native
  object sendRetryNeeded extends TopLevel[sendRetryNeeded with Double]
  
  /* 1 */ @js.native
  object sending extends TopLevel[sending with Double]
  
  /* 2 */ @js.native
  object sent extends TopLevel[sent with Double]
  
}

