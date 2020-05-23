package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the calling app to read through the phone call history entries. */
trait PhoneCallHistoryEntryReader extends js.Object {
  /**
    * Returns a list of the PhoneCallHistoryEntry objects.
    * @return An asynchronous operation that returns an IVectorView upon successful completion.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]]
}

object PhoneCallHistoryEntryReader {
  @scala.inline
  def apply(readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]]): PhoneCallHistoryEntryReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[PhoneCallHistoryEntryReader]
  }
}

