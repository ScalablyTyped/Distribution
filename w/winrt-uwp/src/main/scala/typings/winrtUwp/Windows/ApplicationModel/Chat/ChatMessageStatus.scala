package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatMessageStatus extends StObject
/** Specifies the current status of a chat message such as draft, sent, or received. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageStatus")
@js.native
object ChatMessageStatus extends StObject {
  
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
}
