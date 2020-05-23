package typings.winrtUwp.global.Windows.ApplicationModel.Calls

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the calling app to read through the phone call history entries. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryReader")
@js.native
abstract class PhoneCallHistoryEntryReader ()
  extends typings.winrtUwp.Windows.ApplicationModel.Calls.PhoneCallHistoryEntryReader {
  /**
    * Returns a list of the PhoneCallHistoryEntry objects.
    * @return An asynchronous operation that returns an IVectorView upon successful completion.
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

