package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Universal Integrated Circuit Card (UICC), normally called a SIM Card on a mobile broadband device. */
trait MobileBroadbandUicc extends js.Object {
  /** Gets the unique SIM Card identity on a mobile broadband device. */
  var simIccId: String
  /**
    * Asynchronously retrieves a list of mobile broadband UICC (SIM card) applications.
    * @return An asynchronous retrieval operation. On successful completion, returns an object with the results of the retrieval operation.
    */
  def getUiccAppsAsync(): IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult]
}

object MobileBroadbandUicc {
  @scala.inline
  def apply(
    getUiccAppsAsync: () => IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult],
    simIccId: String
  ): MobileBroadbandUicc = {
    val __obj = js.Dynamic.literal(getUiccAppsAsync = js.Any.fromFunction0(getUiccAppsAsync), simIccId = simIccId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUicc]
  }
}

