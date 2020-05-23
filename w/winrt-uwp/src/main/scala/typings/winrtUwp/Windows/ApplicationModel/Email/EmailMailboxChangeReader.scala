package typings.winrtUwp.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
trait EmailMailboxChangeReader extends js.Object {
  /** Accepts all changes. */
  def acceptChanges(): Unit
  /**
    * Accepts all changes through the current change.
    * @param lastChangeToAcknowledge The current change.
    */
  def acceptChangesThrough(lastChangeToAcknowledge: EmailMailboxChange): Unit
  /**
    * Reads a collection of changes.
    * @return A batch of changes.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]]
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
}

