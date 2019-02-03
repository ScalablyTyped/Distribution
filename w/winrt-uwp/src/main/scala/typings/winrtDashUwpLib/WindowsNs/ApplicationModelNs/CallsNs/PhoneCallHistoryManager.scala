package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs for the application to get access to the PhoneCallHistoryStore . */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryManager")
@js.native
abstract class PhoneCallHistoryManager () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryManager")
@js.native
object PhoneCallHistoryManager extends js.Object {
  /**
    * Requests the PhoneCallHistoryStore associated with the calling application.
    * @param accessType The type of access requested for the PhoneCallHistoryStore object.
    * @return An asynchronous operation that returns a PhoneCallHistoryStore object on successful completion.
    */
  def requestStoreAsync(accessType: winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryStoreAccessType): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.PhoneCallHistoryStore] = js.native
}

