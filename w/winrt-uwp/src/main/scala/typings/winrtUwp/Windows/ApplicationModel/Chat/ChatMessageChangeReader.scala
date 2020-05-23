package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for reading and accepting message change revisions. */
trait ChatMessageChangeReader extends js.Object {
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
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]]
}

object ChatMessageChangeReader {
  @scala.inline
  def apply(
    acceptChanges: () => Unit,
    acceptChangesThrough: ChatMessageChange => Unit,
    readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]]
  ): ChatMessageChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = js.Any.fromFunction0(acceptChanges), acceptChangesThrough = js.Any.fromFunction1(acceptChangesThrough), readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[ChatMessageChangeReader]
  }
}

