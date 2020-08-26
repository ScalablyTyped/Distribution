package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
@js.native
trait EmailMailboxChangeReader extends js.Object {
  /** Accepts all changes. */
  def acceptChanges(): Unit = js.native
  /**
    * Accepts all changes through the current change.
    * @param lastChangeToAcknowledge The current change.
    */
  def acceptChangesThrough(lastChangeToAcknowledge: EmailMailboxChange): Unit = js.native
  /**
    * Reads a collection of changes.
    * @return A batch of changes.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

object EmailMailboxChangeReader {
  @scala.inline
  def apply(
    acceptChanges: () => Unit,
    acceptChangesThrough: EmailMailboxChange => Unit,
    readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]]
  ): EmailMailboxChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = js.Any.fromFunction0(acceptChanges), acceptChangesThrough = js.Any.fromFunction1(acceptChangesThrough), readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[EmailMailboxChangeReader]
  }
  @scala.inline
  implicit class EmailMailboxChangeReaderOps[Self <: EmailMailboxChangeReader] (val x: Self) extends AnyVal {
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
    def setAcceptChangesThrough(value: EmailMailboxChange => Unit): Self = this.set("acceptChangesThrough", js.Any.fromFunction1(value))
    @scala.inline
    def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = this.set("readBatchAsync", js.Any.fromFunction0(value))
  }
  
}

