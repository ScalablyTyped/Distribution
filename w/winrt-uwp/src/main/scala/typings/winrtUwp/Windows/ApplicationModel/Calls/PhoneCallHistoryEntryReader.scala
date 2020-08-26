package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the calling app to read through the phone call history entries. */
@js.native
trait PhoneCallHistoryEntryReader extends js.Object {
  /**
    * Returns a list of the PhoneCallHistoryEntry objects.
    * @return An asynchronous operation that returns an IVectorView upon successful completion.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

object PhoneCallHistoryEntryReader {
  @scala.inline
  def apply(readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]]): PhoneCallHistoryEntryReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[PhoneCallHistoryEntryReader]
  }
  @scala.inline
  implicit class PhoneCallHistoryEntryReaderOps[Self <: PhoneCallHistoryEntryReader] (val x: Self) extends AnyVal {
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
    def setReadBatchAsync(value: () => IPromiseWithIAsyncOperation[IVectorView[_]]): Self = this.set("readBatchAsync", js.Any.fromFunction0(value))
  }
  
}

