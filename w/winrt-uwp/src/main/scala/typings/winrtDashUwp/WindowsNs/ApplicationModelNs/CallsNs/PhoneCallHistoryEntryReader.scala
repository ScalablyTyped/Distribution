package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.CallsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the calling app to read through the phone call history entries. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryEntryReader")
@js.native
abstract class PhoneCallHistoryEntryReader () extends js.Object {
  /**
    * Returns a list of the PhoneCallHistoryEntry objects.
    * @return An asynchronous operation that returns an IVectorView upon successful completion.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

