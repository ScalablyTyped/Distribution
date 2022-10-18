package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for reading and accepting message change revisions. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChangeReader")
@js.native
open class ChatMessageChangeReader ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChangeReader {
  
  /** Accepts all the changes up to and including the latest change to the message. */
  /* CompleteClass */
  override def acceptChanges(): Unit = js.native
  
  /**
    * Accepts all the changes up to a specified change.
    * @param lastChangeToAcknowledge The last change to acknowledge.
    */
  /* CompleteClass */
  override def acceptChangesThrough(lastChangeToAcknowledge: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChange): Unit = js.native
  
  /**
    * Returns a batch list of chat message change objects from the message store’s change tracker.
    * @return An asynchronous operation that returns a list of changes.
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
}
