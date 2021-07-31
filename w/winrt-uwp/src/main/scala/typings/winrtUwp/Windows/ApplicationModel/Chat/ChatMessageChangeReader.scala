package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for reading and accepting message change revisions. */
trait ChatMessageChangeReader extends StObject {
  
  /** Accepts all the changes up to and including the latest change to the message. */
  def acceptChanges(): Unit
  
  /**
    * Accepts all the changes up to a specified change.
    * @param lastChangeToAcknowledge The last change to acknowledge.
    */
  def acceptChangesThrough(lastChangeToAcknowledge: ChatMessageChange): Unit
  
  /**
    * Returns a batch list of chat message change objects from the message store’s change tracker.
    * @return An asynchronous operation that returns a list of changes.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[js.Any]]
}
object ChatMessageChangeReader {
  
  @scala.inline
  def apply(
    acceptChanges: () => Unit,
    acceptChangesThrough: ChatMessageChange => Unit,
    readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[js.Any]]
  ): ChatMessageChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = js.Any.fromFunction0(acceptChanges), acceptChangesThrough = js.Any.fromFunction1(acceptChangesThrough), readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[ChatMessageChangeReader]
  }
  
  @scala.inline
  implicit class ChatMessageChangeReaderMutableBuilder[Self <: ChatMessageChangeReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptChanges(value: () => Unit): Self = StObject.set(x, "acceptChanges", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAcceptChangesThrough(value: ChatMessageChange => Unit): Self = StObject.set(x, "acceptChangesThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[js.Any]]): Self = StObject.set(x, "readBatchAsync", js.Any.fromFunction0(value))
  }
}
