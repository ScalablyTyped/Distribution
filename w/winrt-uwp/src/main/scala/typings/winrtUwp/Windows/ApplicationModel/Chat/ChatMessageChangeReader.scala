package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for reading and accepting message change revisions. */
@js.native
trait ChatMessageChangeReader extends js.Object {
  /** Accepts all the changes up to and including the latest change to the message. */
  def acceptChanges(): Unit = js.native
  /**
    * Accepts all the changes up to a specified change.
    * @param lastChangeToAcknowledge The last change to acknowledge.
    */
  def acceptChangesThrough(lastChangeToAcknowledge: ChatMessageChange): Unit = js.native
  /**
    * Returns a batch list of chat message change objects from the message store’s change tracker.
    * @return An asynchronous operation that returns a list of changes.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
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
  @scala.inline
  implicit class ChatMessageChangeReaderOps[Self <: ChatMessageChangeReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceptChanges(value: () => Unit): Self = this.set("acceptChanges", js.Any.fromFunction0(value))
    @scala.inline
    def setAcceptChangesThrough(value: ChatMessageChange => Unit): Self = this.set("acceptChangesThrough", js.Any.fromFunction1(value))
    @scala.inline
    def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = this.set("readBatchAsync", js.Any.fromFunction0(value))
  }
  
}

