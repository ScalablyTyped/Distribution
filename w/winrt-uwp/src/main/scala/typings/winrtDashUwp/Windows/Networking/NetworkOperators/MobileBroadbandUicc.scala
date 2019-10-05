package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Universal Integrated Circuit Card (UICC), normally called a SIM Card on a mobile broadband device. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUicc")
@js.native
abstract class MobileBroadbandUicc () extends js.Object {
  /** Gets the unique SIM Card identity on a mobile broadband device. */
  var simIccId: String = js.native
  /**
    * Asynchronously retrieves a list of mobile broadband UICC (SIM card) applications.
    * @return An asynchronous retrieval operation. On successful completion, returns an object with the results of the retrieval operation.
    */
  def getUiccAppsAsync(): IPromiseWithIAsyncOperation[MobileBroadbandUiccAppsResult] = js.native
}

