package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChatMessageStatus extends StObject
/** Specifies the current status of a chat message such as draft, sent, or received. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageStatus")
@js.native
object ChatMessageStatus extends StObject {
  
  /** Cancelled */
  @js.native
  sealed trait cancelled
    extends StObject
       with ChatMessageStatus
  
  /** Declined */
  @js.native
  sealed trait declined
    extends StObject
       with ChatMessageStatus
  
  /** Deleted */
  @js.native
  sealed trait deleted
    extends StObject
       with ChatMessageStatus
  
  /** Draft */
  @js.native
  sealed trait draft
    extends StObject
       with ChatMessageStatus
  
  /** Recalled */
  @js.native
  sealed trait recalled
    extends StObject
       with ChatMessageStatus
  
  /** Receive download failed */
  @js.native
  sealed trait receiveDownloadFailed
    extends StObject
       with ChatMessageStatus
  
  /** Received download needed */
  @js.native
  sealed trait receiveDownloadNeeded
    extends StObject
       with ChatMessageStatus
  
  /** Receive downloading */
  @js.native
  sealed trait receiveDownloading
    extends StObject
       with ChatMessageStatus
  
  /** Receive retry needed */
  @js.native
  sealed trait receiveRetryNeeded
    extends StObject
       with ChatMessageStatus
  
  /** Received */
  @js.native
  sealed trait received
    extends StObject
       with ChatMessageStatus
  
  /** Send failed */
  @js.native
  sealed trait sendFailed
    extends StObject
       with ChatMessageStatus
  
  /** Send retry needed */
  @js.native
  sealed trait sendRetryNeeded
    extends StObject
       with ChatMessageStatus
  
  /** Sending */
  @js.native
  sealed trait sending
    extends StObject
       with ChatMessageStatus
  
  /** Sent */
  @js.native
  sealed trait sent
    extends StObject
       with ChatMessageStatus
}
